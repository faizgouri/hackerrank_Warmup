import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int alpha[] = new int[26];
        int len = str.length();
        int i = 0, flag = 0;
        for(i = 0; i < 26; i++)
        {
        	alpha[i] = 0;
        }
        for(i = 0; i < len; i++)
        {
        	alpha[str.charAt(i) - 'a']++;  
        }
        if(len % 2 == 0)
        {
        	for(i = 0; i < 26; i++)
        	{
        		if(alpha[i] % 2 != 0)
        		{
        			System.out.println("NO");
        			flag = 2;
        			break;
        		}
        	}
        }
        else
        {
        	for(i = 0; i < 26; i++)
        	{
        		if(alpha[i] % 2 != 0)
        		{
        			if(flag == 1)
        			{
        				System.out.println("NO");
        				flag = 2;
            			break;        				
        			}
        			flag = 1;        			
        		}
        		
        	}
        }
        if(flag != 2)
        {
        	System.out.println("YES");
        }
        
        input.close();
    }
}