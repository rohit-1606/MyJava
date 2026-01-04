package coding_Practice;

public class P006_DuplicateCharactersFromString {
    public static void main(String[] args) {
        duplicateCharFromString();
    }
    public static void duplicateCharFromString(){
        String s="Helloo";
        int count;
        char [] ch = s.toCharArray();
        //H
        //e
        //l
        //l
        //0

        for(int i=0;i<=ch.length-1;i++)
        {
            count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j])
                {
                    // System.out.println(ch[i]);
                    count = count+1;
                }
            }
            if(count>1)
            {
                System.out.println(ch[i]);
            }

        }
    }

}
