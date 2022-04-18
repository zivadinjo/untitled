package day_33_methods;

public class GetCharacters {

    public static void upperACaseToZ(){
        for(char i = 'A'; i<= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void upperZCaseToA(){
        for(char i = 'Z'; i>= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void loweZCaseA() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void loweACaseZ() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void print0To9() {
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
