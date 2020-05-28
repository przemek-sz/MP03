package com.mp03.wielodziedziczenie;

public class AutonomicznySamochodCiezarowy extends SamochodCiezarowy implements PojazdAutonomiczny {


    public AutonomicznySamochodCiezarowy(Long id,String marka, String nrRejestracyjny, int pojemnoscNaczepy,String markaNaczepy) {
        super(id,marka,nrRejestracyjny,pojemnoscNaczepy,markaNaczepy);

    }

    @Override
    public void wyznaczTrase() {

    }

    @Override
    public void rozpocznijKurs() {

    }


}
