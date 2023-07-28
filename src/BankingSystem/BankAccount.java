package BankingSystem;

import java.security.PrivateKey;

public class BankAccount {

    private int accountNumber;
    private String holderName;
    private Double balance;

    private String email;

    private int password ;
    private String username;
    private  String mobileNumber;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int previousTransaction;

    public BankAccount(int accountNumber, String holderName, Double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }




    public void  deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("deposited");
        }
    }

    public void withdrawing(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
            System.out.println("withDrawing occurred");
        }


    }
}




