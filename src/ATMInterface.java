//import java.sql.SQLOutput;
import java.util.*;

class ATM {
    float Balance;
    int PIN = 1234;

    public void checkPin() {
        System.out.print("Enter PIN : ");
        Scanner sc = new Scanner(System.in);
        int userPin = sc.nextInt();
        if (userPin == PIN) {
            menu();
        } else {
            System.out.println("Enter Valid PIN");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("\nSelect Option :");
        System.out.println("1. Check Current Balance");
        System.out.println("2. Deposite Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1){
            checkBalance();
        }else if(option == 2){
            depositeAmount();
        }else if(option == 3){
            withdrawAmount();
        }else if(option == 4){
            System.out.print("Returning to main menu");
            return;
        }else{
            System.out.print("Invalid option");
            menu();
        }
    }
    public void checkBalance(){
        System.out.print(Balance);
        menu();
    }

    public void depositeAmount(){
        System.out.println("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Amount Deposited Successfully");
        menu();
    }
    public void withdrawAmount(){
        System.out.println("Enter Amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Amount");
            menu();
        }else {
            Balance = Balance - amount;
            System.out.println("Amount Withdrawn Successfully");
            menu();
        }
    }
}

public class ATMInterface {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkPin();
    }
}
