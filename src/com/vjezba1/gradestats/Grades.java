package com.vjezba1.gradestats;


import java.util.ArrayList;
import java.util.List;

public class Grades {

    public Grades(){

    }

    public Grades(List<Integer> ocjene) {
        this.ocjene = ocjene;
    }


    private List<Integer> ocjene = new ArrayList<>();


    public List<Integer> getOcjene() {
        return ocjene;
    }

    public void setOcjene(List<Integer> ocjene) {
        this.ocjene = ocjene;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
