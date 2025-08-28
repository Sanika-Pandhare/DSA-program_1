public class Backtracing {

    public static void printpermutation(String str,String permutation,int idx)
{
    if(str.length()==0)
    {
        System.out.println(permutation);
        return;
    }
    for(int i=0; i<str.length();i++)
    {
        char currChar=str.charAt(i);
        String newString=str.substring(0, i)+str.substring(i+1);
        printpermutation(newString, permutation+currChar, idx+1);
    }
}

public static void main(String args[])
{
    String str="ABC";
    printpermutation(str, " ", 0);
}

    
}


/* Arrange them in a single line
ABc 
=> ABC
 ACB
 BAC
 BCA
 CAB
 CBA
*/