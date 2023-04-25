import javax.swing.*;
import java.awt.*;

public class ColoredSmileyApplet extends JFrame {
    public ColoredSmileyApplet() {
        // Set up the GUI components
        JPanel smileyPanel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                // Draw the smiley face
                g.setColor(Color.YELLOW);
                g.fillOval(50, 50, 200, 200);
                
                // Draw the eyes
                g.setColor(Color.BLACK);
                g.fillOval(90, 100, 30, 30);
                g.fillOval(180, 100, 30, 30);
                
                // Draw the mouth
                g.setColor(Color.RED);
                g.fillArc(85, 130, 130, 100, 180, 180);
            }
        };
        setLayout(new BorderLayout());
        add(smileyPanel, BorderLayout.CENTER);
        
        // Set window properties
        setTitle("Colored Smiley Applet");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColoredSmileyApplet();
    }
}