import java.util.ArrayList;

public class RegularCard extends Card {

    @Override
    public int getCardId() {
        return cardId;
    }

    ArrayList<RegularCard> regCard = new ArrayList<>();

    public RegularCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }


    public void createRegularAccounts() {
        regCard.add(new RegularCard(1, " Bobby Mc Gee", 125.50));
        regCard.add(new RegularCard(2, " Jamy Cooker ", 1525.24));
        regCard.add(new RegularCard(3, " Lindsy Broham ", 155.25));
        regCard.add(new RegularCard(4, " Karel Kurfusterdam ", 1445.22));
        regCard.add(new RegularCard(5, " Reina Royal ", 875.36));
        regCard.add(new RegularCard(6, " Elisa Fur", 134.25));
        regCard.add(new RegularCard(7, " Joshua James", 177.86));
        regCard.add(new RegularCard(8, " J.Edgar.Mover ", 1125.99));
        regCard.add(new RegularCard(9, " Chris d'Oc ", 1478.15));

    }

    public RegularCard() {
    }


    @Override
    public RegularCard searchAccount(int number) {

        for (RegularCard account : regCard) {

            if (number == account.getCardId()) {
                return account;
            }
        }

        throw new IllegalArgumentException();
    }


    @Override
    boolean createCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        regCard.add(this);
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
    protected boolean pay( double amount) {

        if (this.credit > amount) {
            System.out.println(credit + " " + amount);
            this.credit -= amount;
            System.out.println("Paid an amount of $" + amount + " , balance is now $" + credit);

            return true;
        } else
            throw new IllegalArgumentException("Account is insufficient");
    }


}

