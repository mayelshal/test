package BankingSystem;

public class SavingAccount extends Account{

    int interest ;

    int calculateInterest (){
        System.out.println("your interest is " + interest);
        return interest;
    }


    public SavingAccount(int accountNumber, String holderName, Double balance) {
        super(accountNumber, holderName, balance);
    }
}

