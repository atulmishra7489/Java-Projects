// created an employee class with some attributes and methods in it.

public class Employee{
    private static String name;
    private static int age;
    private double salary;
    private static String location;
    
    Employee(String name, int age,double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }
    public void raiseSalary(){
        this.salary = this.salary * 1.2; 
    }
    public double getsalary(){
        return this.salary;
    }
}