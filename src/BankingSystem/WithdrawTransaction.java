package BankingSystem;

public class WithdrawTransaction extends Transaction{
    public WithdrawTransaction(int balance, int previousTransaction) {
        super(balance, previousTransaction);
    }

    @Override
    public void PerformTransaction(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
            System.out.println("withDrawing occurred");
        }
    }
}
