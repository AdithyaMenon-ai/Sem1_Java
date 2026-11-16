import java.awt.*;
import java.awt.event.*;

class WindowDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Window Adapter");

        f.setSize(400, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
