
package atmsimulator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Deposit extends JFrame  implements ActionListener{
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    String email;
    CDate d=new CDate();
    
    Deposit(String pin,String e){
        this.pin = pin;
        this.email=e;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1366, 768);
        add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(330,260,400,35);
        l3.add(l1);
        
        t1.setBounds(330,310,320,25);
        l3.add(t1);
        
        b1.setBounds(635,379,150,35);
        l3.add(b1);
        
        b2.setBounds(635,424,150,35);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
            setSize(1366,768);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    //----------------------------------------------------------------------------------------------------------
                   
                   
                    String msg="Dear Customer : Your A/C is credited by "+amount+" \n"+d.cdateTimeFun();
                    SmsSender.sendEmail(msg,"Deposit "+amount , email);
                    
                    //-----------------------------------------------------------------------------------------------------------
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin,email).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pin,email).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
        public static void main(String[] args){
        new Deposit("","").setVisible(true);
    }
}
