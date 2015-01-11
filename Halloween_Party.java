import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* apporach
        K   HorizontalCuts  VerticalCuts  TotalPieces
        =   ==============  ============  ===========
        0   0               0               0
        1   1               0               0
        2   1               1               1
        3   2               1               2
        4   2               2               4
        5   3               2               6
        6   3               3               8
        7   4               3               12
        8   4               4               16
        
        So, Totalpieces = horiz * vertical
        k/2 = horizon, (k - k/2) = vertical
        */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long k = 0;
        for(int i = 0; i < t; ++i){
            k = input.nextLong();
            System.out.println((k / 2) * (k - k / 2));
        }
  }
}