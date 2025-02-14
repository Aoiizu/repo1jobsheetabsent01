import java.awt.*;
import javax.swing.*;

public class isthis extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ryan Gosling Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new isthis());
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Head
        g.setColor(new Color(255, 224, 189));
        g.fillOval(100, 50, 200, 250);

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(150, 120, 30, 15);
        g.fillOval(220, 120, 30, 15);

        g.setColor(Color.BLACK);
        g.fillOval(160, 125, 10, 10);
        g.fillOval(230, 125, 10, 10);

        // Nose
        g.setColor(new Color(255, 204, 153));
        g.fillOval(190, 160, 20, 40);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(160, 200, 80, 40, 0, -180);

        // Hair
        g.setColor(new Color(139, 69, 19));
        g.fillRect(100, 40, 200, 30);
        g.fillOval(90, 50, 220, 50);
    }
}

