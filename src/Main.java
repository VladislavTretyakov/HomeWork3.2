public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println(service.calculate(70,1.70));

        System.out.println();
        System.out.println(service.calculate(75,1.59));

        System.out.println();
        System.out.println(service.calculate(110,1.87));
    }
}
