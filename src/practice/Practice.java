package practice;

public class Practice {
    public static void main(String[] args) {


        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        double salary = 200_000;
        int startDay = 10;
        int startMonth = 1;
        int startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAddres = "One Apple Park Way, Cupertino, CA, 95014";

        String fullName = firstName +" "+ lastName;
        String fullStartDate = startMonth +""+startDay+","+startYear;
        String email = firstName+fullStartDate + "@" +companyName+".com";
        double salaryAfetrTwoYears = salary+salary*0.15;

        System.out.println("Employe Information");
        System.out.println("We have "+fullName+"joining "+ companyName);
        System.out.println(firstName+" will start on "+ fullStartDate+" as full time: "+ fullTime);
        System.out.println(firstName+" here is some information about your employment\nYor email is : "+email+"\nYour base salary is $ "+ salary+" and after 2 years it will be "+salaryAfetrTwoYears+"\nWelcome aboard,see you at "+officeAddres);




     /*   We have FULL_NAME joining COMPANY_NAME
        FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
        FIRST_NAME here is some information about your employment
        Your email is EMAIL
        Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
        Welcome aboard, see you at ADDRESS */
    }
}
