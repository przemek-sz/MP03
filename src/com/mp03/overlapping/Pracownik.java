package com.mp03.overlapping;

import java.util.HashSet;
import java.util.Set;

public class Pracownik {

    private Long id;
    private String daneOsobowe;
    private String daneKontaktowe;
    private float salary=2000;

    private Kurier kurier;
    private PracownikSortowni pracownikSortowni;
    private PracownikBiurowy pracownikBiurowy;

    static Set<Kurier> wszyscyKurierzy = new HashSet<>();
    static Set<PracownikBiurowy> wszyscyPBiurowi = new HashSet<>();
    static Set<PracownikSortowni> wszyscyPSortowni = new HashSet<>();


    public Pracownik(Long id,String daneOsobowe,String daneKontaktowe){
        this.id=id;
        this.daneOsobowe=daneOsobowe;
        this.daneKontaktowe=daneKontaktowe;
    }



/*
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

    public void addPracownikSortowni() throws Exception {
        if(this.pracownikSortowni==null){
            PracownikSortowni.createPracownikSortowni(this);
        }
    }

    public void przypiszPracownikSortowni(PracownikSortowni pracownikSortowni) throws Exception {
        if(this.pracownikSortowni==null){
            if(wszyscyPSortowni.contains(pracownikSortowni)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.pracownikSortowni=pracownikSortowni;
            wszyscyPSortowni.add(pracownikSortowni);
        }
    }

    public void addPracownikBiurowy() throws Exception {
        if(this.pracownikBiurowy==null){
            PracownikBiurowy.createPracownikBiurowy(this);
        }
    }

    public void przypiszPracownikBiurowy(PracownikBiurowy pracownikBiurowy) throws Exception {
        if(this.pracownikBiurowy==null){
            if(wszyscyPBiurowi.contains(pracownikBiurowy)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.pracownikBiurowy=pracownikBiurowy;
            wszyscyPBiurowi.add(pracownikBiurowy);
        }
    }

    public float getSalary() {

        if(this.kurier!=null){

        }
        if(this.pracownikSortowni!=null){

        }
        if(this.pracownikBiurowy!=null){

        }

        return salary;
    }*/
}
