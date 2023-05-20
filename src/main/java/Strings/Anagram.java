package Strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;

@Slf4j
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the first String");
        String str1 = sc.next();
        log.info("Enter the second String");
        String str2 = sc.next();

        if(checkWhetherAnagram(str1,str2)){
            System.out.println(str1 +" and "+ str2 + " are Anagram");
        }
        else  System.out.println(str1 +" and "+ str2 + " are not Anagram");

    }

    private static boolean checkWhetherAnagram(String str1, String str2) {
        String s1 = str1.replace("//s","");
        String s2 = str2.replace("//s","");
        if(s1.length() != s2.length()){
            return  false;
        }else {

            char[] char1 = str1.toLowerCase().toCharArray();
            char[] char2 = str2.toLowerCase().toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            return Arrays.equals(char1,char2);
        }
    }
}

