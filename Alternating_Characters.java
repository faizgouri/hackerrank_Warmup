/* Alternating Characters:
https://www.hackerrank.com/challenges/alternating-characters */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String str = new String("");
        int count = 0;
        for(int j = 0; j < t; j++)
        {
            count = 0;
            str = input.next();
            for(int i = 1; i < str.length(); i++)
            {
                if(str.charAt(i) == str.charAt(i - 1))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}