public class App {

    public static void main(String[] args) {
        run();

    }

    private static void run() {
        Card a = new RegularCard();
        a.createCard(1, "Bob Hendrix", 10.12);
        Card b = new GoldCard();
        b.createCard(2,"Jimmy Dylan", 250.00,1);
        b.pay(100);
    }
}
