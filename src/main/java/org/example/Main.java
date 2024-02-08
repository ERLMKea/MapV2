package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void testMapStrings() {
        System.out.println("Hello world!");
        Map<String, String> mapString = new HashMap<>();
        mapString.put("key1", "value1");
        mapString.put("key3", "value3");
        mapString.put("key1", "value4");
        mapString.put("key2", "" + (char)65021);
        System.out.println(mapString);
        for(String s: mapString.keySet()) {
            System.out.println(s);
        }
        mapString.forEach((key,value) -> System.out.println(key + " value=" + value));
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hej", "med", "digbbbbbbbbb");
        String urlEb = "www.eb.dk";
        UrlReader urlReader = new UrlReader();
        Map<String, Integer> mapWords = urlReader.readUrl(urlEb, words);
        mapWords.forEach((key,value) -> System.out.println(key + " value=" + value));

        var obj = "hej med".indexOf("med");
        System.out.println(obj);

    }

}