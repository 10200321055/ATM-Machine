import java.util.Scanner;

public class AtmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deposit, withdraw;
        int balance = 10000;
        while (true) {
            System.out.println("Choose 1. for deposit: ");
            System.out.println("Choose 2. for withdraw: ");
            System.out.println("Choose 3. for balance inquiry: ");
            System.out.println("Choose 4. for exit: ");
            System.out.println("Choose correct operation to perform: ");

            int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount you want to deposit: ");
                deposit = sc.nextInt();
            balance = balance + deposit;
                System.out.println("Your updated balance is: " + balance);
                System.out.println();
                break;
            case 2:
                System.out.println("Enter amount for withdraw: ");
                withdraw = sc.nextInt();
                if(balance >= withdraw){
            balance = balance - withdraw;
                }else{
                    System.out.println("Insufficient funds.......!");
                }
                break;
            case 3:
                System.out.println("Your account balance is: " + balance);
                System.out.println();
                break;
            case 4:
                System.exit(0);
                break;
        
            default:
                System.out.println("Thanks for visiting");
                break;
        }
        }
    }
}
