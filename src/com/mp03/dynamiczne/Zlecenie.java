package com.mp03.dynamiczne;

import com.mp03.overlapping.Kurier;
import com.mp03.overlapping.PracownikBiurowy;
import com.mp03.overlapping.PracownikSortowni;
import com.mp03.wieloaspektowe.Przesylka;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Zlecenie {

    private Long id;
    private String status="w trakcie realizacji";
    private Date dataUtworzeniaZlecenia;
    private Date dataZrealizowania=null;
    private Przesylka przesylka;
    private Kurier kurier;

    private Nowe nowe;
    private Realizowane realizowane;
    private Zrealizowane zrealizowane;

    static Set<Nowe> noweZlecenia = new HashSet<>();
    static Set<Realizowane> realizowaneZlecenia = new HashSet<>();
    static Set<Zrealizowane> zrealizowaneZlecenia = new HashSet<>();

    public Zlecenie(Przesylka przesylka) {

        this.przesylka = przesylka;
        this.dataUtworzeniaZlecenia = new Date();

    }

    public void addNowe() throws Exception {
        if(this.nowe==null){
            usunPoloczenie();
            Nowe.createNowe(this);
        }
    }

    public void przypiszNowe(Nowe nowe) throws Exception {
        if(this.nowe==null){
            if(noweZlecenia.contains(nowe)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.nowe=nowe;
            noweZlecenia.add(nowe);
        }
    }

    public void addRealizowane() throws Exception {
        if(this.realizowane==null){
            usunPoloczenie();
            Realizowane.createRealizowane(this);
        }
    }

    public void przypiszRealizowane(Realizowane realizowane) throws Exception {
        if(this.realizowane==null){
            if(realizowaneZlecenia.contains(realizowane)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.realizowane=realizowane;
            realizowaneZlecenia.add(realizowane);
        }
    }

    public void addZrealizowane() throws Exception {
        if(this.zrealizowane==null){
            usunPoloczenie();
            Zrealizowane.createZrealizowane(this);
        }
    }

    public void przypiszZrealizowane(Zrealizowane zrealizowane) throws Exception {
        if(this.zrealizowane==null){
            if(zrealizowaneZlecenia.contains(zrealizowane)) {
                throw new Exception("The part is already connected with a whole!");
            }
            this.zrealizowane=zrealizowane;
            zrealizowaneZlecenia.add(zrealizowane);
        }
    }

    public void usunPoloczenie(){

        if(nowe!=null){
            nowe.usunZlecenie();
            if(noweZlecenia.contains(nowe))
                zrealizowaneZlecenia.remove(nowe);
            nowe=null;
        }
        if(realizowane!=null){
            nowe.usunZlecenie();
            if(realizowaneZlecenia.contains(realizowane))
                realizowaneZlecenia.remove(realizowane);
            realizowane=null;
        }
        if(zrealizowane!=null){
            nowe.usunZlecenie();
            if(zrealizowaneZlecenia.contains(zrealizowane))
                zrealizowaneZlecenia.remove(zrealizowane);
            zrealizowane=null;
        }
    }


    public void setDataZrealizowania(Date dataZrealizowania) {
        this.dataZrealizowania = dataZrealizowania;
    }


}
