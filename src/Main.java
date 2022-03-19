public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int cost = 18885;
        int miles = service.calculate(cost);

        System.out.println("Ваши бонусные мили составили: " + miles);
    }
}
