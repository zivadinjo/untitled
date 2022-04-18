package day_29_arrays;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson" , "     Willy Orange"};

        for (int i = 0; i < names.length; i++) {

            String fullName = names[i].trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();// trim deletes space,instead of trim method better is to add +1 at .indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

        }
        //-----FOR EACH LOOP-----
//        for (String str : names){
//
//            String fullName = str.trim();
//            String lastName = fullName.substring(fullName.indexOf(" ")).trim();// trim deletes space,instead of trim method better is to add +1 at .indexOf(" ") + 1
//
//            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));
//
//        }


    }
}
