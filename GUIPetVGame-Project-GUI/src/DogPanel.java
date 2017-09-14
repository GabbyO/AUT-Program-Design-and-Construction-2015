import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.ABORT;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;


public class DogPanel extends JPanel implements ActionListener
{
    protected JButton dogFood, catFood, bunnyFood, noFood;
    protected JButton dogToy, catToy, bunnyToy, pet, noToy;
    protected JLabel labelHth, labelHap;
    
    protected JRadioButton feed, play;
    private ButtonGroup bg;
    protected JProgressBar health, happiness;
    private int max,min;
    private int hthOrignal, hapOrignal;
    protected JPanel dog, JButtonPanel, JProgPanel;
    private GridLayout gridLayout;
    public int valueHth, valueHap;
            
    public boolean gameOver;
    
    public DogPanel()
    {
        gridLayout = new GridLayout(0,2);
        
        max = 150;
        min = 0;
        hthOrignal = 50;
        hapOrignal = 50;
        
        
        dog = new DogScreen();
        JButtonPanel = new JPanel();
        
        JButtonPanel.setLayout(gridLayout);
        
        JButtonPanel.setPreferredSize(new Dimension(175, 100));
        dog.setPreferredSize(new Dimension(600, 600));
        
        feed = new JRadioButton("Feed");
        play = new JRadioButton("Play");
        
        bg = new ButtonGroup();
        
        labelHth = new JLabel("Health: ");
        labelHap = new JLabel("Happiness: ");
        
        health = new JProgressBar();
        happiness = new JProgressBar();
        
        health.setMaximum(max);
        health.setMinimum(min);
        happiness.setMaximum(max);
        happiness.setMinimum(min);
        
        health.setValue(hthOrignal);
        happiness.setValue(hapOrignal);
        
        valueHth = health.getValue();
        valueHap = happiness.getValue();
        
        health.setStringPainted(true);
        happiness.setStringPainted(true);
        health.setForeground(Color.GREEN);
        happiness.setForeground(Color.GREEN);
        
        bg.add(feed);
        bg.add(play);

        dog.add(labelHth);
        dog.add(health);
        dog.add(labelHap);
        dog.add(happiness);
        
        dog.add(feed);
        dog.add(play);
        
        dogFood = new JButton("Dog food");
        catFood = new JButton("Cat food");
        bunnyFood = new JButton("Bunny food");
        noFood = new JButton("No food");
        
        dogToy = new JButton("Dog Toy");
        catToy = new JButton("Cat Toy");
        bunnyToy = new JButton("Bunny Toy");
        noToy = new JButton("No Toy");
        pet = new JButton("Petting");
        
        feed.addActionListener(this);
        play.addActionListener(this);
        
        dogFood.addActionListener(this);
        catFood.addActionListener(this);
        bunnyFood.addActionListener(this);
        noFood.addActionListener(this);
        dogToy.addActionListener(this);
        catToy.addActionListener(this);
        bunnyToy.addActionListener(this);
        noToy.addActionListener(this);
        pet.addActionListener(this);
        
        add(dog); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {       
        if(e.getSource().equals(feed))
        {
            JButtonPanel.remove(dogToy);
            JButtonPanel.remove(catToy);
            JButtonPanel.remove(bunnyToy);
            JButtonPanel.remove(noToy);
            JButtonPanel.remove(pet);
 
            JButtonPanel.add(dogFood);
            JButtonPanel.add(catFood);
            JButtonPanel.add(bunnyFood);
            JButtonPanel.add(noFood);
            
            dog.add(JButtonPanel);
            
            dog.revalidate();
            dog.repaint();
        }
        
        if(e.getSource().equals(play))
        {
            JButtonPanel.remove(dogFood);
            JButtonPanel.remove(catFood);
            JButtonPanel.remove(bunnyFood);
            JButtonPanel.remove(noFood);
            
            JButtonPanel.add(dogToy);
            JButtonPanel.add(catToy);
            JButtonPanel.add(bunnyToy);
            JButtonPanel.add(noToy);
            JButtonPanel.add(pet);
            
            dog.add(JButtonPanel);
            
            dog.revalidate();
            dog.repaint();
        }
        
        if(e.getSource().equals(dogToy))
        {
            this.setHthOrignal(this.getHthOrignal() + 5);
            this.setHapOrignal(this.getHapOrignal() + 15);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());   
            
            this.valueHth = health.getValue();
            this.valueHap = happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(catToy))
        {
            this.setHthOrignal(this.getHthOrignal() - 5);
            this.setHapOrignal(this.getHapOrignal() - 15);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(bunnyToy))
        {
            this.setHthOrignal(this.getHthOrignal() - 5);
            this.setHapOrignal(this.getHapOrignal() - 15);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(pet))
        {
            this.setHthOrignal(this.getHthOrignal() + 5);
            this.setHapOrignal(this.getHapOrignal() + 15);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(noToy))
        {
            this.setHthOrignal(this.getHthOrignal() - 5);
            this.setHapOrignal(this.getHapOrignal() - 15);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        
        if(e.getSource().equals(dogFood))
        {
            this.setHthOrignal(this.getHthOrignal() + 20);
            this.setHapOrignal(this.getHapOrignal() + 5);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(catFood))
        {
            this.setHthOrignal(this.getHthOrignal() - 15);
            this.setHapOrignal(this.getHapOrignal() - 5);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(bunnyFood))
        {
            this.setHthOrignal(this.getHthOrignal() - 15);
            this.setHapOrignal(this.getHapOrignal() - 5);
            
            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
        
        if(e.getSource().equals(noFood))
        {
            this.setHthOrignal(this.getHthOrignal() - 20);
            this.setHapOrignal(this.getHapOrignal() - 5);

            health.setValue(this.getHthOrignal());
            happiness.setValue(this.getHapOrignal());
            
            this.valueHth = this.health.getValue();
            this.valueHap = this.happiness.getValue();
            
            if(this.valueHth <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet just died.", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                
                System.exit(0);
            }

            if(this.valueHap <= 0)
            {
                this.gameOver = true;
                JOptionPane.showMessageDialog(this, "Game Over! Your pet ran away!", 
                        "Game Over!", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        }
    }


    public int getHthOrignal() 
    {
        return this.hthOrignal;
    }

    public void setHthOrignal(int hthOrignal) 
    {
        this.hthOrignal = hthOrignal;
    }

    public int getHapOrignal() 
    {
        return this.hapOrignal;
    }

    public void setHapOrignal(int hapOrignal) 
    {
        this.hapOrignal = hapOrignal;
    }
}