package javaTwo.hashMap;

import javaTwo.hashMap.library.Book;

import java.util.HashMap;

/*
Program program = new Program();

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

       program.printKeys(hashmap);
       program.printKeysWhere(hashmap, "e");
       System.out.println("---");
       program.printValuesOfKeysWhere(hashmap, ".e");
 */

public class Program {

    public static void printValues(HashMap<String, Book> hashmap){
        for(String value : hashmap.keySet() ){
            System.out.println(hashmap.get(value));
        }

    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        String part = sanitizedString(text);
        for(String value : hashmap.keySet() ){
            if(!value.contains(part)){
                continue;
            }
            System.out.println(hashmap.get(value));
        }
    }


    public static void printKeys(HashMap<String,String> hashmap){

        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        String part = sanitizedString(text);
        for (String key : hashmap.keySet()){
           if(!key.contains(part)){
               continue;
           }
            System.out.println(key);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        String part = sanitizedString(text);
        for (String key : hashmap.keySet()){
            if(!key.contains(part)){
                continue;
            }
            System.out.println(hashmap.get(key));
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }


}
