package com.mp03.abstrPolimorfizm;

import java.util.ArrayList;
import java.util.List;

public class SortowniaKrajowa extends Sortownia {



    private List<String> obslugiwaneRegiony = new ArrayList<>();

    public SortowniaKrajowa(Long id) {
        super(id);
    }

    public List<String> getObslugiwaneTereny(){
        return getObslugiwaneRegiony();
    }




    public List<String> getObslugiwaneRegiony() {
        return obslugiwaneRegiony;
    }

    public void setObslugiwaneRegiony(List<String> obslugiwaneRegiony) {
        this.obslugiwaneRegiony = obslugiwaneRegiony;
    }


}
