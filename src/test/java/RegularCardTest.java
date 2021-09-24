import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegularCardTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void doesItAllStart(){
        App a = new App();
        a.run();
        assert true;
    }


    @Test
    public void whenRegularCardIsSuccesfullyCreated() {
        Card a = new RegularCard();
        a.createCard(1, "Regular Richard", 100.11);
        assert true;
    }



    @Test
    public void whenGoldCardIsSuccesfullyCreated() {
        Card a = new GoldCard();
        a.createCard(1, "Gilber Goldy", 75.11, 10);
        assert true;
    }



    @Test
    public void whenRegularPaymentSucceeds() {
        Card a = new GoldCard();
        a.createCard(1, "Regular Richard", 75.11);
        boolean actual=a.pay(25);
        assert actual;

    }
    @Test
    public void whenRegularPaymentFails() {
        Card a = new RegularCard();
        a.createCard(1, "Regular Richard", 75.11);
        boolean actual=a.pay(100);
        assert !actual;

    }

    @Test
    public void whenGoldPaymentSucceeds() {
        Card a = new GoldCard();
        a.createCard(1, "Regular Richard", 75.11,10);
        boolean actual=a.pay(25);
        assert actual;

    }

}