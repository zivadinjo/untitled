package day_58_exceptions.bank;

public class RunnerUserAccount {
    public static void main(String[] args) {

        Bank accountOne= new Bank();

        accountOne.balance=1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);


        accountOne.withdraw(2000);

    }
}
