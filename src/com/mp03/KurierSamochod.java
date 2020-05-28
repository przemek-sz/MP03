package com.mp03;

import com.mp03.overlapping.Kurier;
import com.mp03.wielodziedziczenie.Samochod;

import java.util.Date;

public class KurierSamochod {

    private Long id;
    private Date dataPrzydzialu;
    private Kurier kurier;
    private Samochod samochod;

    public KurierSamochod(Long id){
        this.id=id;
        this.dataPrzydzialu=new Date();
    }


    @Override
    public String toString() {
        return "KurierSamochod{" +
                "id=" + id +
                ", dataPrzydzialu=" + dataPrzydzialu +
                '}';
    }
}
