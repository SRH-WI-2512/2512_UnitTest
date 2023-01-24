public class Auto {
    private int baujahr;
    private int leistung;

    public Auto(int baujahr, int leistung) {
        this.baujahr = baujahr;
        this.leistung = leistung;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public double verkauswert() {
        double wert = leistung * 42;
        double wertverlust = wert * 0.1 * (2023 - baujahr);
        return wert - wertverlust;
    }
}
