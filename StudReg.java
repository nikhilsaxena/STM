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

class StudReg extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4;
JLabel l;
Label l1,l2,l3,l4,l5,l6,l7,l8,cl1,cl2,cl3,cl4,cl5,cl6,cl7;
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
    try{  File target = new File("Students.txt");
    FileWriter fW = new FileWriter(target,true);
    	        BufferedWriter bW = new BufferedWriter(fW);
	        bW.write(t3.getText());bW.newLine();bW.write(t1.getText());bW.newLine();bW.write(t2.getText());
	        bW.newLine();bW.write(t4.getText());bW.newLine();bW.write(passwordFld.getPassword());bW.newLine();bW.write(t6.getText());bW.newLine();
    	        bW.close();
 }catch(IOException e){e.printStackTrace();}
 }


StudReg()
{
l=new JLabel();
l.setBounds(0,90,665,460);
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);
f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);



l1=new Label("Student Registration",l1.CENTER);
l1.setBounds(5,1,500,38);
l1.setForeground(Color.red);
l1.setBackground(Color.white);
l1.setFont(ft);



l2=new Label("First Name");
l2.setBounds(80,60,150,30);
l2.setForeground(Color.black);
l2.setBackground(Color.white);
l2.setFont(ft1);
t1.setBounds(240,60,150,30);
t2.setBounds(240,100,150,30);
t3.setBounds(240,140,150,30);
t4.setBounds(240,180,150,30);
passwordFld.setBounds(240,220,150,30);
t6.setBounds(240,260,150,30);

t1.setForeground(Color.black);
t2.setForeground(Color.black);
t3.setForeground(Color.black);
t4.setForeground(Color.black);
//t5.setForeground(Color.black);
t6.setForeground(Color.black);

t1.setFont(ft1);
t2.setFont(ft1);
t3.setFont(ft1);
t4.setFont(ft1);
t5.setFont(ft1);
t6.setFont(ft1);

l3=new Label("Last Name");
l3.setBounds(80,100,150,30);
l3.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setFont(ft1);

l4=new Label("Roll Number");
l4.setBounds(80,140,150,30);
l4.setForeground(Color.black);
l4.setBackground(Color.white);
l4.setFont(ft1);

l5=new Label("E-mail");
l5.setBounds(80,180,150,30);
l5.setForeground(Color.black);
l5.setBackground(Color.white);
l5.setFont(ft1);

l6=new Label("New Password");
l6.setBounds(80,220,150,30);
l6.setForeground(Color.black);
l6.setBackground(Color.white);
l6.setFont(ft1);

l7=new Label("Class(year)");
l7.setBounds(80,260,150,30);
l7.setForeground(Color.black);
l7.setBackground(Color.white);
l7.setFont(ft1);

l8=new Label("Fields marked with asterik(*) are compulsory ");
l8.setBounds(80,310,350,20);
l8.setBackground(Color.white);
l8.setForeground(Color.red);
l8.setFont(ft1);

cl1=new Label();
cl2=new Label();
cl3=new Label();
cl4=new Label();
cl5=new Label();
cl6=new Label();

m1=new Label("*");
m2=new Label("*");
m3=new Label("*");
m4=new Label("*");
m5=new Label("*");
m6=new Label("*");

m1.setBounds(70,60,10,30);
m2.setBounds(70,100,10,30);
m3.setBounds(70,140,10,30);
m4.setBounds(70,180,10,30);
m5.setBounds(70,220,10,30);
m6.setBounds(70,260,10,30);


m1.setBackground(Color.white);
m1.setForeground(Color.red);
m2.setBackground(Color.white);
m2.setForeground(Color.red);
m3.setBackground(Color.white);
m3.setForeground(Color.red);
m4.setBackground(Color.white);
m4.setForeground(Color.red);
m5.setBackground(Color.white);
m5.setForeground(Color.red);
m6.setBackground(Color.white);
m6.setForeground(Color.red);
m1.setFont(ft2);
m2.setFont(ft2);
m3.setFont(ft2);
m4.setFont(ft2);
m5.setFont(ft2);
m6.setFont(ft2);





cl1.setBackground(Color.white);
cl1.setForeground(Color.red);
cl1.setBounds(400,60,180,30);

cl2.setBackground(Color.white);
cl2.setForeground(Color.red);
cl2.setBounds(400,100,180,30);

cl3.setBackground(Color.white);
cl3.setForeground(Color.red);
cl3.setBounds(400,140,180,30);

cl4.setBackground(Color.white);
cl4.setForeground(Color.red);
cl4.setBounds(400,180,180,30);

cl5.setBackground(Color.white);
cl5.setForeground(Color.red);
cl5.setBounds(400,220,180,30);

cl6.setBackground(Color.white);
cl6.setForeground(Color.red);
cl6.setBounds(400,260,180,30);


b1=new JButton("Register");
b2=new JButton("Reset");
b3=new JButton("Go Back");
b4=new JButton("Exit");
b1.setBounds(80,340,150,30);
b2.setBounds(250,340,150,30);
b3.setBounds(80,380,150,30);
b4.setBounds(250,380,150,30);

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
l.add(l6);
l.add(l7);
l.add(l8);
l.add(t1);
l.add(t2);
l.add(t3);
l.add(t4);

l.add(passwordFld);
l.add(t6);
l.add(b1);
l.add(b2);
l.add(b3);
l.add(b4);
l.add(cl1);
l.add(cl2);
l.add(cl3);
l.add(cl4);
l.add(cl5);
l.add(cl6);

l.add(m1);
l.add(m2);
l.add(m3);
l.add(m4);
l.add(m5);
l.add(m6);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f1.setVisible(true);
f1.setSize(600,550);

}

public void actionPerformed(ActionEvent e)
{ 
   if(e.getSource()==b1)
  {
    if(t1.getText().equals(""))
    {
     cl1.setText("Blank fields are not allowed!");
    }
    if(t2.getText().equals(""))
    {
     cl2.setText("Blank fields are not allowed!");
    }
    if(t3.getText().equals(""))
    {
     cl3.setText("Enter your roll number!");
    }
    if(!(t4.getText().matches(email)))
    {
     cl4.setText("Invalid Email id");
    }
    if(t5.getText().equals(""))
    {
     cl5.setText("Password cannot be left blank!!");
    }
    if(t6.getText().equals(""))
    {
     cl6.setText("Enter your Class");
    }    
    else
    {   
     createFile();
    }  
  }
  if(e.getSource()==b2)
 {
   t1.setText(" ");
   t2.setText(" ");
   t3.setText(" ");
   t4.setText(" ");
   t5.setText(" ");
   t6.setText(" ");
  // l8.setText(" ");
   cl1.setText(" ");
   cl2.setText(" ");
   cl3.setText(" ");
   cl4.setText(" ");
   cl5.setText(" ");
   cl6.setText(" ");
 }
 if(e.getSource()==b3)
 {
  StudPortal f=new StudPortal();
  
  f1.setVisible(false);
 } 
 if(e.getSource()==b4)
 {
 System.exit(1);
 } 
}


public static void main(String args[])
 {
  StudReg form1=new StudReg();

  }


}
