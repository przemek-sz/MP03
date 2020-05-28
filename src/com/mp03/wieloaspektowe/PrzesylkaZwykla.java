package com.mp03.wieloaspektowe;

public class PrzesylkaZwykla extends Przesylka {


    public PrzesylkaZwykla(Long id) {
        super(id);
    }

    public float podajKosztPrzesylki(){
        float koszt=getCenaPodstawowa();
        if(getFormat()!=null)
            koszt+=getFormat().getKosztFormatu();
        return koszt;
    }

}
