import java.awt.*;

class AWTFrame {
    public static void main(String[] args) {
        Frame f = new Frame("Java GUI");

        Label l = new Label("Welcome to Java GUI");

        f.add(l);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
