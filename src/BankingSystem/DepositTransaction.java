package BankingSystem;

public class DepositTransaction extends Transaction {
    public DepositTransaction(int balance, int previousTransaction) {
        super(balance, previousTransaction);
    }

    @Override
    public void PerformTransaction(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("deposited");
        }
    }
}
