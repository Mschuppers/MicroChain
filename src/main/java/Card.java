public abstract class Card {

    //Fields required
    protected int cardId;
    protected String name;
    protected double credit;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    //optional
    protected String address;
    protected String city;

    //Constructor with datamethods
     abstract boolean createCard(int cardId, String name, double credit);
    abstract boolean createCard(int cardId, String name, double credit, int discount);


    //Methods
    protected abstract boolean pay(double amount);

    protected void printMyDetails() {
        System.out.println(this.cardId + "      " + this.name + "      " + this.credit);
    }

    abstract Card searchAccount(int number);



}
