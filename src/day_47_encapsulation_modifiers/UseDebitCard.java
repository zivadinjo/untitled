package day_47_encapsulation_modifiers;

public class UseDebitCard {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        System.out.println();
        DebitCard obj1 = new DebitCard(1234567893682581L,"James", 1000000);
        System.out.println(obj1);

        System.out.println();

        DebitCard obj2 = new DebitCard(123456789368L,"James", 1000000);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println();
        DebitCard obj3 = new DebitCard(1234567893682581L,"James", "Visa",7000, 1000000);
        System.out.println(obj3);

        System.out.println();
        DebitCard obj4 = new DebitCard(1234567893682L,"James", "Money",700, 1000000);
        System.out.println(obj4);

    }
}
