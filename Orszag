class Orszag {
    String nev;
    String fovaros;
    int nepesseg;

    public void kiirFoVaros() {
        System.out.println("\nAz ország fővárosa: " + fovaros);
    }

    public void nepessegNovekedes() {
        double novekedes = (nepesseg * 0.05);
        nepesseg += novekedes;
        System.out.println("Az ország népessége növekedett. Új népesség: " + nepesseg);
    }
}


class UniosOrszag extends Orszag {
    String belepesDatum;
    String penznem;
}


class AziaiOrszag extends Orszag {
    String nevezetessegek;
}


class Main {
    public static void main(String[] args) {
        Orszag orszag = new Orszag();
        orszag.nev = "Magyarország";
        orszag.fovaros = "Budapest";
        orszag.nepesseg = 897456;

        UniosOrszag uniosOrszag = new UniosOrszag();
        uniosOrszag.nev = "Németország";
        uniosOrszag.fovaros = "Berlin";
        uniosOrszag.nepesseg = 874135;
        uniosOrszag.belepesDatum = "2000. január 1.";
        uniosOrszag.penznem = "euró";

        AziaiOrszag aziaiOrszag = new AziaiOrszag();
        aziaiOrszag.nev = "Kína";
        aziaiOrszag.fovaros = "Peking";
        aziaiOrszag.nepesseg = 9875641;
        aziaiOrszag.nevezetessegek = "Kínai nagy fal";

        // Kiíratás
        orszag.kiirFoVaros();
        orszag.nepessegNovekedes();
        orszag.nepessegNovekedes();



        uniosOrszag.kiirFoVaros();
        uniosOrszag.nepessegNovekedes();
        System.out.println("Belépés dátuma: " + uniosOrszag.belepesDatum);
        System.out.println("Pénznem: " + uniosOrszag.penznem);

        aziaiOrszag.kiirFoVaros();
        aziaiOrszag.nepessegNovekedes();
        System.out.println("Nevezetességek: " + aziaiOrszag.nevezetessegek);
    }
}
