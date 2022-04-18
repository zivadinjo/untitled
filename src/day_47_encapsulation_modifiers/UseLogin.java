package day_47_encapsulation_modifiers;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";
        // cannot access private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

//        System.out.println(obj.username);
//        System.out.println(obj.password);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword()); // null is because it nedds to be longer than 8 characters defined in seter

        obj.setPassword("james007bond"); // calling set method to change pass

        System.out.println(obj.getPassword());


    }
}
