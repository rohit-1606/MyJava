package logical_Programs;

public class Lo1ReverseString {
    public static void main(String[] args) {
        //Reverse given string
        String name="Welcome";
        String revString="";
        for(int i=name.length()-1;i>=0;i--)
        {
            	revString=revString+name.charAt(i);

            //System.out.print(name.charAt(i));
        }
       System.out.println(revString);

        //Reverse Statement without reversing words
        //input="How are you"
        //output="you are How"
        String inputStatement="How are you";
        String [] splitsentence=inputStatement.split(" ");
        String outputSentence="";
        for(int i=splitsentence.length-1;i>=0;i--)
        {
            outputSentence= outputSentence + splitsentence[i] + " ";
        }
        System.out.println(outputSentence);

        //Reverse Each word in statement without changing sequence
        //input="How are you"
        //output=woH era uoy

        String eachWordInput="How are you";
        String eachwordReverse="";
        for(int i=eachWordInput.length()-1;i>=0;i--)
        {
            eachwordReverse=eachwordReverse + eachWordInput.charAt(i);
        }
        System.out.println(eachwordReverse);
        String eachWordarr[] =eachwordReverse.split(" ");
        String outputEachWord="";
        for(int i=eachWordarr.length-1;i>=0;i--)
        {
            outputEachWord=outputEachWord + eachWordarr[i] + " ";
        }
        System.out.print(outputEachWord);
    }
    }

