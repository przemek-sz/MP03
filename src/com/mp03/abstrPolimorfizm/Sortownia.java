package com.mp03.abstrPolimorfizm;

import java.util.List;

public abstract class Sortownia {

    private Long id;

    public Sortownia(Long id){
        this.id=id;
    }

    public abstract List<String> getObslugiwaneTereny();

    @Override
    public String toString() {
        return "Sortownia{" +
                "id=" + id +
                '}';
    }
}
