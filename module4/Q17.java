import javax.swing.*;
import java.awt.event.*;

class KeyDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Key Listener");

        JLabel l = new JLabel("Press any key");

        f.add(l);

        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                l.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setFocusable(true);
        f.requestFocus();
    }
}
