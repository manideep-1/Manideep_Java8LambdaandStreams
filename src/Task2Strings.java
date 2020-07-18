import java.util.*;
import java.util.stream.Collectors;

public class Task2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>();
        words.add("aba");
        words.add("bbb");
        words.add("addddda");
        words = words.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
        for(String word : words)
            System.out.println(word);
	}

}
