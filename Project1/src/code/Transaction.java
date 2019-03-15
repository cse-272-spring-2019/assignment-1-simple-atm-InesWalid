package code;

public class Transaction {
	private String transtype;
    private double amount;

    public Transaction(String gender, double amount) {
        this.transtype = gender;
        this.amount = amount;
    }

    public String getType() {
        return transtype;
    }

    public void setGender(String gender) {
        this.transtype = gender;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
