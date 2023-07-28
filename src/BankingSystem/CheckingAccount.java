package BankingSystem;

public class CheckingAccount extends Account{

    void checkIssues (){
        System.out.println("issues checked");
    }


    public CheckingAccount(int accountNumber, String holderName, Double balance) {
        super(accountNumber, holderName, balance);
    }
}
