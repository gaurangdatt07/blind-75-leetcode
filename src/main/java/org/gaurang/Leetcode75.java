package org.gaurang;


import org.gaurang.solutions.array_strings.Array_Strings;
import org.gaurang.solutions.array_strings.Array_StringsImpl;

public class Leetcode75 {
    public static void main(String[] args) {
        Array_Strings arrayStrings=new Array_StringsImpl();
        //System.out.println(arrayStrings.mergeAlternately("abcdef","pqr"));
        System.out.println(arrayStrings.kidsWithCandies(new int[]{4,2,1,1,2},1));
    }
}