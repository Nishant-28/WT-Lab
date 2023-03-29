// Write a java program to create Account with 500 rupee minimum balance, deposit amount, withdraw amount and also throws LessBalanceException which returns the statement that says withdraw amount is not valid

import java.util.Scanner;

class LessBalanceException extends Exception
{
    public LessBalanceException(String s)
    {
        super(s);
    }
}

class Account
{
    private int balance;
    public Account(int balance)
    {
        this.balance = balance;
    }
    public void deposit(int amount)
    {
        balance += amount;
    }
    public void withdraw(int amount) throws LessBalanceException
    {
        if(balance - amount < 500)
            throw new LessBalanceException("Withdraw amount is not valid");
        else
            balance -= amount;
    }
    public int getBalance()
    {
        return balance;
    }
}

class q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Account a = new Account(1000);
        System.out.print("Enter amount to deposit: ");
        int d = sc.nextInt();
        a.deposit(d);
        System.out.print("Enter amount to withdraw: ");
        int w = sc.nextInt();
        try
        {
            a.withdraw(w);
        }
        catch(LessBalanceException e)
        {
            System.out.println(e);
        }
        System.out.println("Balance: " + a.getBalance());
    }
}
