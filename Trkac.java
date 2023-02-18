import java.util.ArrayList;
import java.util.List;

public class Trkac {

    private int trkacID;
    private String ime;
    private String prezime;

    private String drzava;

    private double tezinaTrkaca;

    private List<Pozivnica> pozivnice;

    private Trka trka;

    private KategorijaTrke kategorijaTrke;

    private KategorijaTrkaca kategorijaTrkaca;

    private Rezultat rezultat;

    // todo: kategorija


    public Trkac(int trkacID, String ime, String prezime, String drzava, double tezinaTrkaca, KategorijaTrkaca kategorijaTrkaca) {
        this.trkacID = trkacID;
        this.ime = ime;
        this.prezime = prezime;
        this.drzava = drzava;
        this.tezinaTrkaca = tezinaTrkaca;
        this.kategorijaTrkaca = kategorijaTrkaca;


    }

    public int getTrkacID() {
        return trkacID;
    }

    public void setTrkacID(int trkacID) {
        this.trkacID = trkacID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public double getTezinaTrkaca() {
        return tezinaTrkaca;
    }

    public void setTezinaTrkaca(double tezinaTrkaca) {
        this.tezinaTrkaca = tezinaTrkaca;
    }

    public List<Pozivnica> getPozivnice() {
        return pozivnice;
    }

    public void setPozivnice(List<Pozivnica> pozivnice) {
        this.pozivnice = pozivnice;
    }

    @Override
    public String toString() {
        return "Trkac{" +
                "trkacID=" + trkacID +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", drzava='" + drzava + '\'' +
                '}';
    }
}
