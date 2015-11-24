import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Actions
{
    public static void numberActions(JButton button, int count, JTextField display)
    {
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                display.setText(display.getText() + count);
            }
        });
    }
    
    public static void operatorActions(JButton operator, char symbol, JTextField display)
    {
        operator.addActionListener(new ActionListener()
        {
           @Override
           public void actionPerformed(ActionEvent f)
           {
               display.setText(display.getText() + symbol);
           }
        });
    }
    
    public static void clear(JButton clear, JTextField display)
    {
        clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent g)
            {
                display.setText("");
            }
        });
    }
    
    public static void equals(JButton equals, JTextField display)
    {
        equals.addActionListener(new ActionListener()
        {
           @Override
           public void actionPerformed(ActionEvent h)
           {
               String line = display.getText();
               
               int plusIndex = line.indexOf("+");
               
               String lineOne = line.substring(0, plusIndex);
               String lineTwo = line.substring(plusIndex + 1);
               String lineFin; 
               
               int parseOne = Integer.parseInt(lineOne);
               int parseTwo = Integer.parseInt(lineTwo);
               int parseAns = parseOne + parseTwo; 
               
               lineFin = String.valueOf(parseAns);
               display.setText(lineFin);
               
           }
        });
    }
}
