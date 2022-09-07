package com.mycompany.mini;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Registration {
  JFrame frmRegistration;//to construct a frame
  JLabel lblFirstName,lblLastName,lblUSN,lblGender,lblBranch,lblemail;//initialization
  JTextField txtFirstName,txtLastName,txtUSN,txtemail;
  JRadioButton rdoMale,rdoFemale;
  JButton btnSubmit;

  public void addControls(){
    lblFirstName=new JLabel("First Name:");//create a label with text
    lblFirstName.setBounds(50,50,100,30);//set the sizes
    frmRegistration.add(lblFirstName);//adding to frame
    txtFirstName=new JTextField(" ");//create a new textfield initialized with the specified text and columns
    txtFirstName.setBounds(150,50,150,30);
    frmRegistration.add(txtFirstName);

    lblLastName=new JLabel("Last Name:");//create a label with text
    lblLastName.setBounds(50,100,100,30);//set the sizes
    frmRegistration.add(lblLastName);//adding to frame
    txtLastName=new JTextField(" ");//create a new textfield initialized with the specified text andcolumns
    txtLastName.setBounds(150,100,150,30);
    frmRegistration.add(txtLastName);

    lblUSN=new JLabel("USN:");//create a label with text
    lblUSN.setBounds(50,150,100,30);//set the sizes
    frmRegistration.add(lblUSN);//adding to frame
    txtUSN=new JTextField(" ");//create a new textfield initialized with the specified text and columns
    txtUSN.setBounds(150,150,150,30);
    frmRegistration.add(txtUSN);

    btnSubmit = new JButton("Submit");
    btnSubmit.setBounds(100,350,150,30);//set the sizes
    frmRegistration.add(btnSubmit);

    lblGender=new JLabel("Gender:");//create a label with text
    lblGender.setBounds(50,250,100,30);//set the sizes
    frmRegistration.add(lblGender);

    rdoMale= new JRadioButton("rdoMale= new JRadioButton("Male");//creates a unselected rediobutton with no text
    rdoMale.setBounds(150,250,80,30);
    frmRegistration.add(rdoMale);//adding to frame
    rdoFemale = new JRadioButton("Female");//creates a unselected rediobutton with no text
    rdoFemale.setBounds(250,250,80,30);
    frmRegistration.add(rdoFemale);
    ButtonGroup bgGender = new ButtonGroup();//manages the selected or unselected state for a set of buttons
    bgGender.add(rdoMale);//adding to buttongroup
    bgGender.add(rdoFemale);

    lblBranch = new JLabel("Branch:");//create a label with text
    lblBranch.setBounds(50,200,100,30);//set the sizes
    frmRegistration.add(lblBranch);//adding to frame
    String branches[] = {"CSE", "ELN", "EEE","CIVIL","MECH"};
    JComboBox cmbBranch = new JComboBox(branches);//create a jcombobox that contains the elements in the specified array
    cmbBranch.setBounds(150,200,100,30);
    frmRegistration.add(cmbBranch);//adding to frame

    lblemail=new JLabel("Email ID:");//create a label with text
    lblemail.setBounds(50,300,100,30);//set the sizes
    frmRegistration.add(lblemail);//adding to frame
    txtemail=new JTextField(" ");//create a new textfield initialized with the specified text and columns
    txtemail.setBounds(150,300,150,30);
    frmRegistration.add(txtemail);
 }

 public void addActionListeners(){
    btnSubmit.addActionListener(new ActionListener(){ //method to invoke automatically whenever we click on the registered component
    public void actionPerformed(ActionEvent e){
    String s1 = txtFirstName.getText(); //to get text from the user
    String s2 = txtLastName.getText();
    String s3 = txtUSN.getText();
    String s4 = txtemail.getText();
    JOptionPane.showMessageDialog(frmRegistration, "Submitted");//optionpane class is used to provide standard dialog boxes , herw we use message dialog box
 }
 });
}

public void displayFrame(){
    frmRegistration = new JFrame("Registration Form");//give name to the frame
    frmRegistration.setSize(500, 500);//used to set the size of the vector
    frmRegistration.setResizable(false);//user cannot resize the frame
    addControls();
    addActionListeners();
    frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//it is used to specify one of the several options for the close button
    frmRegistration.setLayout(null);//we can position our components by using this
    frmRegistration.setVisible(true);//it makes the frame appear on the screen
 }
                              
 public static void main(String args[]){
    Registration reg = new Registration();
    reg.displayFrame();
 }
}
