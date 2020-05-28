package com.mp03;

import com.mp03.overlapping.Osoba;

public class Main {

    public static void main(String[] args) {

        Osoba o1 = new Osoba(1L,"Tomasz Jakis","606342123");
        try {
            o1.addKlientOsoba();
            try{
                System.out.println(o1.getSalary());
            } catch (Exception e){
                e.printStackTrace();
            }

            o1.addKurier();


            System.out.println(o1.getAdres());
            System.out.println(o1.getSalary());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
