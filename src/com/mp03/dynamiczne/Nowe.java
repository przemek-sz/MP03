package com.mp03.dynamiczne;

public class Nowe {

    Zlecenie zlecenie;

    public Nowe(Zlecenie zlecenie){

        this.zlecenie=zlecenie;
    }

    public static void createNowe(Zlecenie zlecenie) throws Exception {
        if(zlecenie == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        Nowe nowe = new Nowe(zlecenie);
        zlecenie.przypiszNowe(nowe);
    }

    public void usunZlecenie(){
        zlecenie = null;
    }
}
