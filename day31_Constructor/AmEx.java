package day31_Constructor;

public class AmEx {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
       account1.setInfo("Irina Orlova",123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(100);
        account1.checkBalance();

        System.out.println("------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Alexander", 987654321);

        System.out.println("Alex's balance is: "+account2.balance);
        account2.deposit(2000);
        account2.checkBalance();


    }
}
