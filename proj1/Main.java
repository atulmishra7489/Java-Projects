public class Main {
    public static void main(String[] args) {
        Employee  EmployeeOne = new Employee("Atul",25,10000,"Rewa");
        Employee  EmployeeTwo = new Employee("Aman",23,10000,"Jhansi");

        EmployeeOne.raiseSalary();

        System.out.println(EmployeeOne.getsalary());
        System.out.println(EmployeeTwo.getsalary());
    }
    
}
