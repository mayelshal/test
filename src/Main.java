
import BankingSystem.BankAccount;
import BankingSystem.SavingAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount B1 = new BankAccount(123457,"MAY",1200.0);


        B1.setEmail("may.mostafa@gmail.com");
        System.out.println("email : " +B1.getEmail());
        B1.setUsername("may");
        System.out.println("user name: " +B1.getUsername());
        B1.setPassword(123456);
        System.out.println("password; " + B1.getPassword());
        B1.setMobileNumber("01215678899");
        System.out.println("mobile number :" + B1.getMobileNumber());
        System.out.println("account number: " +B1.getAccountNumber());
        System.out.println("holder name: " +B1.getHolderName());
        System.out.println("Your available balance is: " +B1.getBalance());
        System.out.println("  ");

        B1.deposit(200);
        B1.withdrawing(-100);










    }
}