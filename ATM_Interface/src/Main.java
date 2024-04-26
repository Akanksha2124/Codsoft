import java.util.Scanner;

class BankAccount{
    private int balance;

    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("The amount " + amount + " Rs was deposited successfully");
        } else {
            System.out.println("Please choose a valid amount.");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Withdrawl of "+amount+"Rs was successful");
            balance-=amount;
        } else {
            System.out.println("invalid amount");
        }
    }
}

class ATM{

    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Leave");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int transaction_type;
        do{
            display();
            System.out.println("Pick any transaction");
            transaction_type = sc.nextInt();

            switch (transaction_type){
                case 1:
                    System.out.println("Enter amount to deposit");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance " + account.balance());
                    break;
                case 4:
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("Invalid entry!!. Enter only the given options");
            }
        }while (transaction_type != 4);
        sc.close();;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(50000);
        ATM atm = new ATM(userAccount);
        System.out.println("Enter Your PIN");
        int pin = sc.nextInt();
        if (pin == 1234) {
            atm.run();
        }
        else {
            System.out.println("Wrong pin");
        }


    }
}