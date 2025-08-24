
//Print all the unique subsequences of a string
//"aaa"

import java.util.HashSet;

public class Subsequences1{

    public static void  sub1(String str, int idx, String newString,HashSet<String> set)
    {
         if(idx == str.length())
         {
            if(set.contains(newString))
            {
            return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }

        
         }

         char currChar =str.charAt(idx);
        sub1(str,idx+1,newString+currChar,set);

        sub1(str, idx+1, newString,set);

    }
    public static void main(String args[])
    {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        sub1(str,0,"",set);

        
    }
    
}
