import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class StudPortal extends JFrame implements ActionListener
{
BufferedReader br;
Frame f1 ;
ImageIcon img;
JButton b,b1,b2,b3,b4;
JLabel l;
Label l1,l2,l3;
JTextField t1;
JPasswordField t2;


StudPortal()
{
Font ft=new Font("Arial",Font.BOLD,40);
Font ft1=new Font("Arial",Font.BOLD,14);
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
l1=new Label("Student Portal",l1.CENTER);
l1.setBounds(0,20,x,y-300);
l1.setBackground(Color.blue);
l1.setForeground(Color.white);
l1.setFont(ft);
l2=new Label("Username");
l3=new Label("Password");
l2.setFont(ft1);
l3.setFont(ft1);
l2.setBounds(220,80,80,30);
l3.setBounds(220,120,80,30);
l2.setBackground(Color.white);
l2.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setForeground(Color.black);
//img=new ImageIcon("Student_Portal.jpg");
l=new JLabel(img);
l.setBounds(0,100,x,460);
l.setBackground(Color.green);
t1=new JTextField();
t2=new JPasswordField();
b=new JButton("Login");
b1=new JButton("Signup");
b2=new JButton("Go Back");
b3=new JButton("Exit");
b4=new JButton("Forgot Password");

f1.add(l);
f1.add(l1);
l.add(l3);
l.add(l2);
l.add(b);
l.add(b1);
l.add(b2);
l.add(b3);
l.add(t1);
l.add(t2);
l.add(b4);
t1.setBounds(320,80,150,30);
t2.setBounds(320,120,150,30);
b.setBounds(220,160,100,30);
b1.setBounds(50,80,100,30);
b2.setBounds(50,120,100,30);
b3.setBounds(50,160,100,30);
b4.setBounds(330,160,140,30);

b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f1.setVisible(true);
f1.setSize(x,y+100);

}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
 {
  StudReg form1=new StudReg();
  f1.dispose();
 }
if(e.getSource()==b)
 {
   try{
      br = new BufferedReader(new FileReader("Students.txt"));
      String line,y;int i;char x[];
      Pattern pat = Pattern.compile("\\b"+t1.getText()+"\\b", Pattern.CASE_INSENSITIVE);
     while ( (line = br.readLine()) != null) {
        Matcher m = pat.matcher(line);
        if(m.find())
           {
             for(i=0;i<3;i++)
             br.readLine();
              if(new String(t2.getPassword()).equals(br.readLine())) 
             {
                StudTest st=new StudTest();
                f1.dispose();
             }
          else 
           {
                JOptionPane.showMessageDialog(f1, "Invalid Username or Password.");
           }
        }
     }
}catch (IOException e12){e12.printStackTrace();}
finally {
               try {
	if (br != null)br.close();
	} catch (IOException ex) {ex.printStackTrace();}
              }
 }
 if(e.getSource()==b2)
 {
    Menu form=new Menu();
     f1.dispose();
 }
 if(e.getSource()==b3)
 {
 System.exit(0);
 } 
}


public static void main(String args[])
 {
  StudPortal sp=new StudPortal();
  }


}
