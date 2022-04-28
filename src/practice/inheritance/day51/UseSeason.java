package practice.inheritance.day51;

public class UseSeason {
    public static void main(String[] args) {

        Winter obj1= new Winter("Winter", 42,30);
        obj1.activity();
        System.out.println(obj1);
        Summer obj2 = new Summer("Summer",95.5,70.5);
        obj2.activity();
        System.out.println(obj2);
        Fall obj3 = new Fall("Fall",75,64);
        obj3.activity();
        System.out.println(obj3);
        Spring obj4 = new Spring("Spring",85,60);
        obj4.activity();
        System.out.println(obj4);

    }
}
