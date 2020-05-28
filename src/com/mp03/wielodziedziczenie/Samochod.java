package com.mp03.wielodziedziczenie;

import com.mp03.KurierSamochod;

import java.util.ArrayList;
import java.util.List;

public abstract class Samochod{

    private Long id;
    private String marka;
    private String nrRejestracyjny;
    private List<KurierSamochod> kurierSamochod = new ArrayList<>();

    public Samochod(Long id,String marka, String nrRejestracyjny){
        this.id=id;
        this.marka=marka;
        this.nrRejestracyjny=nrRejestracyjny;
    }




    @Override
    public String toString() {
        return "Samochod{" +
                "id=" + id +
                '}';
    }
}
