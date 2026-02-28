package Oops;
/*  In Oops There are 4 Pillers
    1-Encapsulation
    2-Inheritance
    3-Abstraction
    4-Polymorphism

    1-Encapsulation
    -Binding data (variables) and methods (functions) into a single unit and restricting direct access to the data.
    -Hide internal data
👉  -Allow access only through controlled methods
    -Just like ATM machine
        -You cannot directly access bank balance — only through buttons (methods)
    -Getters and Setters (Core of Encapsulation)
        -Rules
          -Variables → private
          -Methods → public
 */

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("Deposited Amount " + amount);
        }else{
            System.out.println("Invalid Deposited Amount " + amount);
        }
    }

    public void withdraw(double amount){
        if(amount < balance && amount >= 0){
            balance -= amount;
            System.out.println("Withdrawal Amount " + amount);
        }
        else{
            System.out.println("Invalid Withdrawal Amount" + amount);
        }
    }

}

public class EncapsulationNotes {
    public static void main(String[] args) {
        BankAccount Dhiraj = new BankAccount("10203050", 500);
        System.out.println(Dhiraj.getAccountNumber());
        System.out.println(Dhiraj.getBalance());

        Dhiraj.deposit(500);
        System.out.println("After Deposited Balance is: " + Dhiraj.getBalance());

        Dhiraj.withdraw(-999.99);
        System.out.println("After Withdal Balance is: " + Dhiraj.getBalance());
    }
}
