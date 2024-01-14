public class BonusMilesService {
    int aMile = 20;

    public int calculate(int price) {
        int miles = price / aMile;
        return miles;
    }
}