import java.util.*;
import java.util.stream.IntStream;

public class Task3_Palindrome {
    public static void main(String args[])
    {
        List<String> words=new ArrayList<String>();
        words.add("aba");
        words.add("add");
        words = retrievePalindromes(words);
        for(String word : words)
            System.out.println(word);
    }
    static List<String> retrievePalindromes(List<String> words)
    {
        List<String> ans = new ArrayList<String>();
           for(String word : words)
           {
        	   String t = word.replaceAll("\\s+", "").toLowerCase();
        	   if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
        		   ans.add(word);
            }
            return ans;
    }
}