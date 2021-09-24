import java.util.ArrayList;

public class GoldCard extends Card {

    int discount;
    ArrayList<GoldCard> GoldAccounts = new ArrayList<>();



    public GoldCard(int cardId, String name, double credit, int discount) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        this.discount = discount;
    }


    public void createGoldAccounts() {
        GoldAccounts.add(new GoldCard(11, " Liam", 125.50, 5));
        GoldAccounts.add(new GoldCard(21, " Rochelle ", 1525.24, 5));
        GoldAccounts.add(new GoldCard(31, " Darren ", 155.25, 5));
        GoldAccounts.add(new GoldCard(41, " Cookie ", 1445.22, 5));
        GoldAccounts.add(new GoldCard(51, " Shaienne ", 875.36, 5));
        GoldAccounts.add(new GoldCard(61, " Alison", 134.25, 5));
        GoldAccounts.add(new GoldCard(71, " Peter", 177.86, 5));
        GoldAccounts.add(new GoldCard(81, " Patricia ", 1125.99, 5));
        GoldAccounts.add(new GoldCard(91, " Gilbert Goldy ", 1478.15, 5));

    }
    public GoldCard() {
    }

    @Override
    Card searchAccount(int number) {
        for (Card account : GoldAccounts) {
            if (number == account.getCardId()) {
                return GoldAccounts.get(this.cardId);
            }
            throw new IllegalArgumentException("Unable to find your account");
        } return null;
    }


    public void setDiscount(int discount) {
        if (this.discount <= 30 && this.discount >= 0) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("Discount out of bounds");
        }
    }

    @Override
    boolean createCard(int cardId, String name, double credit) {
        return false;
    }

    @Override
    boolean createCard(int cardId, String name, double credit, int discount) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        this.discount = discount;
        setDiscount(discount);
        GoldAccounts.add(this);
        return true;
    }

    @Override
    public String toString() {
        System.out.println(this.cardId + " " + name + " " + credit);
        return "";
    }

    @Override
    protected boolean pay(double amount) {
        double d = this.discount / 100.00;
        this.credit -= (amount * d);
        return true;
    }




}
