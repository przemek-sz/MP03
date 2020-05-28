package com.mp03.dynamiczne;

public class Realizowane {

    Zlecenie zlecenie;

    public Realizowane(Zlecenie zlecenie){

        this.zlecenie=zlecenie;
    }

    public static void createRealizowane(Zlecenie zlecenie) throws Exception {
        if(zlecenie == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        Realizowane realizowane = new Realizowane(zlecenie);
        zlecenie.przypiszRealizowane(realizowane);
    }

    public void usunZlecenie(){
        zlecenie = null;
    }
}
