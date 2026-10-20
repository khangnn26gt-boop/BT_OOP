package Bai2.Bai2_5;

public class Main {
    static void main(String[] args) {
        Customer customer = new Customer(1, "Hitori Goutoh", 'm');

        Account account = new Account(101, customer, 1000.0);

        System.out.println("Account: " + account);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Customer: " + account.getCustomerName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After deposit: " + account);

        account.withdraw(200);
        System.out.println("After withdrawal: " + account);

        account.withdraw(2000);
        System.out.println("Final account: " + account);
    }

}
