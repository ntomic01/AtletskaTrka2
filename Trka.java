import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Trka {

    private int trkaID;

    private float duzinaStaze;

    private TrkaType type; //public, private

    // todo: kategorija

    private KategorijaTrke kategorijaTrke;

    private KategorijaTrkaca kategorijaTrkaca;

    private List<Trkac> trkac;
    private List<Rezultat> rezultat;

    Trkac tezinaTrkaca;






    public Trka(int trkaID, float duzinaStaze, TrkaType type, KategorijaTrke kategorijaTrke) {
        this.trkaID = trkaID;
        this.duzinaStaze = duzinaStaze;
        this.type = type;
        this.kategorijaTrke = kategorijaTrke;
        this.trkac = new ArrayList<>();
        this.rezultat = new ArrayList<>();
    }

    public int getTrkaID() {
        return trkaID;
    }

    public void setTrkaID(int trkaID) {
        this.trkaID = trkaID;
    }



    public float getDuzinaStaze() {
        return duzinaStaze;
    }

    public void setDuzinaStaze(float duzinaStaze) {
        this.duzinaStaze = duzinaStaze;
    }

    public TrkaType getType() {
        return type;
    }

    public void setType(TrkaType type) {
        this.type = type;
    }


    public List<Trkac> getTrkac() {
        return trkac;
    }

    public void setTrkac(List<Trkac> trkac) {
        this.trkac = trkac;
    }

    public List<Rezultat> getRezultat() {
        return rezultat;
    }

    public void setRezultat(List<Rezultat> rezultat) {
        this.rezultat = rezultat;
    }

    /* public void dodajTrkaca(Trkac trkac) {
        if(type == TrkaType.private_trka) {
            // trka je privatna, trkacu treba pozvnica
            boolean imaPozivnicu = false;
            for(Pozivnica pozivnica: trkac.getPozivnice()) {
                if(pozivnica.getTrka().trkaID == this.trkaID) {
                    imaPozivnicu = true;
                    System.out.println("Trkac ima pozivnicu, sve je ok!");
                }
            }
            if(imaPozivnicu == false) {
                System.out.println("Trka je privatna, trkac nema pozivnicu");
                return;
            }
        }*/

    public void dodajTrkaca(Trkac trkac){
        if(type == TrkaType.private_trka){
            //trka je privatna, trkacu treba pozivnica
            boolean imaPozivnicu = false;
            for(Pozivnica pozivnica: trkac.getPozivnice()){
                if(pozivnica.getTrka().trkaID == this.trkaID){
                    imaPozivnicu = true;
                    System.out.println("Trkac ima pozivnicu, sve je ok!");
                }
            }

            if(imaPozivnicu == false){
                System.out.println("Trka je privatna, trkacu treba pozivnica");
                return;
            }

        }
    }


    public void rasporediTrkacaUKategorijuTrke(Trkac trkac){
        if(kategorijaTrke == KategorijaTrke.maraton_Trka){
            //trka spada u kategoriju maraton, trkac ne sme imati vise od 60kg!

            boolean tezinaTrkaca = false;

        }
    }





    @Override
    public String toString() {
        return "Trka{" +
                "trkaID=" + trkaID +
                ", duzinaStaze=" + duzinaStaze +
                ", type=" + type +
                ", kategorijaTrke='" + kategorijaTrke + '\'' +
                ", trkac=" + trkac +
                ", rezultat=" + rezultat +
                '}';
    }
}
