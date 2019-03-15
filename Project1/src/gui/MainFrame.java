package gui;

import code.DepositFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import code.UserAccount;
import code.WithdrawFrame;
public class MainFrame  extends JFrame {  
	JButton withdraw = new JButton("Withdraw");
	JButton deposit = new JButton("deposit"); 
	JButton balance = new JButton("balance"); 
	JButton prev = new JButton("Prev");
	JButton next = new JButton("Next");
	JLabel label = new JLabel(".......");
	UserAccount acct; 
	
	public MainFrame(UserAccount ac)  {
		acct = ac; 
		setLayout(null); 
		withdraw.setBounds(70, 30, 150, 20);
		deposit.setBounds(70, 65, 150, 20);
		balance.setBounds(70, 100, 150, 20); 
		prev.setBounds(70, 135, 150, 20);
		next.setBounds(70, 170, 150, 20); 
		label.setBounds(70, 200, 150, 20);
		add(withdraw);
		add(deposit);
		add(balance); 
		add(prev); 
		add(next); 
		add(label); 
		 // getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //actionlogin();
        withdraw.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                WithdrawFrame w = new WithdrawFrame(acct);
                w.setVisible(true);
                w.setSize(400, 600);
            }
        });
         deposit.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DepositFrame w = new DepositFrame(acct);
                w.setVisible(true);
                w.setSize(400, 600);
                // setVisible(false);
            }
        });
        balance.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.getBalanc()+"");
            }
        });
         prev.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.prev());
            }
        });
         next.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.next());
            }
        });
    }
	}
	
	
	

