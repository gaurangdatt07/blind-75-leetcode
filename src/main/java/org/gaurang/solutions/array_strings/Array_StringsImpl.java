package org.gaurang.solutions.array_strings;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Boolean> finalList= new ArrayList<>();
        int max = 0;
        for(int i = 0;i<candies.length;i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        for(Integer each:candies) {
            finalList.add(each+extraCandies>=max);
        }
        return finalList;
    }


    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                boolean canPlant = (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (canPlant) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
            i++;
        }
        return count >= n;
    }

}

