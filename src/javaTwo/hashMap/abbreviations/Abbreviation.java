package javaTwo.hashMap.abbreviations;

import java.util.HashMap;

public class Abbreviation {

   private HashMap<String, String> abbreviations;

    public Abbreviation() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){

        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
      return   this.abbreviations.get(abbreviation);

    }

}
