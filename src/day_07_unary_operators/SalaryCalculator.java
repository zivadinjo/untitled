package day_07_unary_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: "+ stateTaxRate+", Federeal tax rate: "+ federalTaxRate+" ,salary: "+salary+"\nTax amount: "+stateTax+", for state tax,and "+federalTax+" for federal. For total of "+totalTax+".\n After tax salary is "+ salaryAfterTax;

        System.out.println(taxReport);


    }
}
