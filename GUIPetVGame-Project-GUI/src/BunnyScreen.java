
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;


public class BunnyScreen extends JPanel
{
    private Image img;
    
    public BunnyScreen()
    {
        // Loads the background image and stores in img object.
        this.img = Toolkit.getDefaultToolkit().createImage("rabbit.jpg");
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);      
        g.drawImage(this.img, 0, 0, null);
    }
}
