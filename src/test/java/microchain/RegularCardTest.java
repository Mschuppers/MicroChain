package microchain;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RegularCardTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Ignore
    public void doesItAllStart(){
        App a = new App();
        a.run(1);
        a.run(2);
        a.run(3);
        a.run(0);
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
        a.createCard(1, "Regular Richard", 150.11);
        boolean actual=a.pay(25);
        assert actual;

    }
//    @Test
//    public void whenRegularPaymentFails() {
//        microchain.Card a = new microchain.RegularCard();
//        a.createCard(1, "Regular Richard", 175.11);
//        boolean actual=a.pay(200);
//        assert !actual;
//
//    }

    @Test
    public void whenGoldPaymentSucceeds() {
        Card a = new GoldCard();
        a.createCard(1, "Regular Richard", 10.11,10);
        boolean actual=a.pay(25);
        assert actual;

    }

}