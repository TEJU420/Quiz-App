package com.mycompany.mini_1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class quiz {
public static void main(String[] args){
  JFrame frmOnlineQuiz = new JFrame("Online Quiz");//to construct a frame and online quiz is the name of the frame
  JMenuBar mbar = new JMenuBar(); //creates a new menubar
  mbar.setBounds(0,0,300,30);//to set size
  frmOnlineQuiz.add(mbar);//add menu to the menubar

  JMenu menuRegistration = new JMenu("Registration");//creates a new menu with specific name
  mbar.add(menuRegistration);//add menu to the menubar
  JMenu menuQuestions = new JMenu("Questions");//creates a new menu with specific name
  mbar.add(menuQuestions);//add menu to the menubar



  JLabel lblque1 = new JLabel("Que1 : Which data type value is returned by all trancendental math function?");//creates a label with text
  lblque1.setBounds(30,40,450,30);//to set size
  frmOnlineQuiz.add(lblque1);//add text to the frame
  JRadioButton rdoint = new JRadioButton("int");//creates a unselected rediobutton with no text
  rdoint.setBounds(50,80,100,20);
  frmOnlineQuiz.add(rdoint);//add radiobutton to frame
  JRadioButton rdofloat = new JRadioButton("float");//creates a unselected rediobutton with no text
  rdofloat.setBounds(50,110,100,20);
  frmOnlineQuiz.add(rdofloat);
  JRadioButton rdodouble = new JRadioButton("double");//creates a unselected rediobutton with no text
  rdodouble.setBounds(50,140,100,20);
  frmOnlineQuiz.add(rdodouble);
  JRadioButton rdolong = new JRadioButton("long");//creates a unselected rediobutton with no text
  rdolong.setBounds(50,170,100,20);
  frmOnlineQuiz.add(rdolong);
  ButtonGroup bgque1 = new ButtonGroup();//manages the selected or unselected state for a set of buttons
  bgque1.add(rdoint);//adding to buttongroup
  bgque1.add(rdofloat);
  bgque1.add(rdodouble);
  bgque1.add(rdolong);

  JLabel lblque2 = new JLabel("Que2 : Which of the following is the advantage of BigDecimal over double?");//create a label with text
  lblque2.setBounds(30,80,900,250);//to set size
  frmOnlineQuiz.add(lblque2);
  JRadioButton rdosyntax = new JRadioButton("syntax");//create a unselected rediobutton with no text
  rdosyntax.setBounds(50,220,150,20);
  frmOnlineQuiz.add(rdosyntax);//add radiobutton to frame
  JRadioButton rdomemoryusage = new JRadioButton("memory usage");//create a unselected rediobutton with no text
  rdomemoryusage.setBounds(50,250,150,20);
  frmOnlineQuiz.add(rdomemoryusage);
  JRadioButton rdogarbage = new JRadioButton("garbage creation");//create a unselected rediobutton with no text
  rdogarbage.setBounds(50,280,150,20);
  frmOnlineQuiz.add(rdogarbage);
  JRadioButton rdoprecision = new JRadioButton("precision");//create a unselected rediobutton with no text
  rdoprecision.setBounds(50,310,150,20);
  frmOnlineQuiz.add(rdoprecision);
  ButtonGroup bgque2 = new ButtonGroup();//manages the selected or unselected state for a set of buttons
  bgque2.add(rdosyntax);//adding to buttongroup
  bgque2.add(rdomemoryusage);
  bgque2.add(rdogarbage);
  bgque2.add(rdoprecision);

  JLabel lblque3 = new JLabel("Que3 : Which of the following is not a Java features?");//create a label with text
  lblque3.setBounds(30,120,1350,500);//to set size
  frmOnlineQuiz.add(lblque3);
  JCheckBox chkdynamic = new JCheckBox("dynamic");//create an initially unselected checkbox with text
  chkdynamic.setBounds(50, 400, 200, 20);
  frmOnlineQuiz.add(chkdynamic);//add checkbox to frame
  JCheckBox chkarchitecture = new JCheckBox("architecture neutral");//create an initially unselected checkbox with text
  chkarchitecture.setBounds(50, 440, 200, 20);
  frmOnlineQuiz.add(chkarchitecture);
  JCheckBox chkpointers = new JCheckBox("use of pointers");//create an initially unselected checkbox with text
  chkpointers.setBounds(50, 480, 200, 20);
  frmOnlineQuiz.add(chkpointers);
  JCheckBox chkobject = new JCheckBox("object oriented");//create an initially unselected checkbox with text
  chkobject.setBounds(50, 520, 200, 20);
  frmOnlineQuiz.add(chkobject);

  JLabel lblque4 = new JLabel("Que4 : _____ is used to find and fix bugs in the Java programs.");//create a label with text
  lblque4.setBounds(30,160,1800,800);//to set size
  frmOnlineQuiz.add(lblque4);//add checkbox to frame
  JCheckBox chkJVM = new JCheckBox("JVM");//create an initially unselected checkbox with text
  chkJVM.setBounds(50, 580, 250, 20);
  frmOnlineQuiz.add(chkJVM);
  JCheckBox chkJRE = new JCheckBox("JRE");//create an initially unselected checkbox with text
  chkJRE.setBounds(50, 620, 250, 20);
  frmOnlineQuiz.add(chkJRE);
  JCheckBox chkJDK = new JCheckBox("JDK");//create an initially unselected checkbox with text
  chkJDK.setBounds(50, 660, 250, 20);
  frmOnlineQuiz.add(chkJDK);
  JCheckBox chkJDB = new JCheckBox("JDB");//create an initially unselected checkbox with text
  chkJDB.setBounds(50, 700, 250, 20);
  frmOnlineQuiz.add(chkJDB);

  JLabel lblque5 = new JLabel("Que5 : Is java platform independent?");//create a label with text
  lblque5.setBounds(30,200,1800,1070);//to set size
  frmOnlineQuiz.add(lblque5);//adding to frame
  String[] answers = {"yes","no"};//declararation of strings
  JList lstAns = new JList(answers);//create a jlist that displays the elements in the specified array
  lstAns.setBounds(50,745,300,40);
  frmOnlineQuiz.add(lstAns);//adding to frame 

  JButton btnSubmit = new JButton("Submit");//creat button with the specified text
  btnSubmit.setBounds(500,750,250,30);
  frmOnlineQuiz.add(btnSubmit);

  btnSubmit.addActionListener(new ActionListener(){ //method to invoke automatically whenever we click on the registered component
   public void actionPerformed(ActionEvent e){
     JOptionPane.showMessageDialog(frmOnlineQuiz, "Answers \n1.double \n2.precision \n3.use of pinters \n4.JDB \n5.yes"); //joptionpane class is used to provide standard dialog boxes ,here we use message dialog box
 }
 });
   frmOnlineQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//it is used to specify one of the several options for the close button
   frmOnlineQuiz.setSize(1000,1000); //used to set the size of the vector
   frmOnlineQuiz.setLayout(null);//we can position our components by using this
   frmOnlineQuiz.setVisible(true);//it makes the frame appear on the screen
 }
}
