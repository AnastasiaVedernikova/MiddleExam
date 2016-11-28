/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Card {
//    public boolean isState() {
//        return state;
//    }
//
//    public void setState(boolean state) {
//        this.state = state;
//    }
//
//    public boolean state;

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    private CardType type;

    public Integer getValidity() {
        return this.validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    private Integer validity;


    public void setAmountOfLifts(Integer amountOfLifts) {
        this.amountOfLifts = amountOfLifts;
    }

    public Integer getAmountOfLifts() {
        return this.amountOfLifts;

    }

    private Integer amountOfLifts;

}
