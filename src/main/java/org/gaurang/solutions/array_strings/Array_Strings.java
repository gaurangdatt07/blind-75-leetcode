package org.gaurang.solutions.array_strings;

import java.util.List;

public interface Array_Strings {
    /**
     * url: https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
     */
     String mergeAlternately(String word1, String word2);
    /**
     * url: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
     */
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies);

    /**
     * url: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
     */
     boolean canPlaceFlowers(int[] flowerbed, int n);

    /**
     * url: https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
     */
    String gcdOfStrings(String str1, String str2);

    /**
     * url: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
     */
    String reverseVowels(String s);
}
