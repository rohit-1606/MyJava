package coding_Practice;
//code -2 reverse the whole word
//-hello I am here==>here am I hello
public class P002_ReverseSentence {
    public static void main(String[] args) {
        reverseSentenceWords("hello I am here");
    }


    public static void reverseSentenceWords(String word){
        String rev="";
        String[] ch =word.split(" ");
        for(int i=0;i<=ch.length-1;i++)
        {
            rev=ch[i]+ " " +rev;
        }
        System.out.println(rev);
    }
}
