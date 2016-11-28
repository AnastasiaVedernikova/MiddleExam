/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Main {
    public static void main(String[] args){
        Registration registration = new Registration();
        Card card = registration.createCard(CardType.FiftyLifts);
        Turnstile turnstile = new Turnstile();
        turnstile.tryLift(card,registration);


    }
}
