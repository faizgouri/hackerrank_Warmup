/* Problem Statement
https://www.hackerrank.com/challenges/the-love-letter-mystery */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n = 0, len = 0, result = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        String str = new String();
        for(int i = 0; i < n; ++i){
            str = input.next();
            len = str.length();
            result = 0;
            for(int j = 0; j < len / 2; ++j){
                    result = result + Math.abs(str.codePointAt(j) - str.codePointAt(len - 1 - j));
                      
             }
            System.out.println(result);
        }
    }
}