package day_58_exceptions.bank;

public class Bank {

    double balance;

    public void withdraw(double amountToTakeOut){

        if (amountToTakeOut > balance){
            throw new NotEnoughMoneyException();
        }

        balance -= amountToTakeOut;

    }

}

/*
        if(amountToTakeOut > balance){
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;
        }
 */