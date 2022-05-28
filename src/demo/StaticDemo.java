package demo;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Employee emp1 = new Employee();
        System.out.println(Employee.getCompanyName()); // static means use class name
    }
}

class Employee{
    private float salary ;
    private String name ;
    private int age;
    private static String companyName = "XYZ Company";
    public Employee(){
        System.out.println("IN default constructor...");
    }
    static {
        System.out.println("In static block. " + companyName);
        companyName = "ABC Company";
        System.out.println("Company is: " + companyName);
    }
    public static String getCompanyName(){
        System.out.println(companyName);
        return companyName;
    }


}