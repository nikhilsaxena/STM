import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
import java.text.*;
import java.util.*;

import javax.swing.Timer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



class StudTest extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4;
JRadioButton jr1,jr2,jr3,jr4;
JLabel l;
Label l1,l2,l4,l5,l6,l7,l8,cl1,cl2,cl3,cl4,cl5,cl6,cl7,td,tc;
JLabel l3;
Label m1,m2,m3,m4,m5,m6,al1;



public void abcd()
{
BufferedReader br = null;
try {
br = new BufferedReader(new FileReader("Instruction.txt"));

l3.setText("<html>"+br.readLine()+"<br>"+br.readLine()+"<br>"+br.readLine()+"<br>"+br.readLine()+"</html>");
}
catch (IOException|NullPointerException e) 
           {
			e.printStackTrace();
           } 
finally {
	try {
		if (br != null)br.close();
                        } catch (IOException ex) {
				ex.printStackTrace();
			            }
           }

}
StudTest()
{
l=new JLabel();
l.setBounds(10,20,1340,1000);
l.setBackground(Color.black);
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);

f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);



l1=new Label("Test Instructions",l1.CENTER);
l1.setBounds(10,20,1300,60);
l1.setForeground(Color.blue);
l1.setBackground(Color.white);
l1.setFont(ft);

l2=new Label();
l2.setBounds(0,80,1400,5);
l2.setBackground(Color.blue);

l3=new JLabel("Instructions");
l3.setBounds(20,90,1300,500);
l3.setBackground(Color.green);
l3.setFont(ft2);
abcd();
b1=new JButton("Proceed");
b1.setBounds(1000,650,120,30);
b1.setBackground(Color.white);
b1.setForeground(Color.blue);
b1.setFont(ft2);

b2=new JButton("Quit");
b2.setBounds(1150,650,120,30);
b2.setBackground(Color.white);
b2.setForeground(Color.blue);
b2.setFont(ft2);

f1.add(l);
l.add(l1);
l.add(l2);
l.add(l3);
l.add(b1);
l.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

f1.setVisible(true);
f1.setSize(1800,800);

}

public void actionPerformed(ActionEvent e)
{ 
  if(e.getSource()==b1 )
 {
   Test form2=new Test();
f1.setVisible(false);
 
 }
  if(e.getSource()==b2) 
 {
   System.exit(1);
 }
 
}


public static void main(String args[])
 {
  StudTest st=new StudTest();
  
  
}
}
