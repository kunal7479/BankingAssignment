package com.atcs;
import java.util.*;


class Bank1{
    Scanner sc = new Scanner(System.in);
    private String name;
    //private int accNumber;
    private int mobNo;
    private String email;
    private String address;
    int balance;
    //private int deposit;
    //private int withdraw;
    public void openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Give your details for opening new account: ");

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your Mobile number");
        mobNo =  sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your email ");
        email =  sc.nextLine();

        System.out.println("Enter your home address");
        address =  sc.nextLine();

        System.out.println("Your Account is opened Successfully :)");
    }



}
class depositMoney extends Bank1{
    //int balance;
    int deposit;
    public void deposit(){
        System.out.println("Please enter your account number");
        int accNumber = sc.nextInt();

        System.out.println("Please Enter your available balance");
        balance = sc.nextInt();

        System.out.println("Enter the money you want to deposit");
        deposit = sc.nextInt();

        balance += deposit;
        //return balance;
        //return balance;
        //System.out.println(balance);

    }
    public void display(){
        System.out.println("Your Balance after Deposition: "+ "\n" + balance);
    }


}
class withdrawMoney extends Bank1{
    //int balance;
    int withdraw;
    public void withdraw(){

        System.out.println("Please enter your account number");
        int accNumber = sc.nextInt();

        System.out.println("Enter available balance");
        balance = sc.nextInt();

        System.out.println("Enter the money you want to withdraw");
        withdraw = sc.nextInt();

        if (withdraw<balance){
            System.out.println("You can Withdraw");
            balance = balance - withdraw;

        }
        else{
            System.out.println("You cant withdraw");
        }
    }
    public void display(){
        System.out.println("Your Balance after Withdrawal: "+ "\n" + balance);
    }

}
class closingAccount extends  Bank1{
    int accNumber;
    public void close(){
        System.out.println("Please Enter your account number");
        accNumber = sc.nextInt();
        System.out.println("your account is closed");

    }



}
//class displayBalanceD extends depositMoney {
//    //int balance;
//    public void display(){
//        System.out.println(balance);
//    }
//}


public class BankingSystem1 {
    public static void menu() {
        System.out.println("\n\t\t Main Menu ");
        System.out.println("\n\t 1. Open a New Account");
        System.out.println("\n\t 2. Deposit Money");
        System.out.println("\n\t 3. Withdrawal of Money");
        System.out.println("\n\t 4. Closing Account");
        System.out.println("\n\t 5. Display the Deposited balance");
        System.out.println("\n\t 6. Display the Withdrawal balance");
        System.out.println("\n\t 7. Exit");
        System.out.println("\n\t    Please enter your choice");

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Bank1 ob = new Bank1();
        //ob.openAccount();

        depositMoney dm = new depositMoney();
        //dm.deposit();
        withdrawMoney wm = new withdrawMoney();
        //wm.withdraw();
        closingAccount ca = new closingAccount();
        //ca.close();
        //displayBalanceD db = new displayBalanceD();
        //db.display();
        //displayBalanceW db1 = new displayBalanceW();

        int ch;
        do {
            do {
                menu();
                ch = sc.nextInt();
                if ((ch < 1) || (ch > 7)) {
                    System.out.println("\n Invalid choice .... try again");
                    continue;
                } else
                    break;
            } while (true);
            switch (ch) {
                case 1:
                    ob.openAccount();
                    break;
                case 2:
                    dm.deposit();
                    break;
                case 3:
                    wm.withdraw();
                    break;
                case 4:
                    ca.close();
                    break;
                case 5:
                    dm.display();
                    break;
                case 6:
                    wm.display();
                    break;
                case 7:
                    break;

            }
        } while (ch < 7);
    }



}
