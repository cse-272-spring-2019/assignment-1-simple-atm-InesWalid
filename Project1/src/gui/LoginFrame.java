package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import code.UserAccount;

public class LoginFrame extends JFrame {
	 
	    JButton login = new JButton("Validate");
	    JLabel CardNumber = new JLabel("Card Number");
	    JTextField TextCardNumber = new JTextField(50);
	    
	    JButton one = new JButton("1");
	    JButton two = new JButton("2");
	    JButton three = new JButton("3");
	    JButton four = new JButton("4");
	    JButton five = new JButton("5");
	    JButton six = new JButton("6");
	    JButton seven = new JButton("7");
	    JButton eight = new JButton("8");
	    JButton nine = new JButton("9");
            JButton zero = new JButton("0");
	    
	    UserAccount a=new UserAccount(0,"0000");
	    
	    public LoginFrame() {
	        setLayout(null);
	        
	        CardNumber.setBounds(20, 30, 150, 20);
	        TextCardNumber.setBounds(110, 30, 150, 20);
	        login.setBounds(110, 60, 150, 20);
	        	        login.setBackground(Color.GREEN);

	        	        login.setForeground(Color.blue);
                one.setBounds(70, 120, 50, 50);
	        two.setBounds(130, 120, 50, 50);
	        three.setBounds(190, 120, 50, 50);
	        four.setBounds(70, 170, 50, 50);
	        five.setBounds(130, 170, 50, 50);
	        six.setBounds(190, 170, 50, 50);
	        seven.setBounds(70, 220, 50, 50);
	        eight.setBounds(130, 220, 50, 50);
	        nine.setBounds(190,220, 50, 50);
	        zero.setBounds(130, 270, 50, 50);
	        add(login);
	        add(CardNumber);
	        add(TextCardNumber);
	        
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
	        
	        // getContentPane().add(panel);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	        //actionlogin();

	        zero.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"0";
	                TextCardNumber.setText(currenttext);
	            }
	        });
	        one.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
                        
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"1";
	                TextCardNumber.setText(currenttext);
	            }
	        });
	        two.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"2";
	                TextCardNumber.setText(currenttext);
	            }
	        });
	        three.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"3";
	                TextCardNumber.setText(currenttext);}
	        });
	        four.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
                        
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"4";
	                TextCardNumber.setText(currenttext);
	            }
	        });
	        five.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"5";
	                TextCardNumber.setText(currenttext);}
	        });
	        six.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"6";
	                TextCardNumber.setText(currenttext);}
	        });
	        seven.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"7";
	                TextCardNumber.setText(currenttext);}
	        });
	        eight.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"8";
	                TextCardNumber.setText(currenttext);}
	        });
	        nine.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            
                        String currenttext=TextCardNumber.getText();
                        currenttext=currenttext+"9";
	                TextCardNumber.setText(currenttext);}
	        });
	        login.addActionListener(new ActionListener() { 
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (TextCardNumber.getText().equals(a.getCardNo())) {
	                    MainFrame v = new MainFrame(a);
	                    v.setVisible(true);
	                    v.setSize(400, 400);
	                    setVisible(false);
	                } else {
	                    JOptionPane.showMessageDialog(null, "error");
	                }
	            }
	        });
	    }
public static void main(String[] args) {
	        LoginFrame v =new LoginFrame();
	        v.setVisible(true);
	        v.setSize(400, 400);
	    }
}
