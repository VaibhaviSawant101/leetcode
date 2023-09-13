import java.io.*;
import java.util.*;

class Solution {
    public int val(char ch)
    {
        if(ch == 'I')
        {
            return 1;
        }
        else if(ch == 'V')
        {
            return 5;
        }
        else if(ch == 'X')
        {
            return 10;
        }
        else if(ch == 'L')
        {
            return 50;
        }
        else if(ch == 'C')
        {
            return 100;
        }
        else if(ch == 'D')
        {
            return 500;
        }
        else if(ch == 'M')
        {
            return 1000;
        }
        else
        {
            return -1;
        }
    }

    public int preference(char ch)
    {
        if(ch == 'I')
        {
            return 1;
        }
        else if(ch == 'V')
        {
            return 2;
        }
        else if(ch == 'X')
        {
            return 3;
        }
        else if(ch == 'L')
        {
            return 4;
        }
        else if(ch == 'C')
        {
            return 5;
        }
        else if(ch == 'D')
        {
            return 6;
        }
        else if(ch == 'M')
        {
            return 7;
        }
        else
        {
            return -1;
        }
    }
    public int romanToInt(String s) {
       Stack<Character> stch = new Stack<>();
       Stack<Integer> stin = new Stack<>();

       int count = 0;

        for(int i = 0; i <s.length(); i++)
        {
            char ch = s.charAt(i);
            if(i == 0)
            {
                stch.push(ch);
                stin.push(val(ch));
            }
            else
            {
                if(preference(stch.peek()) >= preference(ch))
                {
                    stch.push(ch);
                    stin.push(val(ch));
                }

                else if(preference(stch.peek()) < preference(ch))
                {
                    stch.push(ch);
                    int val = stin.pop();
                    stin.push(val*-1);
                    stin.push(val(ch));
                }
                stch.push(ch);
            }   
        }

        while(stin.size() > 0)
        {
            int val = stin.pop();
            count += val;
        }
        return count;

        
    }
}