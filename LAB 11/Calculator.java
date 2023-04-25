import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JApplet implements ActionListener {
    private JTextField input1, input2, result;

    public void init() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        input1 = new JTextField(10);
        input2 = new JTextField(10);
        result = new JTextField(10);

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Sub");

        addButton.addActionListener(this);
        subButton.addActionListener(this);

        contentPane.add(new JLabel("Input 1:"));
        contentPane.add(input1);
        contentPane.add(new JLabel("Input 2:"));
        contentPane.add(input2);
        contentPane.add(addButton);
        contentPane.add(subButton);
        contentPane.add(new JLabel("Result:"));
        contentPane.add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            int res = 0;

            if (e.getActionCommand().equals("Add")) {
                res = num1 + num2;
            } else if (e.getActionCommand().equals("Sub")) {
                res = num1 - num2;
            }

            result.setText(Integer.toString(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
    }

    public static void main(String[] args) {
        Calculator applet = new Calculator();
        applet.init();

        JFrame frame = new JFrame("Calculator Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }
}