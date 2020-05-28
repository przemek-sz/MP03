package com.mp03.abstrPolimorfizm;

import java.util.ArrayList;
import java.util.List;

public class SortowniaMiedzynarodowa extends Sortownia {

    private List<String> obslugiwaneKraje = new ArrayList<>();

    public SortowniaMiedzynarodowa(Long id) {
        super(id);
    }

    public List<String> getObslugiwaneTereny(){
        return getObslugiwaneKraje();
    }

    public List<String> getObslugiwaneKraje() {
        return obslugiwaneKraje;
    }

    public void setObslugiwaneKraje(List<String> obslugiwaneKraje) {
        this.obslugiwaneKraje = obslugiwaneKraje;
    }
}
