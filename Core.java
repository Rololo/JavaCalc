import java.awt.*; 
import javax.swing.*;

public class Core extends JFrame
{   
    public Core()
    {
        JFrame frame = new JFrame(); //create frame to store panels
        frame.setTitle("Calculator"); //set title of window
        setLookAndFeel(); //see method below constructor
        frame.setSize(200, 200); //sets window size at 200x200 pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will exit program
        frame.setResizable(false); //doesn't allow user to change size of window
        
        JPanel mainPanel = new JPanel(); //creates panel for subpanels to reside in
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        frame.add(mainPanel); //adds the main panel to the frame
        
        JPanel inputPane = new JPanel(); //subpanel creation for display and buttons
        JPanel buttonPane = new JPanel();
        
        inputPane.setLayout(new FlowLayout()); //set layout for display and buttons
        buttonPane.setLayout(new GridLayout(4,4));
        
        mainPanel.add(inputPane); //adds subpanels to main panel
        mainPanel.add(buttonPane);
        
        JTextField display = new JTextField(15); //display for commands
        
        //initialize buttons to be used
        JButton one = new JButton("1"); 
        JButton two = new JButton("2");
        JButton three = new JButton("3"); 
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton times = new JButton("*");
        JButton division = new JButton("/");
        JButton clear = new JButton("C");
        JButton equals = new JButton("=");
        
        inputPane.add(display); //places textfield onto the top subpanel
        
        //add all buttons to bottom subpanel
        buttonPane.add(seven);
        buttonPane.add(eight);
        buttonPane.add(nine);
        buttonPane.add(plus);
        buttonPane.add(four);
        buttonPane.add(five);
        buttonPane.add(six);
        buttonPane.add(minus);
        buttonPane.add(one);
        buttonPane.add(two);
        buttonPane.add(three);
        buttonPane.add(times);
        buttonPane.add(zero);
        buttonPane.add(clear); 
        buttonPane.add(equals);
        buttonPane.add(division);
        
        JButton[] numButtons = {zero, one, two, three, four, five, six, seven, eight, nine};
        JButton[] actButtons = {plus, minus, times, division}; 
        char[] symbols = {'+', '-', '*', '/'};
        
        for(int i = 0; i < numButtons.length; i++)
        {
            Actions.numberActions(numButtons[i], i, display);
        }
        
        for(int j = 0; j < actButtons.length; j++)
        {
            Actions.operatorActions(actButtons[j], symbols[j], display);
        }
        
        Actions.clear(clear, display);
        Actions.equals(equals, display);
        
        frame.setVisible(true); //allow window to be seen
    }
    
    private void setLookAndFeel() //chooses theme for calculator
    {
        try
        {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        
        catch (Exception e)
        {
            //Popup window to be displayed later
        }
    }
    
    public static void main(String[] args)
    {
        Core window = new Core(); //creates object that calls class constructor
    }
}
