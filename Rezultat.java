public class Rezultat {

    private double vreme;
    private int pozicija;
    private Trkac trkac;

    public Rezultat(double vreme, int pozicija, Trkac trkac) {
        this.vreme = vreme;
        this.pozicija = pozicija;
        this.trkac = trkac;
    }

    public double getVreme() {
        return vreme;
    }

    public void setVreme(double vreme) {
        this.vreme = vreme;
    }

    public int getPozicija() {
        return pozicija;
    }

    public void setPozicija(int pozicija) {
        this.pozicija = pozicija;
    }

    public Trkac getTrkac() {
        return trkac;
    }

    public void setTrkac(Trkac trkac) {
        this.trkac = trkac;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "vreme=" + vreme +
                ", pozicija=" + pozicija +
                '}';
    }


}
