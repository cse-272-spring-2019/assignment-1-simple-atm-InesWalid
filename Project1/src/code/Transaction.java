package code;

public class Transaction {
	private String type;
    private double amount;

    public Transaction(String gender, double amount) {
        this.type = gender;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setGender(String gender) {
        this.type = gender;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
