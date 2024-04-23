public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 13_676;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}