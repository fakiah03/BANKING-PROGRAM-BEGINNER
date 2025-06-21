import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //JAVA BANKING SYSTEM AS BEGINNER
        double balance=0;
        boolean isrunning = true;
        int choice;

        while(isrunning) {

            System.out.println("*****************************");
            System.out.println("       BANKING PROGRAM       ");
            System.out.println("*****************************");
            System.out.println("     1. SHOW BALANCE");
            System.out.println("     2. DEPOSIT");
            System.out.println("     3. WITHDRAW");
            System.out.println("     4. EXIT");
            System.out.println("*****************************");

            System.out.println("Enter Your Choice : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isrunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("THANK YOU!");
        scanner.close();

    }
    //SHOW BALANCE
    static  void showbalance(double balance){
        System.out.println("*****************************");
        System.out.printf("$%.2f\n", balance);

    }


    //DEPOSIT
    static double deposit(){

        double amount ;
        System.out.println("Enter Your Deposit Amount");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Your Amount Cannot Less Than 0");
            return 0;
        }
        else{
            return amount;
        }
    }

    //WITHDRAW
    static double withdraw(double balance){

        double amount;

        System.out.println("Enter amount to be withdraw :");

        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

    // EXIT
}