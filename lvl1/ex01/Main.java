package lvl1.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
	public static void main() {

		System.out.println("<-----------EX 01 Lambdas ----------->");
		List<String> strings = Arrays.asList("first line", "second line", "other line", "fourth line", "fifth line");
		System.out.println("*Unfiltered list*");
		strings.forEach(s -> System.out.println(s));
		System.out.println("<====================================>\n");
		System.out.println("| list after filtering to get only the ones that contain letter o |");
		List<String> filteredLines = strings.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
		filteredLines.forEach(s -> System.out.println(s));
		System.out.println("<-----------EX 02 Lambdas ------------->");
		List<String> unFilteredList = Arrays.asList("one", "two", "sixtyfour", "fortyfive", "ninetyfive");
		System.out.println("*Unfiltered list*");
		unFilteredList.forEach(s -> System.out.println(s));
		System.out.println("<====================================>\n");
		System.out.println("| list after filtering those strings that contain o and are longer that 5 chars |");
		List<String> fileteredList = unFilteredList.stream().filter(s -> s.contains("o") && s.length() > 5)
				.collect(Collectors.toList());
		fileteredList.forEach(s -> System.out.println(s));
		System.out.println("<----------------Ex03 Lambdas --------------->\n");
		List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December");
		months.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex04 Lambdas ---------------->\n");
		months.forEach(System.out::println);
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex05 Lambdas ---------------->\n");
		PiValue pi = () -> 3.1415;
		System.out.println("The value of pi is " + pi.getPiValue());
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex06 Lambdas ---------------->\n");
		List<String> mixedList = Arrays.asList("87364", "Hello world", "4", "apple", "pear", "orange", "5");
		mixedList.forEach(s -> System.out.println(s));
		System.out.println("<--------------------------------------------->\n");
		List<String> AscendingSortedList = mixedList.stream().sorted((s1,s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
		AscendingSortedList.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex07 Lambdas ---------------->\n");
		List<String> descendingSortedList = mixedList.stream().sorted((s1,s2) -> Integer.compare(s2.length(), s1.length())).collect(Collectors.toList());
		System.out.println("List in descending order");
		descendingSortedList.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex08 Lambdas ---------------->\n");
		StringReverser reverser = (s) -> new StringBuilder(s).reverse().toString();
		String text = "Hello world!";
		System.out.println("Normal string: " + text);
		System.out.println("Reversed string " + reverser.reverse(text));
	}
}
