import javax.swing.*;
import java.awt.event.*;

class SwingButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");

        JButton b = new JButton("Click Me");
        JLabel l = new JLabel("Welcome");

        b.setBounds(100, 50, 120, 30);
        l.setBounds(100, 100, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button Pressed");
            }
        });

        f.add(b);
        f.add(l);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
