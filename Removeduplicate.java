public class Removeduplicate {
    public static boolean[] map= new  boolean[26];
    public static void removeduplicate(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }

        char currChar =str.charAt(idx);
        if(map[currChar-'a']==true)
        {
           removeduplicate(str, idx+1,newstring) ;
        }
        else{
            newstring=newstring+currChar;
            map[currChar-'a']=true;
            removeduplicate(str, idx+1, newstring);

        }

    }
    public static void main(String args[])
    {
        String str="abbccda";
        removeduplicate(0,0,"");

    }
    
}
