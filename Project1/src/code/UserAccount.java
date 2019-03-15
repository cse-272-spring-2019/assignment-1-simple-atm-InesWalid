package code;

import java.util.ArrayList;

public class UserAccount implements ATM
{
    private double balance;
    private String cardNumber;

    ArrayList<Transaction> history=new ArrayList<Transaction>();
    private int historyIndex;
    public UserAccount(double balance, String CardNo) {
        this.balance = balance;
        this.cardNumber = CardNo;
    }

    public double getBalanc() {
        return balance;
    }

    public void setBalanc(double balanc) {
        this.balance = balanc;
    }

    public String getCardNo() {
        return cardNumber;
    }

    public void setCardNo(String CardNo) {
        this.cardNumber = CardNo;
    }

    @Override
    public String getCurrentBalanc() {
        return balance + "";
    }

    @Override
    public void withdraw(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance - am;
        Transaction t = new Transaction ("withdraw",am);
        history.add(t);
        historyIndex = history.size() -1 ;
     
    }

    @Override
    public void deposit(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance + am;
        Transaction t = new Transaction ("withdraw",am);
        history.add(t);
        historyIndex = history.size() -1 ;
     
    }

    @Override
    public String prev() {
    	 
		if (historyIndex < 0) {
              return "no transactions";
          } else {
              Transaction t = history.get(historyIndex);
              historyIndex--;
              return t.getType() + " " + t.getAmount();
          }

    }

    @Override
    public String next() {
        historyIndex++;
        if (historyIndex > history.size() - 1) {
            return "no transactions";
        } else {
            Transaction t = history.get(historyIndex);

            return t.getType() + " " + t.getAmount();

        }
    }
}
