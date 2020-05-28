package com.mp03.wieloaspektowe;

public class PrzesylkaPobraniowa extends Przesylka {


    private static float dodatkowaZaPobranie=5;

    public PrzesylkaPobraniowa(Long id) {
        super(id);
    }

    public float podajKosztPrzesylki(){
        float koszt=getCenaPodstawowa();
        koszt+=dodatkowaZaPobranie;
        if(getFormat()!=null)
            koszt+=getFormat().getKosztFormatu();
        return koszt;
    }
}
