package code;

import java.util.ArrayList;

public class UserAccount implements ATM
{
    private double balance;
    private String cardNumber;

    ArrayList<Transaction> history=new ArrayList<Transaction>();
    private int histIndex;
    public UserAccount(double balance, String CardNo) {
        this.balance = balance;
        this.cardNumber = CardNo;
    }

    public double getBalanc() {
        return balance;
    }

    public void setBalance(double balance1) {
        this.balance = balance1 ;
    }

    public String getCardNo() {
        return cardNumber;
        
    }

    public void setCardNo(String CardNo) {
        this.cardNumber = CardNo;
    }

    @Override
    public String getCurrentBalance() {
        return balance + "";
    }

    @Override
    public void withdraw(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance - am;
        Transaction t = new Transaction ("withdraw",am);
        history.add(t);
        histIndex = history.size() -1 ;
     
    }

    @Override
    public void deposit(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance + am;
        Transaction t = new Transaction ("withdraw",am);
        history.add(t);
        histIndex = history.size() -1 ;
     
    }

    @Override
    public String previous() {
    	 
		if (histIndex < 0) {
              return "no transactions";
          } else {
              Transaction t = history.get(histIndex);
              histIndex--;
              return t.getType() + " " + t.getAmount();
          }

    }

    @Override
    public String next() {
        histIndex++;
        if (histIndex > history.size() - 1) {
            return "no transactions";
        } else {
            Transaction t = history.get(histIndex);

            return t.getType() + " " + t.getAmount();

        }
    }
}
