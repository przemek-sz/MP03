package com.mp03.wieloaspektowe;

public class List extends Format {

    private static float kosztListu = 2;

    public List(Przesylka przesylka, int waga, int szerokosc, int dlugosc, int wysokosc) {
        super(przesylka, waga, szerokosc, dlugosc, wysokosc);
    }

    @Override
    public float getKosztFormatu() {
        return kosztListu*waga;
    }


}
