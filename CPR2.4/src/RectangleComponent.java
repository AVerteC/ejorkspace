import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent 
{
    public void paintComponent(Graphics g)
    {
        // recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
    
        //Construct a rectangle and draw it
        Rectangle box = new Rectangle(100, 100, 50, 50);
        // before
        System.out.println(box);
        g2.draw(box);
        box.grow(25,25);
        box.translate(25, 25);
        System.out.println(box);
        g2.draw(box);
        
    
    }

    
}
