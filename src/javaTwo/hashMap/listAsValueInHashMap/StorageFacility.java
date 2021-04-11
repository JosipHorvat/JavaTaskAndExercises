package javaTwo.hashMap.listAsValueInHashMap;

import java.util.ArrayList;
import java.util.HashMap;

/*
 StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

       facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
 */

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;


    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> completed = this.storage.get(unit);
        completed.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(storageUnit == null){
            storageUnit = "";
        }
       return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item){
    this.storage.get(storageUnit).remove(item);
    if(storage.get(storageUnit).isEmpty()){
        this.storage.remove(storageUnit);
    }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> getUnits = new ArrayList<>();
        for (String name: this.storage.keySet()) {
            getUnits.add(name);
        }
        return getUnits;
    }
}
