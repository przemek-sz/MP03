package com.mp03.dynamiczne;

public class Zrealizowane {

    Zlecenie zlecenie;

    public Zrealizowane(Zlecenie zlecenie){

        this.zlecenie=zlecenie;
    }

    public static void createZrealizowane(Zlecenie zlecenie) throws Exception {
        if(zlecenie == null) {
            throw new Exception("Calosc nie istnieje!");
        }
        Zrealizowane zrealizowane = new Zrealizowane(zlecenie);
        zlecenie.przypiszZrealizowane(zrealizowane);
    }

    public void usunZlecenie(){
        zlecenie = null;
    }
}
