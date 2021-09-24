import java.util.Scanner;

public class App {
    static RegularCard a = new RegularCard();
    static GoldCard b = new GoldCard();

    static boolean nextChoice = true;

    public static void main(String[] args) {


        a.createRegularAccounts();
        b.createGoldAccounts();


        while (nextChoice) {
            run();
        }
    }


    static boolean run() {


        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Select one of our services");
        System.out.println("1) Show Regular users");
        System.out.println("2) Show GoldCard users");
        System.out.println("3) Make Payment");
        int inputA = menuChoice.nextInt();
        int searchId;
        double amount;

        switch (inputA) {
            case 1:
                System.out.println(a.Accounts);
                break;
            case 2:
                System.out.println(b.GoldAccounts);
                break;
            case 3:
                System.out.println("Gold member? Y/N");
                String inputB = menuChoice.next();
                switch (inputB) {
                    case ("N"):
                    case ("n"):
                        System.out.println("Select account");
                        searchId = menuChoice.nextInt();

                        System.out.println("Insert amount");
                        amount = menuChoice.nextDouble();

                        a.searchAccount(searchId).pay(amount);
                        break;
                    case ("Y"):
                    case ("y"):
                        System.out.println("Select account");
                        searchId = menuChoice.nextInt();

                        System.out.println("Insert amount");
                        amount = menuChoice.nextDouble();

                        b.searchAccount(searchId).pay(amount);
                        break;
                }

            case 0:
                System.out.println("Goodbye");
                return !nextChoice;


            default:
                System.out.println("Incorrect entry, try again");
                return !nextChoice;
        }
        return false;
    }
}
