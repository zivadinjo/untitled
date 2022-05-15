package day_58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super ("Not enough money in the account");
    }
    public NotEnoughMoneyException(String msg){
        super(msg);
    }

}
