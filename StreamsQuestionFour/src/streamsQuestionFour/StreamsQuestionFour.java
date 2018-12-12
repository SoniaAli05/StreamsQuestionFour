package streamsQuestionFour;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsQuestionFour {
//Create a method that takes a list of Integers and returns the sum of all even numbers in the list.
	public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	Optional<Integer> sumOfEven = numbers.stream().filter(num -> isEven(num)).reduce((a,b) -> a + b);
	sumOfEven.ifPresent(System.out::print);
	}


public static boolean isEven(int a) {
	
	if(a % 2 == 0) {
		return true;
	}
	
	return false;
	
}}

