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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.Timer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.border.Border;
import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; import javax.swing.JTable;
 import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;







class FacTest extends JFrame implements ActionListener
{

Frame f1 ;
JButton b,b1,b2,b3,b4;
//JRadioButton jr1,jr2,jr3,jr4,jr5,jr6;
JLabel l,disp,inst;
Label l1,l2,l3,l4,l5,l6,l7,l8,cl1,cl2,cl3,cl4,cl5,cl6,cl7,td,tc,cl;
Label m1,m2,m3,m4,m5,m6,al1;
DefaultTableModel model;
JTable table;
static int qbreak=0;
String sCurrentLine[]={"",""};
String col[]={"Test Name","No. of Questions"};
String scan;
String actTest[]={"",""};



public void readFile()
{
 BufferedReader br=null;
 
    try
         {

 br=new BufferedReader(new FileReader("TestLists.txt"));
String line;
  int row=0,ptr=0,col=0,rowwise=0; 
  while((line=br.readLine())!=null)
   {
    
     if((ptr%2)==0)
     {
     col=0;
        if(row==0) 
            {
               rowwise=0;
            }
        else if((row%2)==0)
            {
                 rowwise=(row/2);

            }     
 System.out.println("row1"+rowwise);
     table.setValueAt(line,rowwise,col);

     }
  else if(ptr%2==1)
    {
    col=1;
      if(row==1) 
            {
               rowwise=0;
            }
        if((row%2)==1) 
            {
              rowwise=(row/2);
               }  
     System.out.println("row2"+rowwise);   
     table.setValueAt(line,rowwise,col);

    } 
   row++;
     ptr++;
  
   }
}
   catch (IOException ie) {
			ie.printStackTrace();
		} 

}


public void createFile(String test_name) 
 {
 try{
     try{
          File target = new File(test_name);
          BufferedWriter output = new BufferedWriter(new FileWriter(test_name+".txt"));
          }
         catch(IOException e)
         { e.printStackTrace();}   
    }
   catch(NullPointerException ne)
  {
    ne.printStackTrace();
  }
}



public FacTest()
{
l=new JLabel();
l.setBounds(10,20,1340,1000);
l.setBackground(Color.black);
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
     int x = (int)((wndSze.getWidth()));
    int y = (int)((wndSze.getHeight()));


l1=new Label("Create New Test / Activate Test",l1.CENTER);
l1.setBounds(1,1,x,y-690);
l1.setForeground(Color.white);
l1.setBackground(Color.red);
l1.setFont(ft);


l3=new Label("Instructions");
l3.setFont(ft2);
l3.setForeground(Color.red);
l3.setBounds(x/2-600,y-650,250,20);
l3.setBackground(Color.white);


b1=new JButton("New Test");
b1.setBounds(900,650,180,30);
b1.setBackground(Color.white);
b1.setForeground(Color.blue);
//b1.setFont(ft2);

b2=new JButton("Quit");
b2.setBounds(1150,650,120,30);
b2.setBackground(Color.white);
b2.setForeground(Color.blue);
//b2.setFont(ft2);


b=new JButton("Activate Test");
b.setBounds(750,650,120,30);
b.setBackground(Color.white);
b.setForeground(Color.blue);
//b.setFont(ft2);


Border border = BorderFactory.createLineBorder(Color.black, 2);

l5=new Label("Available Tests");
l5.setFont(ft1);
l5.setForeground(Color.black);
l5.setBackground(Color.white);
l5.setBounds(x/2-600,y-420,250,30);


inst=new JLabel();
inst.setBackground(Color.red);
inst.setBounds(x/2-550,y/2-330,x,y-400);
inst.setText("<html>"+"<h2>"+"TO ACTIVATE TEST"+"</h2>"+"<br>"+"Select the test from the available Test table"+"<br>"+"Click the Activate button to activate the test"+"<br>"+"<h2>"+"TO CREATE NEW TEST"+"</h2>"+"<br>"+"Click on Create New Test button"+"</html>");
inst.setFont(ft1);

//table//
//Border border = BorderFactory.createLineBorder(Color.black, 2);
 model=new DefaultTableModel(col,100);
 
table=new JTable(model){@Override
public boolean isCellEditable(int arg0,int arg1)
 {
   return false;
 }
};
JScrollPane pane=new JScrollPane(table);
pane.setBounds(x/2-600,y/2,600,200);
pane.setBorder(border);
//
cl=new Label("a x b denotes b questions of a marks");
cl.setBounds(120,150,250,30);
cl.setForeground(Color.red);
cl.setBackground(Color.white);

f1.add(l);
l.add(l1);
//l.add(l2);
l.add(l3);
l.add(l5);
//l.add(l4);
l.add(b1);
l.add(b2);
l.add(b);
l.add(pane);
//l.add(l4);
l.add(cl);
l.add(inst);
//l.add(table);
//l.add(textArea);

//l4.setVisible(false);
cl.setVisible(false);


b1.addActionListener(this);
b2.addActionListener(this);
b.addActionListener(this);


f1.setVisible(true);
f1.setSize(x,y);

readFile();
}





public void actionPerformed(ActionEvent e)
{ 
/**********MOUSE CODE HERE*****************/
if(e.getSource()==b)
   {
 
     
     table.addMouseListener(new MouseAdapter()
       {  
         public void mousePressed(MouseEvent me)
              {  
                      if(me.getClickCount()==2) 
                       {  
                            try{
                             int row = table.getSelectedRow();
                              int[] columns={0,1};
                              FileWriter ffW = new FileWriter("ActivateTest.txt",false);
                             BufferedWriter bbW = new BufferedWriter(ffW);
                               for (int col = 0; col < 2;col++)
                                           {
                                              bbW.write(table.getValueAt(row,columns[col]).toString());
bbW.newLine();
                                          // System.out.println(table.getValueAt(row,columns[col]));    
                                          //  actTest[col]=table.getValueAt(row,columns[col]); 
                                           }  
                                            bbW.close();  JOptionPane.showMessageDialog(null,"Test Activated.");    
                                          }
catch(IOException iie){iie.printStackTrace();}            
                       } 
               } 
              });
      
  
}                                                         

  
/*****NEW TEST***********/
 if(e.getSource()==b1 )
 {
   String test_name,questions;
   test_name=JOptionPane.showInputDialog(f1,"Enter test name:");
   questions= JOptionPane.showInputDialog(f1,"Enter number of Questions");
     createFile(test_name);
    

//table.setValueAt(test_name,0,0);
//table.setValueAt(questions,0,1);
    //start(test_name,questions);
 try{
                           
                               FileWriter fW = new FileWriter("TestLists.txt",true);
    	         BufferedWriter bW = new BufferedWriter(fW);
                               bW.write(test_name);bW.newLine();bW.write(questions);bW.newLine();
                               bW.close();
                                
                                  }
                                 catch(IOException ie){ie.printStackTrace();}
     
   if(test_name!=null && questions!=null)
   {                  
           
   NewTest nt=new NewTest(test_name,questions);
   //System.out.println(questions);
   f1.dispose();
   
 
  } 
 }
  if(e.getSource()==b2) 
 {
   System.exit(1);
 }
 
}


public static void main(String args[])
 {
 
  
  
}
}
