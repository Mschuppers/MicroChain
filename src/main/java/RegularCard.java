public class RegularCard extends Card {


    @Override
    void createCard(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
        this.printMyDetails();
    }

    @Override
    void createCard(int cardId, String name, double credit, int discount) {
        throw new RuntimeException("Regularcards cannot get discounts");
    }

    @Override
    protected boolean pay(int amount) {
        if (this.credit > amount) {
            this.credit -= amount;
            return true;
        } else
            return false;
    }



}

