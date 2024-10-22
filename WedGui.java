//4270797
//math GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java. awt.event.ActionListener;
import java.lang.reflect.GenericDeclaration;
import java.util.Random;

class WedGui implements ActionListener 
{
   

    private int x;
    private int y;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JTextField textField;

    WedGui ()
    {
        Random random = new Random();
        this.x = random.nextInt(10);
        Random random2 = new Random();
        this.y = random2.nextInt(10);
        
       
        
        this.label = new JLabel("Lets Begin.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton button = new JButton("Continue");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.addActionListener(this);
        
        this.panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); 
        panel.add(button, x+ " + " +y );
        
        
        this.frame = new JFrame("Math Game");
        frame.setVisible(true);
        frame.add(panel, BorderLayout.NORTH);
        frame.pack();

    }

 
        @Override
    public void actionPerformed(ActionEvent e) {
        int input = Integer.parseInt(this.textField.getText());
    }


    public static void main(String args[])
    {
        WedGui gui = new WedGui();
    }


}
