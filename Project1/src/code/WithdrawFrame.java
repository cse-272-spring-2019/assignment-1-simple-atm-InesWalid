package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WithdrawFrame extends JFrame {
    JButton withdraw = new JButton("withdraw");
    JLabel label = new JLabel(" amount");
    JTextField txt = new JTextField(12);
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    UserAccount ac;
    JPanel p =new JPanel();
    JPanel q= new JPanel(); 
    public WithdrawFrame(UserAccount a) {
        ac = a;
        
     

    
setLayout(null);
        label.setBounds(70, 30, 150, 20);
        txt.setBounds(70, 65, 170, 20);
        withdraw.setBounds(80, 100, 120, 20);
        zero.setBounds(70, 200, 50, 50);
        one.setBounds(130, 200, 50, 50);
        two.setBounds(190, 200, 50, 50);
        three.setBounds(70, 250, 50, 50);
        four.setBounds(130, 250, 50, 50);
        five.setBounds(190, 250, 50, 50);
        six.setBounds(70, 300, 50, 50);
        seven.setBounds(130, 300, 50, 50);
        eight.setBounds(190, 300, 50, 50);
        nine.setBounds(130, 350, 50, 50);
        withdraw.setBackground(Color.red);

        add(label);
        add(txt);
        add(withdraw);
       
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(p,BorderLayout.CENTER);

        add(q,BorderLayout.NORTH);
        withdraw.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               if(Double.parseDouble(txt.getText())<ac.getBalanc()) { 
            	ac.withdraw(txt.getText());
                setVisible(false);
            }
               else 
                   JOptionPane.showMessageDialog(null,"sorry your balance isn't enough");
        }
        });
        
	        zero.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText() + "0");
	            }
	        });
	        one.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText() + "1");
	            }
	        });
	        two.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText() + "2");
	            }
	        });
	        three.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText() + "3");
	            }
	        });
	        four.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	               txt.setText(txt.getText()+"4");
	            }
	        });
	        five.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText() + "5");
	            }
	        });
	        six.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             txt.setText(txt.getText()+"6");
	            }
	        });
	        seven.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txt.setText(txt.getText()+"7");
	            }
	        });
	        eight.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            txt.setText(txt.getText()+"8");
	            }
	        });
	        nine.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             txt.setText(txt.getText()+"9");
	            }
	        });
    }
                }



