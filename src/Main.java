public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

 ///      int ticketPrice = 5000;
///        int bonusMileCost = 20;
///        int numberOfBonusMiles = ticketPrice / bonusMileCost;
///        System.out.println(numberOfBonusMiles);
    }
}
