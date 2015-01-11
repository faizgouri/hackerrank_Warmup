/* Problem Statement
https://www.hackerrank.com/challenges/acm-icpc-team */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int i = 0, j = 0, count = 0, max = 0, team = 0;
        String arr[] = new String[N];
        for(i = 0; i < N; i++)
        {
            arr[i] = input.next();
        }
        
        for(i = 0; i < (N - 1); i++)
        {
        	for(j = i + 1; j < N; j++)
        	{
        		count = 0;
        		for(int k = 0; k < M; k++)
        		{
        			if(((arr[i].charAt(k)) + (arr[j].charAt(k))) - 96 > 0)
        			{
        				count++;
        			}
        		}
        		if(count == max)
        		{
        			team++;
        		}
        		if(count > max)
        		{
        			team = 1;
        			max = count;
        		}
        		
        	}
        }
        System.out.println(max);
        System.out.println(team);
        
        input.close();
    }
}