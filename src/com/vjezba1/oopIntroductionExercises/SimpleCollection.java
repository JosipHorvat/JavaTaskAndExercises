package com.vjezba1.oopIntroductionExercises;

import java.util.ArrayList;

/*
 SimpleCollection j = new SimpleCollection();
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
 */

public class SimpleCollection {

    private ArrayList<String> list = new ArrayList<>();

    public SimpleCollection() {
        this.list = list;
    }

    public void add(String value){
        this.list.add(value);
    }

    public String longest(){
        if(this.list.isEmpty()){
            return null;
        }

        String stringInList = this.list.get(0);

        for (String s: list){
            if(stringInList.length() < s.length()){
                stringInList = s;
            }
        }
        return stringInList;
    }
}
