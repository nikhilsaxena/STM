import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;
public class LoginForm
{
   public static void main(String[] args)
   {
       Runnable runner = new Runnable()
      {
        public void run()
          {
           JFrame frame = new JFrame("Soft Test Management");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Scanner sc=new Scanner(System.in);
  
          JButton button=new JButton();
          JTextField t1=new JTextField();
          JTextField t2=new JTextField();
          JTextField t3=new JTextField();
          JTextField t4=new JTextField();
         //Frame
           frame.setSize(400,300);
         
      
       Font font1=new Font("SansSerif",Font.BOLD,22);
      
      JLabel label;
      JPanel panel;
      BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
       frame.setLayout(layout);
       button =new JButton("Submit");
        
        panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
       // font.setForeground(Color.BLUE);
        label=new JLabel("SOFT TEST MANAGEMENT");
      label.setForeground(Color.BLUE);
 label.setFont(font1);
 panel.setBackground(Color.white);
 panel.add(label);
 frame.add(panel);
         
        Font font = new Font("SansSerif", Font.BOLD, 16);
        label = new JLabel("First Name:");
        t1.setColumns(20);
        t1.setFont(font);
        panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        //panel.setBackground(Color.white);
        panel.add(label);
        panel.add(t1);
        frame.add(panel);
  
        panel.setBackground(Color.white);
 
        label = new JLabel("Last Name:");
       
 
 t2.setColumns(20);
 t2.setFont(font);
panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//panel.setBackground(Color.white);
 panel.add(label);
 panel.add(t2);
 frame.add(panel);

 label = new JLabel("Roll Number:");
 //t3 = new JFormattedTextField();
 
 t3.setColumns(20);
 t3.setFont(font);
 panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
 panel.setBackground(Color.white);
 panel.add(label);
 panel.add(t3);
 frame.add(panel);
 
 label = new JLabel("Location:");
 //input = new JFormattedTextField();
 t4.setColumns(20);
 t4.setFont(font);
 panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
 //panel.setBackground(Color.white);
 panel.add(label);
 panel.add(t4);
 frame.add(panel);
// frame.pack();
  //frame.setBackground(Color.yellow); 
 frame.setVisible(true);
 
 panel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
 panel.setBackground(Color.white);
 panel.add(button);
 frame.add(panel);
 

 
 
} };
 EventQueue.invokeLater(runner);
 

}}