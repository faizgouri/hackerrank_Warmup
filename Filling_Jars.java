import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int i = 0;
        long a = 0, b = 0, k = 0;
        long sum = 0;
        for(i = 0; i < M; i++)
        {
            a = input.nextLong();
            b = input.nextLong();
            k = input.nextLong();
            sum = sum + (b - a + 1) * k;
        }
        System.out.println(sum/N);
    }
}