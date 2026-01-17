
public class Main {
    public static void main(String[] args) {
        Bankomat mittKonto = new Bankomat("123456789", 1000.0);

        mittKonto.visaSaldo();

        mittKonto.sättIn(500.0);
        mittKonto.visaSaldo();

        boolean uttag1 = mittKonto.taUt(200.0);
        System.out.println("Uttag av 200 kr lyckades: " + uttag1);
        mittKonto.visaSaldo();

        boolean uttag2 = mittKonto.taUt(2000.0);
        System.out.println("Uttag av 2000 kr lyckades: " + uttag2);
        mittKonto.visaSaldo();
    }
}