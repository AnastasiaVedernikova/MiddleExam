/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Turnstile {
    public String tryLift(Card card, Registration registration){
        if (card.getAmountOfLifts()<1 && card.getValidity()<1 || !registration.getList().contains(card)){
            return "acсess is false";
        }else if (card.getAmountOfLifts()>=1 || card.getValidity()>=1){
            card.setAmountOfLifts(card.getAmountOfLifts()-1);
            return "access is true";
        }else if (card.getValidity()>=1){
            return "access is true";
        }
        return "";
    }
}
