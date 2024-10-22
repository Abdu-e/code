//4270797
//math GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java. awt.event.ActionListener;
import java.lang.reflect.GenericDeclaration;
import java.util.Random;

class Q24270797Prac2 implements ActionListener 
{
   

    private int x;
    private int y;
    private int c;
    private int w;
    private JFrame frame;
    private JLabel label3;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel;
    private JTextField textField;

    Q24270797Prac2 ()
    {
        Random random = new Random();
        this.x = random.nextInt(10);
        Random random2 = new Random();
        this.y = random2.nextInt(10);
        
        this.label1 = new JLabel("Correct: " +c);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        this.label2 = new JLabel("wrong: " +w);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        this.label3 = new JLabel(x+ "+" +y);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton button = new JButton("Continue");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.addActionListener(this);
        
        this.panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(textField);
        panel.add(button);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); 
        
        
        
        this.frame = new JFrame("Math Game");
        frame.setVisible(true);
        frame.add(panel, BorderLayout.NORTH);
        frame.pack();
        

    }
    

 
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            while(true)
            {
                int input = Integer.parseInt(this.textField.getText());
                 if (input == x+y)
            {
                int c = +1;
                this.label1.setText("Correct:" +c);
            }
            else
            {
                int w = +1;
                this.label2.setText("Wrong: " +w);
    
            }
            }
            
       
       
        }  


    public static void main(String args[])
    {
        Q24270797Prac2 gui = new Q24270797Prac2();
    }


}
