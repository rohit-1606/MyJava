package coding_Practice;

import java.util.HashMap;

public class P007_OccuranceOfEachWordInString {
    public static void main(String[] args) {
        eachwordOccurance();
    }
    public static void eachwordOccurance(){

        String s ="Welcome";
        char chararray[] = s.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : chararray)
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

    }
}
