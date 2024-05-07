package com.spacio.conn.SpacioJDBCDemo2;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
class App {
	public static void main(String args[])
	{
		solution("23");
	}
	
    public static int solution(String s) {
        
        Set<String> validNumbers = new HashSet<String>();

        for(int i = 0; i < s.length(); i++)
        {
            for(int j=0; j < 10; j++)
            {
                char[] sArray = s.toCharArray();

                sArray[i] = (char) j;
                
                s = String.valueOf(sArray);
                
                
                
                System.out.println("The S:" + s);

                boolean result = isDivisibleBy3(s);

                if(result)
                {
                    validNumbers.add(s);
                    
                    System.out.println("Divisible by 3: " + s);
                }
                else
                {
                	System.out.println("Not Divisible by 3: " + s);
                }
            }
        }

        int count = validNumbers.size();

        return count;
    }

    private static boolean isDivisibleBy3(String s)
    {
        int divisor = Integer.parseInt(s);

        if(divisor % 3 == 0)
        {
            //it is divisible by 3
            return true;
        }
        else
        {
            //it is not divisible by 3
            return false;
        }
    }
}
