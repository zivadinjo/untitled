package practice.abstraction;

public abstract class Employee extends Person{

    String jobTitle;
    double salary;

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
