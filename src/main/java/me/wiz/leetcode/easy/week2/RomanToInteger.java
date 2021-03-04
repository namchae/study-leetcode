package me.wiz.leetcode.easy.week2;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        ;
//        System.out.println(romanToInteger.romanToInt("IV"));;
//        System.out.println(romanToInteger.romanToInt("IX"));;
//        System.out.println(romanToInteger.romanToInt("LVIII"));;
//        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
//        System.out.println(romanToInteger.romanToInt("MCMXCIVMCMXCIVMCMXCIV"));

    }

    public int romanToInt(String s) {
        if (s.length() > 15) {
            String message = String.format("The [%s] character length cannot be more than 15.", s);
            throw new IllegalArgumentException(message);
        }


        Map<Character, Integer> cache = getCacheRoman();
        char[] chars = s.toUpperCase().toCharArray();

        int totalAmount = cache.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (cache.get(s.charAt(i + 1)) > cache.get(s.charAt(i)))
                totalAmount = totalAmount - cache.get(s.charAt(i));
            else
                totalAmount = totalAmount + cache.get(s.charAt(i));
        }

//        for (char value : chars) {
//            totalAmount += cache.get(value);
//        }


        return totalAmount;
    }

    private Map<Character, Integer> getCacheRoman() {
        Map<Character, Integer> cache = new HashMap<>();
        cache.put('I', 1);
        cache.put('V', 5);
        cache.put('X', 10);
        cache.put('L', 50);
        cache.put('C', 100);
        cache.put('D', 500);
        cache.put('M', 1000);
        return cache;
    }
}
