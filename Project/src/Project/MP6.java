package Project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MP6 implements ActionListener {
public static void main(String[] args) {
MP6 m=new MP6();
m.newForm();
}
void newForm()
{
JFrame f1=new JFrame("Loan Interest Calc");
JLabel l1,l2,l3,l4,l5;
l4=new JLabel("PERSONAL DETAILS");
l4.setBounds(210,40, 150, 40);
l1=new JLabel("Frist Name:");
l1.setBounds(50,100, 150, 30);
l2=new JLabel("Middle Name:");
l2.setBounds(50,150,150,30);
l3=new JLabel("Lastname:");
l3.setBounds(50,200,150,30);
l5=new JLabel("Account No:");
l5.setBounds(50,250,150,30);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(l5);
JTextField t1,t2,t3,t4;
t1=new JTextField(" ");
t1.setBounds(150,100,150,30);

t2=new JTextField(" ");
t2.setBounds(150,150,150,30);
t3=new JTextField(" ");
t3.setBounds(150,200,150,30);
t4=new JTextField(" ");
t4.setBounds(150,250,150,30);
f1.add(t1); f1.add(t2);f1.add(t3);f1.add(t4);
JButton b=new JButton("Home Loan");
b.setBounds(100,450,150,30);
f1.add(b);
f1.setSize(500,600);
f1.setLayout(null);
f1.setVisible(true);
JButton b1=new JButton("Financial Loan");
b1.setBounds(300,450,150,30);
f1.add(b1);

f1.setSize(500,600);
f1.setLayout(null);
f1.setVisible(true);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String fn=t1.getText();
String mn=t2.getText();
String ln=t3.getText();
JFrame f2=new JFrame("Home Loan Calculator");
JLabel l1,l2,l3;
l1=new JLabel("Loan Amount:");
l1.setBounds(50,100, 150,30);
l2=new JLabel("Deposite Amount Duration(in year):");
l2.setBounds(50,150, 150,30);
l3=new JLabel("Simple InterestRate(%):");
l3.setBounds(50,200, 150,30);
f2.add(l1);
f2.add(l2);
f2.add(l3);
JTextField t1,t2;
t1=new JTextField("");
t1.setBounds(200,100, 150,30);
t2=new JTextField("");
t2.setBounds(200,150, 150,30);
Choice c1=new Choice();
c1.setBounds(200,200, 150,30);

c1.add("2");

f2.add(t1); f2.add(t2);f2.add(c1);
JButton b1=new JButton("Submit");
b1.setBounds(200,300, 150,30);
f2.setSize(500,500);
f2.setLayout(null);
f2.setVisible(true);
f2.add(b1);
f1.dispose();
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String principal=t1.getText();
String years=t2.getText();
String interest=c1.getSelectedItem();
int mp=((Integer.parseInt(principal)*Integer.parseInt(interest))/100)/12;
String mpay = Integer.toString(mp);
int tot=(Integer.parseInt(years)*12*mp)+Integer.parseInt(principal);
String total=Integer.toString(tot);
JFrame f3=new JFrame("Home Loan Monthly Details");
JLabel l1,l2,l3,l4,l5;
l4=new JLabel("Compute Monthly Loan Payments:");
l4.setBounds(210,40, 250, 40);
l1=new JLabel("Principal:");
l1.setBounds(50,100, 150, 30);

l2=new JLabel("Years:");
l2.setBounds(50,150,150,30);
l3=new JLabel("Interest Rate:");
l3.setBounds(50,200,150,30);
l5=new JLabel("MonthlyPayments:");
l5.setBounds(40,250,150,30);
f3.add(l1);
f3.add(l2);
f3.add(l3);
f3.add(l4);
f3.add(l5);
JTextField t1,t2,t3,t4;
t1=new JTextField(principal);
t1.setBounds(150,100,150,30);
t1.setEditable(false);
t2=new JTextField(years);
t2.setBounds(150,150,150,30);
t2.setEditable(false);
t3=new JTextField(interest);
t3.setBounds(150,200,150,30);
t3.setEditable(false);
t4=new JTextField(mpay);
t4.setBounds(150,250,150,30);
t4.setEditable(false);
f3.add(t1); f3.add(t2);f3.add(t3);f3.add(t4);
JButton b1=new JButton("Simple Interest");
b1.setBounds(100,350,150,30);
f3.add(b1);
f3.setSize(500,500);
f3.setLayout(null);
f3.setVisible(true);
f3.add(b1);
f2.dispose();
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JFrame f4=new JFrame("Grand Total:");
JLabel l1;
l1=new JLabel("Total Amount:");
l1.setBounds(50,50, 100,30);
f4.add(l1);
JTextField t1;
t1=new JTextField(total);
t1.setEditable(false);
t1.setBounds(150,50, 200,30);
f4.add(t1);
JButton b1=new JButton("ok");
b1.setBounds(100,150,95,30);
f4.add(b1);
JButton b2=new JButton("New Form");
b2.setBounds(200,150,95,30);
f4.add(b2);
f4.setSize(500,500);
f4.setLayout(null);
f4.setVisible(true);
f3.dispose();
b1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("ok")) {
JOptionPane.showMessageDialog(null, "Thank You:- "+fn+" "+mn+" "+ln);

System.exit(0);
}

}

});
b2.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("New Form")) {
f4.dispose();
newForm();
}

}

});
}
});
}
});
}
});
// financial loan
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String fn=t1.getText();
String mn=t2.getText();
String ln=t3.getText();
JFrame f2=new JFrame("Financial Loan Calculator");
JLabel l1,l2,l3;
l1=new JLabel("Loan Amount:");
l1.setBounds(50,100, 150,30);
l2=new JLabel("Deposite Amount Duration(in year):");
l2.setBounds(50,150, 150,30);
l3=new JLabel("Simple InterestRate(%):");
l3.setBounds(50,200, 150,30);
f2.add(l1);
f2.add(l2);
f2.add(l3);
JTextField t1,t2;
t1=new JTextField("");
t1.setBounds(200,100, 150,30);
t2=new JTextField("");
t2.setBounds(200,150, 150,30);
Choice c1=new Choice();
c1.setBounds(200,200, 150,30);
c1.add("1");
c1.add("2");
c1.add("3");
c1.add("4");
f2.add(t1); f2.add(t2);f2.add(c1);
JButton b1=new JButton("Submit");

b1.setBounds(200,300, 150,30);
f2.setSize(500,500);
f2.setLayout(null);
f2.setVisible(true);
f2.add(b1);
f1.dispose();
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String principal=t1.getText();
String years=t2.getText();
String interest=c1.getSelectedItem();
int mp=((Integer.parseInt(principal)*Integer.parseInt(interest))/100);
String mpay = Integer.toString(mp);
int tot=(Integer.parseInt(years)*12*mp)+Integer.parseInt(principal);
String total=Integer.toString(tot);
JFrame f3=new JFrame("Financial Loan Monthly Details");
JLabel l1,l2,l3,l4,l5;
l4=new JLabel("Compute Monthly Loan Payments:");
l4.setBounds(210,40, 250, 40);
l1=new JLabel("Principal:");
l1.setBounds(50,100, 150, 30);
l2=new JLabel("Years:");
l2.setBounds(50,150,150,30);
l3=new JLabel("Interest Rate:");
l3.setBounds(50,200,150,30);
l5=new JLabel("MonthlyPayments:");
l5.setBounds(40,250,150,30);
f3.add(l1);
f3.add(l2);
f3.add(l3);
f3.add(l4);
f3.add(l5);
JTextField t1,t2,t3,t4;
t1=new JTextField(principal);
t1.setBounds(150,100,150,30);
t1.setEditable(false);
t2=new JTextField(years);
t2.setBounds(150,150,150,30);
t2.setEditable(false);
t3=new JTextField(interest);
t3.setBounds(150,200,150,30);
t3.setEditable(false);
t4=new JTextField(mpay);
t4.setBounds(150,250,150,30);
t4.setEditable(false);
f3.add(t1); f3.add(t2);f3.add(t3);f3.add(t4);
JButton b1=new JButton("Simple Interest");
b1.setBounds(100,350,150,30);
f3.add(b1);
f3.setSize(500,500);
f3.setLayout(null);
f3.setVisible(true);
f3.add(b1);
f2.dispose();
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JFrame f4=new JFrame("Grand Total:");

JLabel l1;
l1=new JLabel("Total Amount:");
l1.setBounds(50,50, 100,30);
f4.add(l1);
JTextField t1;
t1=new JTextField(total);
t1.setEditable(false);
t1.setBounds(150,50, 200,30);
f4.add(t1);
JButton b1=new JButton("ok");
b1.setBounds(100,150,95,30);
f4.add(b1);
JButton b2=new JButton("New Form");
b2.setBounds(200,150,95,30);
f4.add(b2);
f4.setSize(500,500);
f4.setLayout(null);
f4.setVisible(true);
f3.dispose();
b1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("ok")) {
JOptionPane.showMessageDialog(null, "Thank You:- "+fn+" "+mn+" "+ln);

System.exit(0);
}

}

});
b2.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("New Form")) {
f4.dispose();
newForm();
}

}

});
}
});
}
});
}
});
}
@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
}}