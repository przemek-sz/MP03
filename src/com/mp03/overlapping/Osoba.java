package com.mp03.overlapping;

import com.mp03.Adres;

import java.util.HashSet;
import java.util.Set;

public class Osoba {


    private Long id;
    private String daneosobowe;
    private String daneKontaktowe;
    private KlientOsoba klientOsoba;
    private Kurier kurier;

    public Osoba(Long id, String daneosobowe, String daneKontaktowe) {
        this.id = id;
        this.daneosobowe = daneosobowe;
        this.daneKontaktowe = daneKontaktowe;
    }

    static Set<Kurier> wszyscyKurierzy = new HashSet<>();
    static Set<KlientOsoba> wszyscyKlienci = new HashSet<>();

    public void addKurier() throws Exception {
        if(this.kurier==null){
            Kurier.createKurier(this);
        }
    }

    public void przypiszKurier(Kurier kurier) throws Exception {
        if(this.kurier==null){
            if(wszyscyKurierzy.contains(kurier)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.kurier=kurier;
            wszyscyKurierzy.add(kurier);
        }
    }

    public void addKlientOsoba() throws Exception {
        if(this.klientOsoba==null){
            KlientOsoba.createKlientOsoba(this);
        }
    }

    public void przypiszKlientOsoba(KlientOsoba klientOsoba) throws Exception {
        if(this.klientOsoba==null){
            if(wszyscyKlienci.contains(klientOsoba)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.klientOsoba=klientOsoba;
            wszyscyKlienci.add(klientOsoba);
        }
    }

    public Adres getAdres()throws Exception{
        if(klientOsoba!=null)
            return klientOsoba.getAdres();
        throw new Exception("Ta osoba nie jest klientem");
    }

    public float getSalary()throws Exception{
        if(kurier!=null)
            return kurier.getSalary();
        throw new Exception("Ta osoba nie jest kurierem");
    }

}
