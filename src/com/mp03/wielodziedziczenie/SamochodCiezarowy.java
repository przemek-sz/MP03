package com.mp03.wielodziedziczenie;

public class SamochodCiezarowy extends Samochod {

    private int pojemnoscNaczepy;
    private String markaNaczepy;
    int idNaczepy;


    public SamochodCiezarowy(Long id,String marka, String nrRejestracyjnyint, int pojemnoscNaczepy,String markaNaczepy) {
        super(id,marka,nrRejestracyjnyint);
        this.pojemnoscNaczepy=pojemnoscNaczepy;
        this.markaNaczepy=markaNaczepy;
    }

    public void zmianaNaczepy(int id){
        this.idNaczepy=id;
    }
}
