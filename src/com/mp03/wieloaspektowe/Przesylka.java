package com.mp03.wieloaspektowe;

import com.mp03.Klient;
import com.mp03.dynamiczne.Zlecenie;
import com.mp03.abstrPolimorfizm.Sortownia;

import java.util.*;
import java.util.List;

public abstract class Przesylka {

    private Long id;
    private Klient nadawca;
    private Klient adresat;
    private float cenaPodstawowa=10;
    private List<Sortownia> sortownie = new ArrayList<>();
    private Date dataNadania = new Date();
    private Date dataDostarczenia = null;
    private String status="u_nadawcy";
    private Format format;
    static Set<Format> przesylkiTyp = new HashSet<>();

    public Przesylka(Long id){
        this.id=id;
        this.status=new String("u_nadawcy");
    }

    public void setFormat(String nazwa,int waga, int szerokosc, int dlugosc, int wysokosc) throws Exception {
            Format.createFormat(this,nazwa,waga, szerokosc, dlugosc, wysokosc);
    }

    public void przypiszFormat(Format typ) throws Exception {
        if(this.format ==null){
            if(przesylkiTyp.contains(typ)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.format =typ;
            przesylkiTyp.add(typ);
        }
    }

    public float podajKosztPrzesylki(){
        return cenaPodstawowa;
    }

    public float getCenaPodstawowa() {
        return cenaPodstawowa;
    }

    public Format getFormat(){
        return format;
    }

    /*


    public static void nadaniePrzesylki(Long id, String typ, int waga, int szerokosc, int dlugosc, int wysokosc){
        int koszt=obliczKosztPrzesylki(szerokosc,dlugosc,wysokosc);
        new Zlecenie(new Przesylka(id, waga, szerokosc, dlugosc, wysokosc,koszt));
    }

    public void anulowaniePrzesylki(){
        zmianaStatusuPrzesylki("Anulowana");
    }

    public void zmianaStatusuPrzesylki(String status){
        setStatus(status);
    }

    public String sprawdzStatusPrzesylki(){
        return getStatus();
    }

    public static int obliczKosztPrzesylki(int szerokosc, int dlugosc, int wysokosc){
        return szerokosc*dlugosc*wysokosc*kosztZaObjetosc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        String res = "Przesylka: id=" + id + '\n';
        res+="Sortownie w ktorcyh byla przesylka:";
        for(Sortownia s : sortownie){
            res+="\n";
            res+=s.toString();
        }
        return res;
    }
    /*
    @Override
    public String toString() {
        return "Przesylka{" +
                "id=" + id +
                ", typ='" + typ + '\'' +
                ", koszt=" + koszt +
                ", status='" + status + '\'' +
                ", waga=" + waga +
                ", szerokosc=" + szerokosc +
                ", dlugosc=" + dlugosc +
                ", wysokosc=" + wysokosc +
                ", pobranie=" + pobranie +
                '}';
    }*/
}
