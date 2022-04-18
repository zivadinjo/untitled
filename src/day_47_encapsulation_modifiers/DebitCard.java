package day_47_encapsulation_modifiers;

public class DebitCard {

    long cardNumber;
    String cardHolder;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {
        System.out.println("Static block running");
        accountType = "Checking";

    }


    public DebitCard(long cardNumber, String cardHolder, double balance) {

        this.cardHolder = cardHolder;
        this.balance = balance;

        if (String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number");
        }
    }

    public DebitCard(long cardNumber, String cardHolder, String cardType, int pin, double balance) {
        this(cardNumber, cardHolder, balance);
        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")) {

            this.cardType = cardType;
        } else {
            System.out.println("Invalid Cart type - must be Visa or Mastercard");
        }
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin - Must be 4 digits");
        }

    }

    @Override
    public String toString() {
        String info = "Holder name: " + cardHolder;
        if (cardNumber != 0) {
            info += "\nCard number: " + cardNumber;
        }
        if (cardType != null) {
            info += "\nCard type: " + cardType;
        }

        info += "\nBalance: " + balance;

        return info;
    }
}
