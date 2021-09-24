

public abstract class Card {

    //Fields required
    protected int cardId;
    protected String name;
    protected double credit;


    //optional
    protected String address;
    protected String city;

    //Constructor with datamethods
    abstract void createCard(int cardId, String name, double credit);
    abstract void createCard(int cardId, String name, double credit, int discount);

    //Methods
    protected abstract boolean pay(int amount);

    protected void printMyDetails() {
        System.out.println(this.cardId + "      " + this.name + "      " + this.credit );
    }
}
