using System;

class BankAccount
{
    private string accountNumber;
    private string accountHolder;
    private double balance;

    // Constructor
    public BankAccount(string accountNumber, string accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        Console.WriteLine("Deposit Successful!");
    }

    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            Console.WriteLine("Withdrawal Successful!");
        }
        else
        {
            Console.WriteLine("Insufficient Balance!");
        }
    }

    public void displayBalance()
    {
        Console.WriteLine("Current Balance: " + balance.ToString("F2"));
    }
}

class BankDemo
{
    static void Main(string[] args)
    {
        BankAccount acc = new BankAccount("123456", "Maria Santos", 5000.00);

        acc.deposit(1000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}
