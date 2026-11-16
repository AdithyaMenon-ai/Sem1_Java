import javax.swing.*;
import java.awt.event.*;

class ActionDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Action Listener");

        JButton b = new JButton("Click Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello User");
            }
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
