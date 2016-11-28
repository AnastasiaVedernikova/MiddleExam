import java.util.ArrayList;
import java.util.List;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Registration{
    private Integer id = 0;
    private List<Card> cards = new ArrayList<Card>();
    public Card createCard(CardType type){
        Card card = new Card();
        card.setType(type);
        if (type.toString().equals("OneWorkDay")){
           card.setValidity(1);
        }if (type.toString().equals("TwoWorkDays")) {
            card.setValidity(2);
        }if (type.toString().equals("FiveWorkDays")) {
            card.setValidity(5);
        }if (type.toString().equals("OneFreeDays")) {
            card.setValidity(1);
        }if (type.toString().equals("TwoFreeDays")){
            card.setValidity(2);
        }if (type.toString().equals("FiveFreeDays")) {
            card.setValidity(5);
        }if (type.toString().equals("OneSeason")) {
            card.setValidity(90);
        }if (type.toString().equals("TenLifts")){
            card.setAmountOfLifts(10);
        }if (type.toString().equals("TwentyLifts")) {
            card.setAmountOfLifts(20);
        }if (type.toString().equals("FiftyLifts")) {
            card.setAmountOfLifts(50);
        }if (type.toString().equals("OneHundredLifts")) {
            card.setAmountOfLifts(100);
        }
        card.setId(id);
        cards.add(card);
        id+=1;
        return card;
    }
    public String Block(Card card){
        cards.remove(card);
        return "this card was blocked";

    }
    public List<Card> getList(){
        return cards;
    }
}
