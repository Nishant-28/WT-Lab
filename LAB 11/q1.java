import java.awt.*;

public class q1 {

    public static void main(String[] args) {
        Frame frame = new Frame("User Information");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 1));

        String rollNo = "21051488";
        String name = "Nishant";
        String branch = "Computer Science";
        String section = "CSE 14";

        panel.add(new Label("Roll No.: " + rollNo));
        panel.add(new Label("Name: " + name));
        panel.add(new Label("Branch: " + branch));
        panel.add(new Label("Section: " + section));

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}