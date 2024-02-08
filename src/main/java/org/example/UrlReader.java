package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrlReader {

    public Map<String, Integer> readUrl(String strUrl, List<String> words) {
        Map<String, Integer> mapWords = new HashMap<>();
        for (String ss: words) {
            mapWords.put(ss, 0);
            String readfromEb = "hxx dadf  med ";
            if (readfromEb.indexOf(ss) >= 0) {
                Integer ii = mapWords.get(ss);
                ii++;
                mapWords.put(ss, ii);
            }
        }
        return mapWords;
    }

}
