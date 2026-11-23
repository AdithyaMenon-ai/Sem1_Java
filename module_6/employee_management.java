import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class EmployeeManagement extends JFrame {

    JTextField id, name, dept, salary;
    JTable table;

    String url = "jdbc:mysql://localhost:3306/company_db";
    String user = "root";
    String password = "your_password";

    public EmployeeManagement() {

        setTitle("Employee Management System");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        id = new JTextField();
        name = new JTextField();
        dept = new JTextField();
        salary = new JTextField();

        panel.add(new JLabel("Employee ID:"));
        panel.add(id);

        panel.add(new JLabel("Name:"));
        panel.add(name);

        panel.add(new JLabel("Department:"));
        panel.add(dept);

        panel.add(new JLabel("Salary:"));
        panel.add(salary);

        JButton submit = new JButton("Submit");
        JButton view = new JButton("View All Employees");

        panel.add(submit);
        panel.add(view);

        add(panel, BorderLayout.NORTH);

        table = new JTable();
        add(new JScrollPane(table), BorderLayout.CENTER);

        submit.addActionListener(e -> addEmployee());
        view.addActionListener(e -> viewEmployees());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    void addEmployee() {

        String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";

        try (
            Connection con = DriverManager.getConnection(
                url, user, password
            );
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, Integer.parseInt(id.getText()));
            ps.setString(2, name.getText());
            ps.setString(3, dept.getText());
            ps.setBigDecimal(
                4, new java.math.BigDecimal(salary.getText())
            );

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Employee Added Successfully!"
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this, e.getMessage()
            );
        }
    }

    void viewEmployees() {

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Employee ID");
        model.addColumn("Name");
        model.addColumn("Department");
        model.addColumn("Salary");

        try (
            Connection con = DriverManager.getConnection(
                url, user, password
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                "SELECT * FROM employees"
            )
        ) {

            while (rs.next()) {

                model.addRow(new Object[]{
                    rs.getInt("emp_id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getBigDecimal("salary")
                });
            }

            table.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this, e.getMessage()
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            () -> new EmployeeManagement()
        );
    }
}
