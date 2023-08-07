/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmsimulator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Signup3  extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno,name,email;;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        //-------------------------------------------------------------
        ImageIcon bi1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image bi2 = bi1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
        ImageIcon bi3 = new ImageIcon(bi2);
        JLabel bl2 = new JLabel(bi3);
        bl2.setBounds(0, 0, 1300, 768);
        add(bl2);
        //-------------------------------------------------------------
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Form No:");
        l11.setForeground(Color.white);
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel(formno);
        l12.setForeground(Color.white);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.black);
        c1.setForeground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.black);
        c2.setForeground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
      c3.setBackground(Color.black);
        c3.setForeground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
       c4.setBackground(Color.black);
        c4.setForeground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
       c5.setBackground(Color.black);
        c5.setForeground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.black);
        c6.setForeground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
       c7.setBackground(Color.black);
        c7.setForeground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.black);
        r1.setForeground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.black);
        r2.setForeground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.black);
        r3.setForeground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.black);
        r4.setForeground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        
        setLayout(null);
        
        l11.setBounds(700,10,70,30);
        bl2.add(l11);
        
        l12.setBounds(770,10,40,30);
        bl2.add(l12);
        
        l1.setBounds(280,40,400,40);
        bl2.add(l1); 
        
        l2.setBounds(100,120,200,30);
        bl2.add(l2);
        
        r1.setBounds(100,160,150,30);
        bl2.add(r1);
        
        r2.setBounds(350,160,300,30);
        bl2.add(r2);
        
        r3.setBounds(100,200,250,30);
        bl2.add(r3);
        
        r4.setBounds(350,200,250,30);
        bl2.add(r4);
        
        l3.setBounds(100,280,200,30);
        bl2.add(l3);
        
        l4.setBounds(330,280,250,30);
        bl2.add(l4);
        
        l5.setBounds(100,310,200,20);
        bl2.add(l5);
        
        l6.setBounds(330,310,500,20);
        bl2.add(l6);
        
        l7.setBounds(100,350,200,30);
        bl2.add(l7);
        
        l8.setBounds(330,350,200,30);
        bl2.add(l8);
        
        l9.setBounds(100,380,200,20);
        bl2.add(l9);
        
        l10.setBounds(100,430,200,30);
        bl2.add(l10);
        
        c1.setBounds(100,480,200,30);
        bl2.add(c1);
        
        c2.setBounds(350,480,200,30);
        bl2.add(c2);
        
        c3.setBounds(100,530,200,30);
        bl2.add(c3);
        
        c4.setBounds(350,530,200,30);
        bl2.add(c4);
        
        c5.setBounds(100,580,200,30);
        bl2.add(c5);
        
        c6.setBounds(350,580,200,30);
        bl2.add(c6);
        
        c7.setBounds(100,630,600,20);
        bl2.add(c7);
        
        b1.setBounds(250,680,100,30);
        bl2.add(b1);
        
        b2.setBounds(420,680,100,30);
        bl2.add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,0);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    String emailQ ="select * from signup where formno='"+formno+"'";
                    
                    ResultSet rs=c1.s.executeQuery(emailQ);
                    
                    while(rs.next()){
                        email=rs.getString("email");
                        String name=rs.getString("name"),fname=rs.getString("father_name"),dob=rs.getString("dob"),gender=rs.getString("gender"),mari=rs.getString("marital_status"),add=rs.getString("address"),city=rs.getString("city"),pincode=rs.getString("pincode"),state=rs.getString("state");   
                        String msg="Congratulaion \n Your Account has been Created Successfully \n Your Debit card no : "+cardno+"\n Pin  : "+pin+ "\n\n\n\n\n\n Details \n Name           : "+name+" "+fname+"\n Birth Date     : "+dob+"\n Gender         : "+gender+"\n marital status : "+mari+"\n Address        : "+add+"\n City           : "+city+"\n State          : "+state+"\n pin code       : "+pincode;
                        SmsSender.sendEmail(msg,"Account Created Successfully" , email);
                        
                        
                    }
                    
                  
                    
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(cardno,email).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }   
}

