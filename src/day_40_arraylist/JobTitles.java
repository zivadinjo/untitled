package day_40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOP", "QA", "BA", "Chef", "Doctor", "Police Officer"));
        System.out.println("Original " + allJobs);

        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "BA"));
        System.out.println(jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer","DevOP", "PO"));
        System.out.println(jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef", "CEO")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "Nurse")));


    }
}
