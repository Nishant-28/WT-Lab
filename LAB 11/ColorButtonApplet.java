import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtonApplet extends JFrame implements ActionListener {
    JButton redButton, blueButton;
    JLabel messageLabel;

    public ColorButtonApplet() {

        redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);
        
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        
        setTitle("Color Button Applet");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("You have pressed RED");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == blueButton) {
            messageLabel.setText("You have pressed BLUE");
            messageLabel.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorButtonApplet();
    }
}
