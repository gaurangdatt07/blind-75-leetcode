package org.gaurang.solutions.array_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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

    @Override
    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1) ?str1.substring(0,gcd(str1.length(),str2.length())):"";

    }

    private int gcd(int length, int length1) {
        return length1==0?length:gcd(length1,length%length1);
    }

    @Override
    public String reverseVowels(String s) {
        List<Character> vowelsList=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        Stack<Integer> vowelStack = new Stack();
        StringBuilder newString= new StringBuilder();
        for(int i = 0 ; i <s.length();i++){
            if(vowelsList.contains(s.charAt(i))){
                vowelStack.push(i);
            }
        }
        for(int i = 0 ;i<s.length();i++){
          newString.append(vowelsList.contains(s.charAt(i)) ?
                  s.charAt(vowelStack.pop()) : s.charAt(i));
        }
        return newString.toString();
    }
}

