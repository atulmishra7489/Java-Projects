public class Main {
    public static void main(String[] args) {
        BankAccount personOne = new BankAccount("Aman", 200000);

        personOne.withdraw(5000);

        System.out.println(personOne.getOwner());
        System.out.println(personOne.getBalance());

        personOne.deposit(2000);
        System.out.println(personOne.getBalance());
    }
}
