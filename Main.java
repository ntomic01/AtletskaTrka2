import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Trka t1 = new Trka(1,34,TrkaType.private_trka,KategorijaTrke.maraton_Trka);
        System.out.println(t1);
        Trkac trkac = new Trkac(101,"Nikola", "Tomic", "Srbija",60,KategorijaTrkaca.trkac_do60kg);
        System.out.println(trkac);

        System.out.println(t1.getTrkaID());
        System.out.println(trkac.getTezinaTrkaca());
        System.out.println(trkac.getPozivnice());




    }
}