package org.gaurang.solutions.array_strings;

import java.util.ArrayList;
import java.util.List;

public class Array_StringsImpl implements Array_Strings{
    @Override
    public String mergeAlternately(String word1, String word2) {
        String mergedString= "";
        int iterator=0;
        while(iterator<word1.length() && word2.length()>iterator){
            mergedString=mergedString+word1.charAt(iterator) + word2.charAt(iterator);
            iterator++;
        }
        if(iterator<word1.length()||word2.length()>iterator){
            mergedString +=(word1.length()>iterator?
                    word1.substring(iterator):word2.substring(iterator));
        }
        return mergedString;
    }

    @Override
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandles=-1;
        List<Boolean> finalList= new ArrayList<>();
        for(Integer each:candies){
            if(each+extraCandies>maxCandles){maxCandles=each;}
            finalList.add(each+extraCandies>maxCandles);
        }
        return finalList;
    }
}

