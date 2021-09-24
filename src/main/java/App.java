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

        switch (inputA) {
            case 1:
                System.out.println(a.regCard);
                break;
            case 2:
                System.out.println(b.goldCard);
                break;
            case 3:
                System.out.println("Select account");
                int searchId = menuChoice.nextInt();

                try {
                    RegularCard r = a.searchAccount(searchId);
                    System.out.println("Insert amount");
                    double amount = menuChoice.nextDouble();
                    r.pay(amount);
                }catch (IllegalArgumentException e){
                    GoldCard g = b.searchAccount(searchId);
                    System.out.println("Insert amount");
                    double amount = menuChoice.nextDouble();
                    g.pay(amount);
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
