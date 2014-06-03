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
import java.text.*;
import javax.swing.border.Border;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
class Test extends JFrame implements ActionListener
{
static int qbreak=0;
Frame f1 ;
static Timer timer;
JButton b,b1,b2,b3,b4;
JRadioButton jr1,jr2,jr3,jr4;
JLabel l;
Label l1,l2,l3,l4,l5,l6,l7,l8,ql,td,tc;
Label m1,m2,m3,m4,m5,m6,al1;
JTextArea textArea = new JTextArea(5,20);
String sCurrentLine[]={"","","","","","","",""};
ButtonGroup g;
int ax=0;
int bx=0,dx=0;
String test_name,que;


public void read()
{
    try
         { BufferedReader bbr=null;
            bbr=new BufferedReader(new FileReader("ActivateTest.txt"));
             test_name=bbr.readLine();
             que=bbr.readLine();
         }
    catch(IOException ie){ie.printStackTrace();}
}

Test()
{
read();
System.out.println(test_name);
System.out.println(que);
l=new JLabel();

l.setBackground(Color.black);
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);
Font ft3=new Font("Arial",Font.BOLD,20);

f1=new Frame("Soft Test Management (Beta)");
f1.setLayout(null);
try
   {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }catch(Exception e) {}
   Toolkit thKit = f1.getToolkit();
   Dimension wndSze = thKit.getScreenSize();
     int x = (int)((wndSze.getWidth()));
    int y = (int)((wndSze.getHeight()));

l.setBounds(0,0,x,y);
l1=new Label("SELF ASSESSMENT TEST :"+" "+test_name,l1.CENTER);
l1.setBounds(0,20,x,65);
l1.setForeground(Color.blue);
l1.setBackground(Color.white);
l1.setFont(ft);
ql=new Label("Que:");


l2=new Label();
l2.setBounds(10,80,x,y-730);
//l2.setForeground(Color.black);
l2.setBackground(Color.blue);
//l2.setFont(ft1);



l3=new Label();
l3.setBounds(50,120,750,150);
//l3.setForeground(Color.black);
l3.setBackground(Color.magenta);
l3.setFont(ft3);
Border border = BorderFactory.createLineBorder(Color.black, 2);
textArea.setFont(new Font("Arial",Font.BOLD, 20));
textArea.setBounds(50,150,750,150);
textArea.setBackground(Color.white);
//textArea.setFont(ft1);
textArea.setForeground(Color.black);
textArea.setBorder(border);

tc=new Label("Clock");
tc.setBounds(1200,100,100,50);
tc.setForeground(Color.blue);
tc.setFont(ft);
tc.setBackground(Color.white);


td=new Label("00:00");
td.setBackground(Color.yellow);
td.setBounds(1200,150,100,80);
td.setFont(ft);

jr1=new JRadioButton();
jr2=new JRadioButton();
jr3=new JRadioButton();
jr4=new JRadioButton();
b=new JButton("Reset");
b1=new JButton("Next");
b1.addActionListener(this);

jr1.setBackground(Color.white);
jr2.setBackground(Color.white);
jr3.setBackground(Color.white);
jr4.setBackground(Color.white);
jr1.setBounds(50,350,200,50);
jr2.setBounds(50,400,200,50);
jr3.setBounds(50,450,200,50);
jr4.setBounds(50,500,200,50);
b.setBounds(10,650,100,30);
b1.setBounds(200,650,100,30);
display();


f1.add(l);
l.add(l1);
l.add(l2);
//l.add(l3);
l.add(jr1);
l.add(jr2);
l.add(jr3);
l.add(jr4);
l.add(b);
l.add(b1);
l.add(td);
l.add(tc);
l.add(textArea);
f1.setVisible(true);
f1.setSize(1800,800);
 g=new ButtonGroup();
           g.add(jr1);g.add(jr2);g.add(jr3);g.add(jr4);


}

public void display ()
{

BufferedReader br = null;
int qline=0;
try
{

try {
br = new BufferedReader(new FileReader(test_name+".txt"));
qline=qbreak;

while(qline>0)
{
br.readLine();
qline--;
}
while (qline<8) {
sCurrentLine[qline] = br.readLine();
qline++;	}
qbreak=qbreak+8;
ax++;
textArea.setText(sCurrentLine[0]);

jr1.setText(sCurrentLine[1]);jr1.setActionCommand(jr1.getText());
jr2.setText(sCurrentLine[2]);jr2.setActionCommand(jr2.getText());
jr3.setText(sCurrentLine[3]);jr3.setActionCommand(jr3.getText());
jr4.setText(sCurrentLine[4]);jr4.setActionCommand(jr4.getText());
dx=dx+Integer.parseInt(sCurrentLine[7]);
g.clearSelection();
}
  catch (IOException|NullPointerException e) {
			e.printStackTrace();}
      } catch (NullPointerException ne) {ne.printStackTrace();}


Runnable runner = new Runnable() {
public void run() {
ActionListener actionListener = new ActionListener() {
int count=Integer.parseInt(sCurrentLine[6]);
public void actionPerformed(ActionEvent actionEvent) {
td.setText(String.valueOf(--count));
if(count==0) {timer.stop();
if(ax<Integer.parseInt(que))
display();
 else delclose();}
}
};
timer = new Timer(1000, actionListener);
timer.start();
}
};
EventQueue.invokeLater(runner);

}
public void delclose()
{
try{  File target = new File("Result.txt");
    FileWriter fW = new FileWriter(target);
    	        BufferedWriter bW = new BufferedWriter(fW);
	        bW.write(test_name);bW.newLine();bW.write("No. of Questions : "+que);bW.newLine();bW.write(bx+"/"+dx);
    	        bW.close();

 }catch(IOException e){e.printStackTrace();}
 

Report rt=new Report();
f1.dispose();
}
public static void main(String args[])
 {
  Test form2=new Test();
form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

@Override
public void actionPerformed(ActionEvent event)
{

if(event.getSource()==b)
{
g.clearSelection();

}
if(event.getSource()==b1)
{
if(g.getSelection().getActionCommand().equals(null) || g.getSelection().getActionCommand().equals(""))
           System.out.println("No Answer !!");
else if(g.getSelection().getActionCommand().equalsIgnoreCase(sCurrentLine[5]))
	bx=bx+Integer.parseInt(sCurrentLine[7]);
else System.out.println("Wrong... !!");
timer.stop();
if(ax<Integer.parseInt(que))
display();
 else delclose();
}
}

}
