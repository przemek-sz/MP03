package com.mp03.overlapping;

import com.mp03.Adres;

public class KlientOsoba {

    Osoba osoba;
    Adres adres;

    private KlientOsoba(Osoba osoba){
        this.osoba=osoba;
        adres=new Adres(1L,"Warszawa","Centralna","55","07-123");
    }

    public static void createKlientOsoba(Osoba osoba) throws Exception {
        if(osoba == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        KlientOsoba klientOsoba = new KlientOsoba(osoba);
        osoba.przypiszKlientOsoba(klientOsoba);
    }

    public Adres getAdres(){
        return adres;
    }

}
