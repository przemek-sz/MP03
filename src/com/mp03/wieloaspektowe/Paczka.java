package com.mp03.wieloaspektowe;

public class Paczka extends Format {

    private static float kosztPaczki = 5;

    public Paczka(Przesylka przesylka, int waga, int szerokosc, int dlugosc, int wysokosc) {
        super(przesylka, waga, szerokosc, dlugosc, wysokosc);
    }

    @Override
    public float getKosztFormatu() {
        return kosztPaczki*szerokosc*dlugosc*wysokosc;
    }

}
