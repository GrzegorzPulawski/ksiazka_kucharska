public class IloscSkladnika {
    //- double ilość
    //- jednostka (GRAM, MILILITR, SZTUKA)
    private double ilosc;
    Jednostka jednostka;

    public IloscSkladnika(double ilosc, Jednostka jednostka) {
        this.ilosc = ilosc;
        this.jednostka = jednostka;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public Jednostka getJednostka() {
        return jednostka;
    }

    public void setJednostka(Jednostka jednostka) {
        this.jednostka = jednostka;
    }
}

