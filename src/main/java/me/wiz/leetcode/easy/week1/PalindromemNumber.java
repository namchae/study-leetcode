package me.wiz.leetcode.easy.week1;

public class PalindromemNumber {
    public static void main(String[] args) {
        PalindromemNumber palindromemNumber = new PalindromemNumber();

        System.out.println(palindromemNumber.isPalindrome(121));
        System.out.println(palindromemNumber.isPalindrome(-121));
        System.out.println(palindromemNumber.isPalindrome(10));
        System.out.println(palindromemNumber.isPalindrome(-101));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        final String value = String.valueOf(x);
        final String reverseValue = new StringBuilder(value).reverse().toString();
        return value.equals(reverseValue);
    }
}
