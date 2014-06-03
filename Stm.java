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
class Stm extends JFrame implements ActionListener
{
JFrame f ;
ImageIcon img;
JButton b,b1;
JLabel l;
Label l1,l2;

 Stm()
 {

Font ft=new Font("Arial",Font.BOLD,40);
f=new JFrame("Soft Test Management (Beta)");
f.setLayout(null);
try
   {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }catch(Exception e) {}
  Toolkit thKit = f.getToolkit();
   Dimension wndSze = thKit.getScreenSize();
   int x = (int)((wndSze.getWidth())/2);
   int y = (int)((wndSze.getHeight()));
f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
l1=new Label("Welcome to Soft Test",l1.CENTER);
l1.setBounds(0,0,x,y-700);
l1.setBackground(Color.white);
l1.setForeground(Color.orange);
l1.setFont(ft);

l2=new Label("All Rights Reserved | A&N 2013",l2.CENTER);
l2.setBounds(100,480,400,20);
l2.setBackground(Color.white);
l2.setForeground(Color.red);
img=new ImageIcon("testbackground.jpg");
l=new JLabel(img);
l.setBounds(0,0,x,y-100);

b=new JButton("Click to Continue");
b1=new JButton("Exit");
f.add(l);
f.add(l1);
l.add(l2);
l.add(b);
l.add(b1);
b.setBounds(100,380,150,30);
b1.setBounds(350,380,150,30);
b.setBackground(Color.white);
b.setForeground(Color.black);
b1.setBackground(Color.white);
b1.setForeground(Color.black);
b.addActionListener(this);
b1.addActionListener(this);
f.setVisible(true);
f.setSize(x,y-100);

}

public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==b)
    {
       Menu form=new Menu();
       f.dispose();
    }
  if(e.getSource()==b1)
   {
     System.exit(0);
   } 
}


public static void main(String args[])
 {
  Stm stm=new Stm();
  }


}
