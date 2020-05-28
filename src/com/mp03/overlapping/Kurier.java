package com.mp03.overlapping;

import com.mp03.KurierSamochod;
import com.mp03.dynamiczne.Zlecenie;

import java.util.ArrayList;
import java.util.List;

public class Kurier{

    private List<Zlecenie> zleceniaKuriera=new ArrayList<>();
    private List<KurierSamochod> kurierSamochod = new ArrayList<>();
    Osoba osoba;
    float salary=2500;

    private Kurier(Osoba osoba){

        this.osoba=osoba;
    }

    public static void createKurier(Osoba osoba) throws Exception {
        if(osoba == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        Kurier kurier = new Kurier(osoba);
        osoba.przypiszKurier(kurier);
    }

    public float getSalary(){
        return salary;
    }
}
