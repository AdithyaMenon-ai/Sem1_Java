import java.awt.*;

class AWTMenu {
    public static void main(String[] args) {
        Frame f = new Frame("Menu Example");

        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);
        f.setSize(400, 300);
        f.setVisible(true);
    }
}
