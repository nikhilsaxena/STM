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


class FacPortal extends JFrame implements ActionListener
{
BufferedReader br;
Frame f1 ;
ImageIcon img;
JButton b,b1,b2,b3,b4;
JLabel l;
Label l1,l2,l3,hl;
JPasswordField passwordFld=new JPasswordField();

JTextField t1;

FacPortal()
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
l1=new Label("Faculty Portal",l1.CENTER);
l1.setBounds(8,20,x,y-310);
l1.setBackground(Color.red);
l1.setForeground(Color.white);
l1.setFont(ft);

l2=new Label("Username");
l3=new Label("Password");
l2.setFont(ft1);
l3.setFont(ft1);
l2.setBounds(x/2-120,80,80,30);
l3.setBounds(x/2-120,120,80,30);
l2.setBackground(Color.white);
l2.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setForeground(Color.black);


l=new JLabel();
l.setBounds(0,95,665,460);


t1=new JTextField();


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
l.add(passwordFld);
l.add(b4);
//l.add(hl);
t1.setBounds(x/2,80,150,30);
passwordFld.setBounds(x/2,120,150,30);
b.setBounds(x/2-120,160,100,30);
b1.setBounds(x/2-260,80,100,30);
b2.setBounds(x/2-260,120,100,30);
b3.setBounds(x/2-260,160,100,30);
b4.setBounds(x/2+10,160,140,30);

b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f1.setVisible(true);
f1.setSize(x,y+100);

}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b)
 {
try{

    try{
br = new BufferedReader(new FileReader("Faculty.txt"));
String line,y;int i;char x[];
Pattern pat = Pattern.compile("\\b"+t1.getText()+"\\b", Pattern.CASE_INSENSITIVE);
while ( (line = br.readLine()) != null) {
Matcher m = pat.matcher(line);
        if(m.find())
{
for(i=0;i<2;i++)
br.readLine();
if(new String(passwordFld.getPassword()).equals(br.readLine())) 
   {
     FacTest ft=new FacTest();
    
      f1.setVisible(false);
     
   }
else 
   {
     JOptionPane.showMessageDialog(f1, "Invalid Username or Password.");
   }
//br.readLine();
}

}
}
catch (IOException e12) {
			e12.printStackTrace();
		}
}
catch (NullPointerException ne) {
			ne.printStackTrace();
		}
finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 }
 if(e.getSource()==b1)
 {
  FacReg fr=new FacReg();

  f1.setVisible(false);
 }
 if(e.getSource()==b2)
 {
  Menu form=new Menu();
 
  f1.setVisible(false);
 }
 if(e.getSource()==b3)
 {
 System.exit(0);
 } 
}


public static void main(String args[])
 {
  FacPortal fp=new FacPortal();

  }


}
