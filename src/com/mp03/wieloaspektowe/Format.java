package com.mp03.wieloaspektowe;



public abstract class Format {

    Przesylka przesylka;
    int waga;
    int szerokosc;
    int dlugosc;
    int wysokosc;


    public Format(Przesylka przesylka,int waga, int szerokosc, int dlugosc, int wysokosc){
        this.przesylka=przesylka;
        this.waga=waga;
        this.szerokosc=szerokosc;
        this.dlugosc=dlugosc;
        this.wysokosc=wysokosc;
    }

    public static void createFormat(Przesylka przesylka,String nazwa,int waga, int szerokosc, int dlugosc, int wysokosc) throws Exception {
        Format format=null;
        if(przesylka == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        if(nazwa=="Paczka"){
            format = new Paczka(przesylka,waga, szerokosc, dlugosc, wysokosc);
        }
        if(nazwa=="List"){
            format = new List(przesylka,waga, szerokosc, dlugosc, wysokosc);
        }

        przesylka.przypiszFormat(format);
    }

    public abstract float getKosztFormatu();

}
