package BankingSystem;

public abstract class Transaction {
    int balance;
    int previousTransaction;

    public Transaction(int balance, int previousTransaction) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
    }

    public abstract void PerformTransaction(int amount);
}



