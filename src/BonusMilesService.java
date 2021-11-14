public class BonusMilesService {
    public int calculate (int cost) {
        int bonusMileCost = 20;
        int numberOfBonusMiles = cost / bonusMileCost;

        return numberOfBonusMiles;
    }

}
