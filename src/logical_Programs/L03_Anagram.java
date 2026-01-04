package logical_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L03_Anagram {
    public static void main(String[] args) {

        // Define the input strings
        String inputString1="Debit Card!";
        String inputString2="Bad Credit";

        // Create working copies, as the original method modified its parameters
        //String s1 = inputString1;
        //String s2 = inputString2;

        boolean resultIsAnagram;   // This will store the final boolean result

        // 1. Remove non-letter characters and convert to lowercase for s1
        String s1=inputString1.replaceAll("[^a-zA-Z]", "").toLowerCase(); // s1 is now "debitcard"

        // 2. Remove non-letter characters and convert to lowercase for s2
        String s2=inputString2.replaceAll("[^a-zA-Z]", "").toLowerCase();  // s2 is now "badcredit

        // 3. Check if lengths are different
        if(s1.length()!=s2.length()){

            // Lengths are "debitcard" (9) and "badcredit" (9). 9 != 9 is false.
            // So, this block is skipped.
            // If lengths were different, e.g., "hello" (5) and "world!" (5 -> normalized to "world" (5))
            // vs "hellos" (6), then 5 != 6 would be true.
            resultIsAnagram= false;
        }
        else {
            // Lengths are equal, proceed with character sorting and comparison.
            // 4. Sort the characters of string s1
            char arr1[] =s1.toCharArray();  // arr1 = ['d','e','b','i','t','c','a','r','d']
            Arrays.sort(arr1);              // arr1 = ['a','b','c','d','d','e','i','r','t']


            // 5. Sort the characters of string s2
            char arr2[]=s2.toCharArray();   // arr2 = ['b','a','d','c','r','e','d','i','t']
            Arrays.sort(arr2);              // arr2 = ['a','b','c','d','d','e','i','r','t']



            // 6. Compare sorted strings (character arrays)
            // Assume they are anagrams until a mismatch is found
            resultIsAnagram=true;
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    // Iteration 1: i=0. arr1[0] ('a') == arr2[0] ('a'). Condition (arr1[i] != arr2[i]) is false.
                    resultIsAnagram=false;  // Set to false if any character mismatch
                    break;                   // No need to check further, exit the loop
                }
            }

            // If the loop completed without finding any mismatches, resultIsAnagram remains true.
        }

        // If the loop completed without finding any mismatches, resultIsAnagram remains true.
        // --- End of logic from areAnagrams method ---

        // Now, use the 'resultIsAnagram' boolean

        if(resultIsAnagram){
            System.out.println(inputString1 + " & "+   inputString2 + " are anagram");

        }
        else {
            System.out.println(inputString1 + " "+ inputString2 + " are not anagram");
        }


    }

}
