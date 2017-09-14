import java.sql.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GameFrame extends JFrame implements ActionListener
{
    private static GameFrame bt;
    protected JPanel startPanel, gamePanel;
    private JButton start, startExit, gameExit, 
            dog, cat, bunny;
    
    String url = "jdbc:derby://localhost:1527/PetName";
    String username ="vyj8904";
    String password = "Blue11";
    
    GridLayout gridLayout;
    JButton enter;
    JTextField nameEnter;
    JLabel name, newName;
    JPanel newPanel;
    
    JPanel parentPanel;
    DogPanel dogPanel;
    CatPanel catPanel;
    BunnyPanel bunnyPanel;
    
    JPanel buttonP;
    
    public GameFrame()
    {
        //Set The Game Size
        setSize(new Dimension(600, 700));
        
        //Panels
        dogPanel = new DogPanel();
        catPanel = new CatPanel();
        bunnyPanel = new BunnyPanel();
        parentPanel = new JPanel();
        startPanel = new StartScreen();
        gamePanel = new GameScreen();
        buttonP = new JPanel();
        
        //Panels Size
        startPanel.setPreferredSize(new Dimension(600, 700));
        dogPanel.setPreferredSize(new Dimension(600, 600));
        catPanel.setPreferredSize(new Dimension(600, 600));
        bunnyPanel.setPreferredSize(new Dimension(600, 600));
        parentPanel.setPreferredSize(new Dimension(600, 600));
        gamePanel.setPreferredSize(new Dimension(600, 600));
        
        //Buttons
        start = new JButton("Start");
        startExit = new JButton("Exit");
        gameExit = new JButton("Exit");
        dog = new JButton("Dog");
        cat = new JButton("Cat");
        bunny = new JButton("Bunny");
        
        //Add Buttons
        startPanel.add(start);
        startPanel.add(startExit);

        //Create a Layout for buttonPanel
        GridLayout gl = new GridLayout(1,0);
        buttonP.setLayout(gl);
        
        //Add buttons to buttonPanel
        buttonP.add(dog);
        buttonP.add(cat);
        buttonP.add(bunny);
        buttonP.add(gameExit);
        
        //Add StartPanel to ParentPanel:
        //Add ButtonPanel to StartPanel:
        gamePanel.add(buttonP);
        parentPanel.add(startPanel, BorderLayout.CENTER);
       
        //Set Action Listener
        start.addActionListener(this);
        startExit.addActionListener(this);
        gameExit.addActionListener(this);
        dog.addActionListener(this);
        cat.addActionListener(this);
        bunny.addActionListener(this);

        //Create a new Panel and set size:
        newPanel = new JPanel();
        newPanel.setSize(new Dimension(0, 10));
        
        //Create a new layout for newPanel
        gridLayout = new GridLayout(0,1);
        newPanel.setLayout(gridLayout);
        
        //Create new button, JTextField and labels
        enter = new JButton("Enter");
        nameEnter = new JTextField("Enter your pet name here", 20);
        name = new JLabel("Name:");
        newName = new JLabel();
        
        //Add to newPanel
        newPanel.add(name);
        newPanel.add(nameEnter);
        newPanel.add(enter);
        
        //Set Action Listener
        enter.addActionListener(this);
        
        //Add parentPanel
        add(parentPanel);
        
        repaint();
    }
    
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g); 
        repaint();
    }
    
    public static void main(String[] args)
    {
        bt = new GameFrame();
        bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.setVisible(true);
        bt.setResizable(false);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenDimension = tk.getScreenSize();
        Dimension frameDimension = bt.getSize();
        bt.setLocation((screenDimension.width-frameDimension.width)/2,
           (screenDimension.height-frameDimension.height)/2);
        
        bt.paint(bt.getGraphics());
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(startExit))
        {
            System.exit(0);
        }
        
        if(e.getSource().equals(gameExit))
        {
            System.exit(0);
        }
        
        if(e.getSource().equals(start))
        {
            parentPanel.remove(startPanel);
            add(newPanel, BorderLayout.NORTH);
            parentPanel.add(gamePanel, BorderLayout.SOUTH);
            gamePanel.revalidate();
            gamePanel.repaint();
          
            cat.setEnabled(true);
            dog.setEnabled(true);
            bunny.setEnabled(true);
            
            parentPanel.revalidate();
            parentPanel.repaint();
        }
        
        if(!newName.getText().isEmpty())
        {
            if(e.getSource().equals(dog))
            {
                gamePanel.add(dogPanel);

                cat.setEnabled(false);
                bunny.setEnabled(false);

                gamePanel.revalidate();
                gamePanel.repaint();

            }

            if(e.getSource().equals(cat))
            { 
                gamePanel.add(catPanel);
                dog.setEnabled(false);
                bunny.setEnabled(false);

                gamePanel.revalidate();
                gamePanel.repaint();
                
            }

            if(e.getSource().equals(bunny))
            {   
                gamePanel.add(bunnyPanel);
                cat.setEnabled(false);
                dog.setEnabled(false);

                gamePanel.revalidate();
                gamePanel.repaint();
            }
        }
        
        if(e.getSource().equals(enter))
        {
            if(!"Enter your pet name here".equals(nameEnter.getText()))
            {
                if(!nameEnter.getText().isEmpty())
                {
                newName = new JLabel("Your pet's name is: " 
                        + nameEnter.getText());
                
                newPanel.add(newName);

                nameEnter.setEnabled(false);
                enter.setEnabled(false);

                newPanel.revalidate();
                newPanel.repaint();
                gamePanel.revalidate();
                gamePanel.repaint();
                
                try 
                {    
                    Connection conn = DriverManager.getConnection(url, username, password);
                    Statement stat = conn.createStatement();
                    String query = "INSERT INTO PET(PETNAME) VALUES ('" + nameEnter.getText() + "'')";
                    
                    stat.executeQuery(url);
                    stat.executeQuery(query);
                    JOptionPane.showMessageDialog(null, nameEnter.getText() + " Have been entered");
                    
                } catch (SQLException ex) 
                {
                    Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        }
    }
}
