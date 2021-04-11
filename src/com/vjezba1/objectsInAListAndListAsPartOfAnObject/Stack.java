package com.vjezba1.objectsInAListAndListAsPartOfAnObject;

import java.util.ArrayList;

/*
  Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        System.out.println(s.isEmpty());
        System.out.println(s.values());

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
 */

public class Stack {

    ArrayList<String> items = new ArrayList<>();

    public boolean isEmpty(){
        if(items.size()==0){
            return true;
        }return false;
    }

    public void add(String value){
        this.items.add(value);
    }

    public ArrayList<String> values(){
        return this.items;
    }

    public String take(){
        String taken =  this.items.get(items.size()-1);
        this.items.remove(items.size()-1);
        return taken;

    }
}
