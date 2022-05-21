public class BonusService {
    public int calculate (int cost){
        int miles = 1;
        int spentMoney =20;
        int bonus = cost / spentMoney * miles;
        return bonus;
    }

}
