import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import javax.swing.event.*;
import java.util.*;
class Menu extends JFrame implements ActionListener
{
 Frame f1 ;
 ImageIcon img;
 JButton b,b1,b2,b3;
 JLabel l; 
 Label l1,l2;

Menu()
{

 Font ft=new Font("Arial",Font.BOLD,40);
 f1=new Frame("Soft Test Management (Beta)");
 f1.setLayout(null);
 l1=new Label("Main Page",l1.CENTER); 
 l1.setBounds(8,20,610,100);
 l1.setBackground(Color.white);
 l1.setForeground(Color.orange);
 l1.setFont(ft);

 l2=new Label("All Rights Reserved | A&N 2013",l2.CENTER);
 l2.setBounds(8,320,610,40);
 l2.setBackground(Color.white);
 l2.setForeground(Color.red);
 img=new ImageIcon("Menu.jpg");
 l=new JLabel(img);
 l.setBounds(0,100,610,420);
 l.setBackground(Color.black);

 b=new JButton("Admin Module"); 
 b1=new JButton("Faculty Module"); 
 b2=new JButton("Student Module");
 b3=new JButton("Exit");
 f1.add(l);
 f1.add(l1);
 l.add(l2);
 l.add(b);
 l.add(b1);
 l.add(b2);
 l.add(b3);
 b.setBounds(350,80,150,30);
 b1.setBounds(350,120,150,30);
 b2.setBounds(350,160,150,30);
 b3.setBounds(350,200,150,30);
 b.setBackground(Color.white);
 b.setForeground(Color.black);
 b1.setBackground(Color.white);
 b1.setForeground(Color.black);
 b2.setBackground(Color.white);
 b2.setForeground(Color.black);
 b3.setBackground(Color.white);
 b3.setForeground(Color.black);
 
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f1.setVisible(true);
f1.setSize(610,480);

}

public void actionPerformed(ActionEvent e)
{
   if(e.getSource()==b2)
     {
         StudPortal f=new StudPortal();
        f1.dispose();
     }
   if(e.getSource()==b1)
    {
         FacPortal f=new FacPortal();
        f1.dispose();
     }
   if(e.getSource()==b)
     {
         AdminPortal f=new AdminPortal();
         f1.dispose();
     }
    if(e.getSource()==b3)
       {
          System.exit(0);
       } 
   }

public static void main(String args[])
 {  
   
}
}
