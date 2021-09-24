import java.math.BigDecimal;

public class GoldCard extends Card {

    int discount;


    public void setDiscount(int discount) {
        if (discount >= 1 && discount <= 30) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("Discount out of bounds");
        }
    }

    @Override
    void createCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    @Override
    void createCard(int cardId, String name, double credit, int discount) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        setDiscount(discount);
        this.printMyDetails();
    }

    @Override
    protected boolean pay(int amount) {
        this.credit = this.credit - (amount);
        System.out.println("You received a " +this.discount + "% discount for an amount of "+amount+" and remaining balance of "+this.credit);
        return true;
    }


}
