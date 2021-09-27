public abstract class Card {

    //Fields required
    protected int cardId;
    protected String name;
    protected double credit;

    public int getCardId() {
        return this.cardId;
    }

    //optional
    protected String address;
    protected String city;

    //Constructor with datamethods
    abstract boolean createCard(int cardId, String name, double credit);
    abstract boolean createCard(int cardId, String name, double credit, int discount);


    //Methods
    protected abstract boolean pay(double amount);
//    protected void printMyDetails() {
//        System.out.println(this.cardId + "      " + this.name + "      " + this.credit);
//    }
    abstract Card searchAccount(int number);



}
