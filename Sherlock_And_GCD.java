import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int i = 0, n = 0, j = 0, x = 0, k = 0, small = 0;
        String ans = "NO";
        for(i = 0; i < t; i++)
        {
            ans = "NO";
            n = input.nextInt();
            int arr[] = new int[n];
            for(j = 0; j < n; j++)
            {
                arr[j] = input.nextInt();
            }
            for(j = 0; j < (n - 1) && ans.equals("NO"); j++)
            {
                small = arr[j];
                for(k = j + 1; k < n; k++)
                {
                    if(arr[k] > small)
                    {
                        small = arr[k];
                    }
                    for(x = 2; x <= small; x++)
                    {   
                        if(arr[j] % x == 0 && arr[k] % x == 0)
                        {
                            break;
                        }
                    }
                    if(x > small)
                    {
                    	ans = "YES";
                    	break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}