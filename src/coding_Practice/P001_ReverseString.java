package coding_Practice;

public class P001_ReverseString {
    public static void main(String[] args) {
        reversString("Rohit");
    }

    //Code1-Reverse string
    public static void reversString(String name){
        String rev="";
        String original=name;
        for(int i=0;i<=name.length()-1;i++)
        {
            rev=name.charAt(i) + rev;
        }
        System.out.println(rev);
        if(original.equalsIgnoreCase(rev)){
            System.out.println("Stirng is palindrome");
        }
        else
        {
            System.out.println("Stirng is not palindrome");
        }
    }

}
