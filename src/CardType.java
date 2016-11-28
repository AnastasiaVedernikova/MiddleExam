/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public enum CardType {
    OneWorkDay, TwoWorkDays, FiveWorkDays, OneFreeDay, TwoFreeDays, TenLifts, TwentyLifts, FiftyLifts, OneHundredLifts,OneSeason;
    public String toString(){
        String a;
        switch (this){
            case OneWorkDay:
                a =  "OneWorkDay";break;
            case TwoWorkDays:
                a =  "TwoWorkDays";break;
            case FiveWorkDays:
                a =  "FiveWorkDays";break;
            case OneFreeDay:
                a = "OneFreeDay";break;
            case TwoFreeDays:
                a = "TwoFreeDays";break;
            case TenLifts:
                a = "TenLifts";break;
            case TwentyLifts:
                a = "TwentyLifts";break;
            case FiftyLifts:
                a = "FiftyLifts";break;
            case OneHundredLifts:
                a = "OneHundredLifts";break;
            case OneSeason:
                a = "OneSeason";break;
            default:
                a =  "no type";
        }
        return a;
    }
}
