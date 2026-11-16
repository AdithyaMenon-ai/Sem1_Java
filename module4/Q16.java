import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Listener");

        JPanel p = new JPanel();

        p.setBackground(Color.WHITE);

        p.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                p.setBackground(Color.GREEN);
            }

            public void mouseExited(MouseEvent e) {
                p.setBackground(Color.WHITE);
            }
        });

        f.add(p);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
