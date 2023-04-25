import javax.swing.*;
import java.awt.*;

public class HouseApplet extends JFrame {
    
    public HouseApplet() {
        setTitle("House Applet");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        
        g2.setColor(Color.red);
        Polygon roof = new Polygon();
        roof.addPoint(150, 100);
        roof.addPoint(250, 50);
        roof.addPoint(350, 100);
        g2.fillPolygon(roof);
        
        
        g2.setColor(Color.gray);
        Rectangle walls = new Rectangle(150, 100, 200, 200);
        g2.fill(walls);
        
        
        g2.setColor(Color.blue);
        Rectangle door = new Rectangle(220, 220, 60, 80);
        g2.fill(door);
        
        
        g2.setColor(Color.white);
        Rectangle window1 = new Rectangle(170, 150, 50, 50);
        g2.fill(window1);
        Rectangle window2 = new Rectangle(280, 150, 50, 50);
        g2.fill(window2);
    }
    
    public static void main(String[] args) {
        HouseApplet applet = new HouseApplet();
    }
}
