import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import javax.swing.event.*;
import java.text.*;
import java.util.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

class FacReg extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4,b5;
JLabel l;
Label l1,l2,l3,l4,l5,l6,l7,l8,hl;
Label m1,m2,m3,m4,m5,m6,al1;
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JTextField t4=new JTextField();
JTextField t5=new JTextField();
JTextField t6=new JTextField();
String email = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
JPasswordField passwordFld=new JPasswordField();



public void createFile()
 {
    try
       { 
     File target = new File("Faculty.txt");
     FileWriter fW = new FileWriter(target,true);
       BufferedWriter bW = new BufferedWriter(fW);
	bW.write(t3.getText());bW.newLine();bW.write(t1.getText());bW.newLine();
	bW.write(t2.getText());bW.newLine();bW.write(passwordFld.getPassword());bW.newLine();
	bW.close();
        JOptionPane.showMessageDialog(f1, "Faculty Successfully Registered.");
        }
     catch(IOException e)
    {
       e.printStackTrace();}
    }




FacReg()
{
l=new JLabel();
l.setBounds(0,0,665,460);
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);
f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);
try
   {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }catch(Exception e) {}
   Toolkit thKit = f1.getToolkit();
   Dimension wndSze = thKit.getScreenSize();
     int x = (int)((wndSze.getWidth()/2));
    int y = (int)((wndSze.getHeight()/2));


l1=new Label("Faculty Registration",l1.CENTER);
l1.setBounds(8,20,x,y-300);
l1.setForeground(Color.white);
l1.setBackground(Color.red);
l1.setFont(ft);

hl=new Label();
hl.setBounds(0,5,550,84);
hl.setBackground(Color.red);

t1.setBounds(x/2,110,150,30);
t2.setBounds(x/2,160,150,30);
t3.setBounds(x/2,210,150,30);
passwordFld.setBounds(x/2,260,150,30);


t1.setForeground(Color.black);
t2.setForeground(Color.black);
t3.setForeground(Color.black);
passwordFld.setForeground(Color.black);


l2=new Label("First Name");
l2.setBounds(x/2-150,110,120,30);
l2.setForeground(Color.black);
l2.setBackground(Color.white);
l2.setFont(ft1);



l3=new Label("Last Name");
l3.setBounds(x/2-150,160,150,30);
l3.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setFont(ft1);

l4=new Label("Faculty Id");
l4.setBounds(x/2-150,210,150,30);
l4.setForeground(Color.black);
l4.setBackground(Color.white);
l4.setFont(ft1);

l5=new Label("New Password");
l5.setBounds(x/2-150,260,150,30);
l5.setForeground(Color.black);
l5.setBackground(Color.white);
l5.setFont(ft1);

b1=new JButton("Register");
b2=new JButton("Reset");
b3=new JButton("Go Back");
b4=new JButton("Exit");


b1.setBounds(x/2-180,340,150,30);
b2.setBounds(x/2+20,340,150,30);
b3.setBounds(x/2-180,380,150,30);
b4.setBounds(x/2+20,380,150,30);

b1.setForeground(Color.black);
b2.setForeground(Color.black);
b3.setForeground(Color.black);
b4.setForeground(Color.black);


f1.add(l);
l.add(l1);
l.add(l2);
l.add(l3);
l.add(l4);
l.add(l5);
l.add(hl);
l.add(b1);
l.add(b2);
l.add(b3);
l.add(b4);
l.add(t1);
l.add(t2);
l.add(t3);
l.add(passwordFld);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

f1.setVisible(true);
f1.setSize(x,y+100);
}

public void actionPerformed(ActionEvent e)
{ 
   if(e.getSource()==b1)
  {
   createFile();
  }
  if(e.getSource()==b2)
 {
  t1.setText("");
  t2.setText("");
  t3.setText("");
 passwordFld.setText("");  
 }
 if(e.getSource()==b3)
 {
  FacPortal form=new FacPortal();
 
  f1.setVisible(false);
 } 
 if(e.getSource()==b4)
 {
 System.exit(1);
 } 
}

public static void main(String args[])
{
 FacReg fr=new FacReg();
}

}
