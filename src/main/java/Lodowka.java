import java.util.HashSet;
import java.util.Set;

public class Lodowka {
    private Set<Skladnik> skladniki = new HashSet<>();


    public void dodajSkladnik(String nazwa, IloscSkladnika ilosc, double limitOstrzezenie, double limitKrytyczny ){
        skladniki.add(new Skladnik(nazwa, ilosc, limitOstrzezenie, limitKrytyczny));

    }
}
