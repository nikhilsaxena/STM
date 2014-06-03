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


class Deletion extends JFrame implements ActionListener
{
BufferedReader br;
Frame f1 ;
ImageIcon img;
JButton b,b2,b3;
JLabel l;
Label l1,l2;
JTextField t1;
JRadioButton jr1,jr2;
ButtonGroup g;


Deletion()
{

Font ft=new Font("Arial",Font.BOLD,40);
Font ft1=new Font("Arial",Font.BOLD,14);
f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);
l1=new Label("Deletion",l1.CENTER);
l1.setBounds(8,20,610,100);
l1.setBackground(Color.white);
l1.setForeground(Color.blue);
l1.setFont(ft);

l2=new Label("ID");

l2.setFont(ft1);

l2.setBounds(220,80,80,30);


l2.setBackground(Color.white);
l2.setForeground(Color.black);


img=new ImageIcon("Student_Portal.jpg");
l=new JLabel(img);
l.setBounds(0,90,665,460);
l.setBackground(Color.black);
t1=new JTextField();


b=new JButton("Delete");
b2=new JButton("Go Back");
b3=new JButton("Exit");

jr1=new JRadioButton("Faculty");
jr2=new JRadioButton("Student");

f1.add(l);
f1.add(l1);

l.add(l2);
l.add(b);
l.add(jr1);
l.add(jr2);
l.add(b2);
l.add(b3);
l.add(t1);


t1.setBounds(320,80,150,30);

b.setBounds(220,160,100,30);

b2.setBounds(50,120,100,30);
b3.setBounds(50,160,100,30);
jr1.setBounds(260,120,100,30);
jr2.setBounds(200,120,100,30);
b.addActionListener(this);

b2.addActionListener(this);
b3.addActionListener(this);
f1.setVisible(true);
f1.setSize(675,505);
g=new ButtonGroup();
           g.add(jr1);g.add(jr2);
jr1.setActionCommand(jr1.getText());
jr2.setActionCommand(jr2.getText());
}

public void actionPerformed(ActionEvent e)
{ String y;
 if(e.getSource()==b)
 {
  StudReg form1=new StudReg();

  f1.dispose();
 }
if(e.getSource()==b)
 { 
if(g.getSelection().getActionCommand().equalsIgnoreCase("Faculty")) y="Faculty.txt";
else y="Student.txt";
try{
br = new BufferedReader(new FileReader(y));
String line;int i;char x[];
Pattern pat = Pattern.compile("\\b"+t1.getText()+"\\b", Pattern.CASE_INSENSITIVE);
while ( (line = br.readLine()) != null) {
Matcher m = pat.matcher(line);
        if(m.find())
{
for(i=0;i<3;i++)
br.readLine();
if(true)
{}
else 
   {
     JOptionPane.showMessageDialog(f1, "Invalid Username or Password.");
   }

}

}
}
catch (IOException e12) {
			e12.printStackTrace();
		}
finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 }
 if(e.getSource()==b2)
 {
  AdminMain form=new AdminMain();

  f1.dispose();
 }
 if(e.getSource()==b3)
 {
 System.exit(0);
 } 
}


public static void main(String args[])
 {
Deletion del=new Deletion();
  }


}
