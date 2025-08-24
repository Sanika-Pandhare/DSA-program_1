public class Subsequences {

    public static void sub(String str,int idx, String newString)
    {
        if(idx==str.length())
        {
            System.out.println(newString);
            return;
        }
       char currChar = str.charAt(idx);
       //to be
         sub(str,idx+1,newString+currChar);
         //or not to be

         sub(str,idx+1,newString);

    }

    public static void main(String args[])

    {
     String str="abc";
      sub(str,0,"");
    }
    


}