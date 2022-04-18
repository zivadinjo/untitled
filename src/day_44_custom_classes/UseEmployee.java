package day_44_custom_classes;

public class UseEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James","agent");
        System.out.println(employee1);

        Employee employee2 = new Employee("James", 007,"agent", 125000);
        System.out.println(employee2);

        employee1.goToMeeting();
        employee2.goToMeeting();


    }
}
