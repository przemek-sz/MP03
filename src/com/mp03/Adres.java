package com.mp03;

public class Adres {

    Long id;
    Klient klient;
    String miasto,
    ulica,
    numer,
    kodPocztowy;

    public Adres(Long id, String miasto, String ulica, String numer, String kodPocztowy){
        this.klient=klient;
        this.id=id;
        this.miasto=miasto;
        this.ulica=ulica;
        this.numer=numer;
        this.kodPocztowy=kodPocztowy;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id=" + id +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numer='" + numer + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}
