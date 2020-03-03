package com.example;

public class Main {

    public static void main(String[] args) {
        BankOperations bank = new Bank();
        initializeCustomers(bank);
        bank.generateReport();

    }

    private static void initializeCustomers(BankOperations bank) {
        Customer customer;
// Create several customers and their accounts
        bank.addCustomer("Will", "Smith",Branch.LA);
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Bradley", "Cooper", Branch.Boston);
        customer = bank.getCustomer(1);
        AccountOperations sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Jane", "Simms", Branch.Mumbai);
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant", Branch.Bangalore);
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley", Branch.LA);
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley",Branch.Bangalore);
        customer = bank.getCustomer(5);
        AccountOperations chkAcct = new CheckingAccount(100.00);

        customer.addAccount(chkAcct);

        if (chkAcct.withdraw(900.00)) {
            customer.addAccount(chkAcct);
            System.out.print(" withdraw is successful" + chkAcct.getBalance());
        }

    }
}
