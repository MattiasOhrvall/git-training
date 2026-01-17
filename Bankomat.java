public class Bankomat {

    private double saldo;
    private String kontonummer;

    public Bankomat(String kontonummer, double startSaldo) {
        this.kontonummer = kontonummer;
        this.saldo = startSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void sättIn(double belopp) {
        if (belopp > 0) {
            saldo += belopp;
        } else {
            System.out.println("Beloppet måste vara positivt.");
        }
    }

    public boolean taUt(double belopp) {
        if (belopp > 0 && belopp <= saldo) {
            saldo -= belopp;
            return true;
        } else {
            System.out.println("Otillräckligt saldo eller ogiltigt belopp.");
            return false;
        }
    }

    public void visaSaldo() {
        System.out.println("Kontonummer: " + kontonummer + ", Saldo: " + saldo + " kr");
    }
    
}
