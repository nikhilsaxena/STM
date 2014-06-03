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

class TestPat extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4,b5;
JLabel l;
Label l1,l2,l3,l4,l5,l6,l7,l8,hl;
Label m1,m2,m3,m4,m5,m6,al1;
JTextField t1=new JTextField("0");
JTextField t2=new JTextField("0");
JTextField t3=new JTextField("0");
JTextField t4=new JTextField("0");
String y;
JRadioButton jr1,jr2,jr3;
ButtonGroup g=new ButtonGroup();


public void createFile()
 {
    try
       { System.out.print(y);
     File target = new File(y);
     FileWriter fW = new FileWriter(target,true);
       BufferedWriter bW = new BufferedWriter(fW);
	bW.write(t1.getText());bW.newLine();bW.write(t2.getText());bW.newLine();bW.write(t3.getText());bW.newLine();bW.write(t4.getText());bW.newLine();
	bW.close();
        JOptionPane.showMessageDialog(f1, "Test Pattern Created");
        }
     catch(IOException e)
    {
       e.printStackTrace();}
    }




TestPat()
{
l=new JLabel();
l.setBounds(0,0,665,460);
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);
f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);



l1=new Label("Faculty Registration",l1.CENTER);
l1.setBounds(20,40,500,38);
l1.setForeground(Color.red);
l1.setBackground(Color.white);
l1.setFont(ft);

hl=new Label();
hl.setBounds(0,5,550,84);
hl.setBackground(Color.red);

t1.setBounds(240,110,150,30);
t2.setBounds(240,160,150,30);
t3.setBounds(240,210,150,30);
t4.setBounds(240,260,150,30);


t1.setForeground(Color.black);
t2.setForeground(Color.black);
t3.setForeground(Color.black);
t4.setForeground(Color.black);


l2=new Label(" 1 Marks Question");
l2.setBounds(80,110,150,30);
l2.setForeground(Color.black);
l2.setBackground(Color.white);
l2.setFont(ft1);



l3=new Label("2 Marks Question");
l3.setBounds(80,160,150,30);
l3.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setFont(ft1);

l4=new Label("5 Marks Question");
l4.setBounds(80,210,150,30);
l4.setForeground(Color.black);
l4.setBackground(Color.white);
l4.setFont(ft1);

l5=new Label("10 Marks Question");
l5.setBounds(80,260,150,30);
l5.setForeground(Color.black);
l5.setBackground(Color.white);
l5.setFont(ft1);

b1=new JButton("Register");
b2=new JButton("Reset");
b3=new JButton("Go Back");
b4=new JButton("Exit");
jr1=new JRadioButton("Assignment");
jr2=new JRadioButton("Mid");
jr3=new JRadioButton("Semester");

b1.setBounds(80,340,150,30);
b2.setBounds(250,340,150,30);
b3.setBounds(80,380,150,30);
b4.setBounds(250,380,150,30);
jr1.setBounds(80,300,100,30);
jr2.setBounds(180,300,50,30);
jr3.setBounds(240,300,100,30);

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
l.add(t4);
l.add(jr1);
l.add(jr2);
l.add(jr3);

g.add(jr1);g.add(jr2);g.add(jr3);
jr1.setActionCommand(jr1.getText());
jr2.setActionCommand(jr2.getText());
jr3.setActionCommand(jr3.getText());


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


f1.setVisible(true);
f1.setSize(550,550);
}

public void actionPerformed(ActionEvent e)
{ 
   if(e.getSource()==b1)
  { if(g.getSelection().getActionCommand().equalsIgnoreCase("Mid")) y="Marks\\Mid.txt";
     else if(g.getSelection().getActionCommand().equalsIgnoreCase("Assignment")) y="Marks\\Assignment.txt";
     else y="Marks\\Semester.txt";
   createFile();
  }
  if(e.getSource()==b2)
 {
  
 }
 if(e.getSource()==b3)
 {
  FacPortal form=new FacPortal();
 
  f1.dispose();
 } 
 if(e.getSource()==b4)
 {
 System.exit(1);
 } 
}

public static void main(String args[])
{
 TestPat w= new TestPat();
}

}
