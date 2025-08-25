public class RecursionPermutation {

    public static void printpermutation(String str,String permutation)
{
if(str.length()==0)
{
    System.out.println(permutation);
    return;
}
for(int i=0; i<str.length(); i++)
{
    char currChar=str.charAt(i);
    //"abc"->"ab"
    String newstr=str.substring(0, i)+str.substring(i+1);
    printpermutation(newstr, permutation+currChar);


}
} 
public static void main(String args[])
{
    String str="abc";
    printpermutation(str,"");
}   
}

/*permutation of given string
abc*/
/* 
 abc
acb
bac
bca
cab
cba
*/
