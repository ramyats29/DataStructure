package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        palindromeWithOutRecursionFunction();
        palindromeWithRecursionFunction();

    }

    private static void palindromeWithRecursionFunction() {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        String reverseWord = getReverseWord(word);
        System.out.println("Is "+word+" palindrome? - "+word.equals(reverseWord));
    }

    private static String getReverseWord(String word) {
        if(word == null || word.isEmpty()){
            return word;
        }
        return word.charAt(word.length()- 1) + getReverseWord(word.substring(0, word.length() - 1));
    }

    private static void palindromeWithOutRecursionFunction() {
        String s = "A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String revStr;
        char ch;
        StringBuilder revStrBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            revStrBuilder.append(ch);
        }
        revStr = revStrBuilder.toString();
        System.out.println(str);
        System.out.println(revStr);
        System.out.println(str.equalsIgnoreCase(revStr));
    }
}