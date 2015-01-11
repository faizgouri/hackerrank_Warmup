/* Problem Statement:
https://www.hackerrank.com/challenges/utopian-tree */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        int height = 1;
        int i = 0, j = 0;
        int n = 0;
        n = input.nextInt();
        int arr[] = new int[10];
        for(i = 0; i < n; ++i)
        {
            
            arr[i] = input.nextInt();
            height = 1;
            for(j = 1; j <= arr[i]; ++j)
            {
            
                if(j % 2 == 1)
                {
                
                    height = height * 2;
                }
                else
                {
                    height = height + 1;
                }
            }
            System.out.println(height);
        } 
    }
}