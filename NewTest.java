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
import javax.swing.border.Border;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

class NewTest extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4,b5;
JLabel l;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,hl,hl1;
Label m1,m2,m3,m4,m5,m6,al1;
JTextArea textArea = new JTextArea(5,20);
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JTextField t4=new JTextField();
JTextField t5=new JTextField();
JTextField t6=new JTextField();
JTextField t7=new JTextField();
JTextField t8=new JTextField();
JTextField t9=new JTextField();
int check=0;
 String answer,answer1;
String[] answerStrings = {"","Option1","Option2","Option3","Option4"};
JComboBox cb=new JComboBox(answerStrings);

public void createFile(String test_name) 
 {
  //  int que=Integer.parseInt(hl1.getText());
       try
          {
                   // System.out.println(test_name);
                              FileWriter fW = new FileWriter(test_name+".txt",true);
    	         BufferedWriter bW = new BufferedWriter(fW);
	        bW.write(textArea.getText());bW.newLine();bW.write(t1.getText());bW.newLine();bW.write(t2.getText());bW.newLine();bW.write(t3.getText());bW.newLine();bW.write(t4.getText());
	        bW.newLine();bW.write(answer);bW.newLine();bW.write(t5.getText());bW.newLine();bW.write(t6.getText());bW.newLine();
    	         bW.close();
            }
            catch(IOException e)
            {
                     e.printStackTrace();
             }   
  
    JOptionPane.showMessageDialog(f1, "Question Saved Successfully.");
   textArea.setText("");t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");t6.setText("");cb.setSelectedIndex(0);
            int que=Integer.parseInt(hl1.getText());
               if(que==check)
                 {
                JOptionPane.showMessageDialog(null, "All questions Saved,Successfully.");
               FacTest ft=new FacTest();
               f1.dispose();
              
              }
  }




public NewTest(String test_name,String questions)
{

l=new JLabel();
Font ft=new Font("Arial",Font.BOLD,30);
Font ft1=new Font("Arial",Font.BOLD,14);
Font ft2=new Font("Arial",Font.BOLD,20);
Font qf=new Font("Arial",Font.BOLD,18);

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
l1=new Label("Question Palette",l1.CENTER);
l1.setFont(ft);
l1.setForeground(Color.white);
l1.setBackground(Color.red);

l1.setBounds(8,10,x,y-680);

Border border = BorderFactory.createLineBorder(Color.black, 2);

textArea.setFont(new Font("Arial",Font.ITALIC, 20));
textArea.setBounds(x/2-450,y-650,x/2,100);
textArea.setBackground(Color.white);
//textArea.setFont(ft1);
textArea.setForeground(Color.black);
textArea.setBorder(border);
//textArea.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
t1.setBounds(x/2-450,y-500,200,30);
t2.setBounds(x/2-50,y-500,200,30);
t3.setBounds(x/2-450,y-400,200,30);
t4.setBounds(x/2-50,y-400,200,30);
t5.setBounds(x/2-400,y-150,180,30);
t6.setBounds(x/2-400,y-220,180,30);
t7.setBounds(240,460,150,30);
t8.setBounds(240,510,150,30);


t1.setForeground(Color.black);
t2.setForeground(Color.black);
t3.setForeground(Color.black);
t4.setForeground(Color.black);
t5.setForeground(Color.black);
t6.setForeground(Color.black);
t7.setForeground(Color.black);
t8.setForeground(Color.black);




l2=new Label("Question");
l2.setBounds(x/2-600,y-620,100,30);
l2.setForeground(Color.black);
l2.setBackground(Color.white);
l2.setFont(qf);



l3=new Label("Option1");
l3.setBounds(x/2-550,y-500,80,30);
l3.setForeground(Color.black);
l3.setBackground(Color.white);
l3.setFont(ft1);

l4=new Label("Option2");
l4.setBounds(x/2-150,y-500,80,30);
l4.setForeground(Color.black);
l4.setBackground(Color.white);
l4.setFont(ft1);

l5=new Label("Option3");
l5.setBounds(x/2-550,y-400,80,30);
l5.setForeground(Color.black);
l5.setBackground(Color.white);
l5.setFont(ft1);

l6=new Label("Option4");
l6.setBounds(x/2-150,y-400,80,30);
l6.setForeground(Color.black);
l6.setBackground(Color.white);
l6.setFont(ft1);



l7=new Label("Answer");
l7.setBounds(x/2-550,y-300,80,30);
l7.setForeground(Color.black);
l7.setBackground(Color.white);
l7.setFont(ft1);

/*cb.add("");
cb.add("Option1");
cb.add("Option2");
cb.add("Option3");
cb.add("Option4");*/
cb.addActionListener(this);
cb.setBounds(x/2-450,y-300,100,30);
//cb.setSelectedIndex(0);

l8=new Label("Question Marks");
l8.setBounds(x/2-550,y-220,120,30);
l8.setForeground(Color.black);
l8.setBackground(Color.white);
l8.setFont(ft1);

l9=new Label("Question Time");
l9.setBounds(x/2-550,y-150,120,30);
l9.setForeground(Color.black);
l9.setBackground(Color.white);
l9.setFont(ft1);

hl=new Label(test_name);
hl1=new Label(questions);
//int que=Integer.parseInt(hl1.getText());

b1=new JButton("Save and Next");
b2=new JButton("Reset");
b3=new JButton("Go Back");
b4=new JButton("Exit");


b1.setBounds(x/2,y/2+100,150,30);
b2.setBounds(x/2,y/2+150,150,30);
b3.setBounds(x/2,y/2+200,150,30);
b4.setBounds(x/2,y/2+250,150,30);

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
l.add(cb);
l.add(l8);
l.add(l9);
//l.add(hl);
l.add(b1);
l.add(b2);
l.add(b3);
l.add(b4);
l.add(textArea);
l.add(t1);
l.add(t2);
l.add(t3);
l.add(t4);
l.add(t5);
l.add(t6);
//l.add(t7);
//l.add(t8);
//l.add(t9);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


f1.setVisible(true);
f1.setSize(x,y);
 
}

public void actionPerformed(ActionEvent e)
{ 
    
      
     if(e.getSource()==b1)
      { 
         answer1=cb.getSelectedItem().toString();
               if(cb.getSelectedItem().equals("0"))
                 {
                     JOptionPane.showMessageDialog(null,"Choose the correct answer!!");
                }
                if(answer1.equals("Option1"))
             {
                    answer=t1.getText(); 
                   // System.out.println(cb.getSelectedItem().toString());
              }
               if(answer1.equals("Option2"))
            {
                 answer=t2.getText();  System.out.println(answer);
            }
               if(answer1.equals("Option3"))
           {
                answer=t3.getText();   System.out.println(answer);
           }
              if(answer1.equals("Option4"))
          {
               answer=t4.getText();    System.out.println(answer);
          }
       
        if(textArea.getText().equals(""))
           {
              JOptionPane.showMessageDialog(null,"Question cannot be left blank!!");
           }
             else if(t1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter Option1!!");
            }
             else if(t2.getText().equals(""))
            {
              JOptionPane.showMessageDialog(null,"Enter Option1!!");
            }
              else if(t3.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null,"Enter Option1!!");
            }
              else if(t4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter Option1!!");
            }
              else
           {
               int que=Integer.parseInt(hl1.getText());
               if(check<que)
                  { ++check;         
                    createFile(hl.getText());
                     System.out.println("que called");
                    
                }
          }        
            
       
    }
   if(e.getSource()==b2)
    {
       textArea.setText("");t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");t6.setText("");cb.setSelectedIndex(0);
   }
   if(e.getSource()==b3)
    {
       Menu form=new Menu();
       f1.dispose();
    } 
    if(e.getSource()==b4)
    {
       System.exit(1);
     } 
 }



public static void main(String args[])
{
//NewTest nt=new NewTest(crypto,a);
}

}
