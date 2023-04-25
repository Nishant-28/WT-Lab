import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonCounterApplet extends JFrame implements ActionListener {
    JButton counterButton;
    JLabel countLabel;
    int count;

    public ButtonCounterApplet() {
        counterButton = new JButton("Click me!");
        countLabel = new JLabel("Count: 0");
        countLabel.setHorizontalAlignment(JLabel.CENTER);

        setLayout(new BorderLayout());
        add(counterButton, BorderLayout.CENTER);
        add(countLabel, BorderLayout.SOUTH);

        counterButton.addActionListener(this);

        setTitle("Button Counter Applet");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        countLabel.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new ButtonCounterApplet();
    }
}