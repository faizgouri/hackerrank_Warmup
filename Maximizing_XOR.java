import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l;
        l = in.nextInt();
        int r;
        r = in.nextInt();
        int max = 0;
        for(int i = l; i < r; ++i)
        {
            for(int j = (i + 1); j <= r; ++j)
            {
                
                if((i ^ j) > max)
                {
                    max = i ^ j;
                }
            }
        }
        System.out.println(max);
    }
}