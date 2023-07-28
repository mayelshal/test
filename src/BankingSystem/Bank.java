package BankingSystem;


public class Bank extends Account implements BankingSystem{

    public Bank(int accountNumber, String holderName, Double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void createAccount() {



    }

    @Override
    public void deposit() {




    }

    @Override
    public void withdraw() {

    }

    @Override
    public String viewBalance() {
        return null;
    }
}
