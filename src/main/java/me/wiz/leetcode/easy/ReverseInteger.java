package me.wiz.leetcode.easy;


public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println(reverseInteger.reverse(-123));

    }

    public int reverse(int x) {
        if (x == 0) {
            return x;
        }

        String reverseString = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            int value = Integer.parseInt(reverseString);
            if (x < 0) {
                return value * -1;
            } else {
                return value;
            }
        } catch (NumberFormatException ne) {
            return 0;
        }
    }
}
