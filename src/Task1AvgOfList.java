import java.util.OptionalDouble;
import java.util.*;

public class Task1AvgOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> listOfIntegers = Arrays.asList(2, 50, 99, 1, 94);
		 
        OptionalDouble average = listOfIntegers
            .stream()
            .mapToInt(number -> number.intValue())
            .average();
 
        System.out.println("Average of Numbers: " + average);
	}

}
