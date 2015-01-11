import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i, j, entry, exit, N, T;
        int width[] = new int[100000];
        int vehicle[] = new int[]{1, 1, 1}; //0 : Bike, 1 : Car, 2 : Truck, initially all are selected
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        T = input.nextInt();
        for(i = 0; i < N; ++i)
        {
            
            width[i] = input.nextInt();
        }
        for(i = 0; i < T; ++i)
        {
            
            entry = input.nextInt();
            exit = input.nextInt();
            vehicle[1] = 1;
            vehicle[2] = 1;
            for(j = entry; j <= exit; ++j)
            {
               if(width[j] < 3)
               {
                   vehicle[2] = 0;
               }
               if(width[j] < 2)
               {
                   vehicle[1] = 0;
               }
            }
            if(vehicle[2] == 1)
            {
                
                System.out.println(3);
            
            }
            else if(vehicle[1] == 1)
            {
                
                System.out.println(2);
            }
            else
            {
                System.out.println(1);
            }
        
        }
    }
}