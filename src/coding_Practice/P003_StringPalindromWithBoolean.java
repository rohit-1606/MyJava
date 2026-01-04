package coding_Practice;

import java.sql.SQLOutput;

public class P003_StringPalindromWithBoolean {
    public static void main(String[] args) {
        boolean result =palindromString("Level");
        System.out.println(result);
    }
    public static boolean palindromString(String name){
        String rev="";
        String original=name;
        for(int i=0;i<=name.length()-1;i++)
        {
            rev=name.charAt(i) + rev;
        }
        System.out.println(rev);
        if(original.equalsIgnoreCase(rev)){
            //System.out.println("Stirng is palindrome");
            return true;
        }
        else
        {

            return false;
            //System.out.println("Stirng is not palindrome");
        }
    }
}
