import java.util.ArrayList;

public class RegularCard extends Card {


    ArrayList<RegularCard> Accounts = new ArrayList<>();

    public RegularCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }


    public void createRegularAccounts() {
        Accounts.add(new RegularCard(1," Bobby Mc Gee",125.50));
        Accounts.add(new RegularCard(2, " Jamy Cooker ", 1525.24));
        Accounts.add(new RegularCard(3, " Lindsy Broham ", 155.25));
        Accounts.add(new RegularCard(4, " Karel Kurfusterdam ", 1445.22));
        Accounts.add(new RegularCard(5, " Reina Royal ", 875.36));
        Accounts.add(new RegularCard(6, " Elisa Fur", 134.25));
        Accounts.add(new RegularCard(7, " Joshua James", 177.86));
        Accounts.add(new RegularCard(8, " J.Edgar.Mover ", 1125.99));
        Accounts.add(new RegularCard(9, " Chris d'Oc ", 1478.15));

    }
    public RegularCard() {
    }



    @Override
    Card searchAccount(int number) {
        for (Card account : Accounts) {
            if (number == account.getCardId()) {
                return Accounts.get(cardId);
            }
            throw new
                    IllegalArgumentException("Unable to find your account");
        } return null;
    }


    @Override
    boolean createCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        Accounts.add(this);
        return true;
    }

    @Override
    boolean createCard(int cardId, String name, double credit, int discount) {
        throw new RuntimeException("Regularcards cannot get discounts");
    }


    @Override
    public String toString() {
        System.out.println(cardId + " " + name + " " + credit);
        return "";
    }


    @Override
    protected boolean pay(double amount) {
        if (this.credit > amount) {
            System.out.println(credit +" "+ amount);
            this.credit -= amount;
            System.out.println("Paid an amount of $"+amount+" , balance is now $"+credit);

            return true;
        } else
            throw new IllegalArgumentException("Account is insufficient");
    }


}

