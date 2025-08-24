// print keypad combination
public class Keypad
{

    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str,int idx,String combination)
    {
        if(idx ==str.length())
        {
            System.out.println(combination);
            return;
        }

        char currChar=str.charAt(idx);
        int digit=currChar-'0';
        String mapping=keypad[digit];
        for(int i=0; i<mapping.length(); i++)
        {
          printCombination(str,idx+1,combination+mapping.charAt(i)); 
        }
    }

    public static void main(String args[])
    {
        String str="23";
        printCombination(str,0,"");
    }


}