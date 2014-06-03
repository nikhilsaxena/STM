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



class AdminMain extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4;
JLabel l,l3,l2;
Label l1;

AdminMain()
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

l2=new JLabel("Deletion of Faculty/Students");
l2.setBounds(20,30,1000,500);
l2.setBackground(Color.blue);
l2.setFont(ft2);
l3=new JLabel("Test Pattern");
l3.setBounds(20,90,1300,500);
l3.setBackground(Color.green);
l3.setFont(ft2);

b1=new JButton("Go !");
b1.setBounds(300,220,120,30);
b1.setBackground(Color.white);
b1.setForeground(Color.blue);
b1.setFont(ft2);

b2=new JButton("Go");
b2.setBounds(300,240,120,30);
b2.setBackground(Color.white);
b2.setForeground(Color.blue);
b2.setFont(ft2);

f1.add(l);
l.add(l1);
l2.add(b1);
l.add(l2);
l3.add(b2);
l.add(l3);



b1.addActionListener(this);
b2.addActionListener(this);

f1.setVisible(true);
f1.setSize(1800,800);

}

public void actionPerformed(ActionEvent e)
{ 
  if(e.getSource()==b1 )
 {
   Deletion form2=new Deletion();
f1.dispose();
 
 }
  if(e.getSource()==b2) 
 {
   TestPat form=new TestPat();
f1.dispose();
 }
 
}


public static void main(String args[])
 {
  AdminMain st=new AdminMain();
  
  
}
}
