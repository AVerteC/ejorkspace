//import java.awt.Graphics2D;
//import java.awt.Rectangle;
import javax.swing.JFrame;

public class RectangleViewer
 {
 public static void main(String[] args)
 {
     JFrame frame = new JFrame();
    
     frame.setSize(300, 400);
     frame.setTitle("One rectangle");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     RectangleComponent component = new RectangleComponent();
     frame.add(component);
     

     frame.setVisible(true);
  
 }
 }
