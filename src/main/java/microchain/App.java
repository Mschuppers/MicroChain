package microchain;

import java.util.Scanner;

public class App {
    static RegularCard a = new RegularCard();
    static GoldCard b = new GoldCard();

    static boolean nextChoice = true;

    public static void main(String[] args) {

        a.createRegularAccounts();
        b.createGoldAccounts();


       // while (nextChoice) {
            run(1);
            run(2);
            run(3);
       // }
    }


    static boolean run(int input) {


        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Select one of our services");
        System.out.println("1) Show Regular users");
        System.out.println("2) Show microchain.GoldCard users");
        System.out.println("3) Make Payment");
        System.out.println("0) Exit app");
        int inputA = input;//menuChoice.nextInt();

        switch (inputA) {
            case 1:
                System.out.println(a.regCard);
                break;
            case 2:
                System.out.println(b.goldCard);
                break;
            case 3:
                System.out.println("Select account");
                int searchId = 1;//menuChoice.nextInt();

                try {
                    RegularCard r = a.searchAccount(searchId);
                    System.out.println("Insert amount");
                    double amount =100; //menuChoice.nextDouble();
                    r.pay(amount);
                }catch (IllegalArgumentException e){
                    GoldCard g = b.searchAccount(searchId);
                    System.out.println("Insert amount");
                    double amount = 100;//menuChoice.nextDouble();
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
