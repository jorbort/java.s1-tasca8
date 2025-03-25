package lvl2.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main() {
		System.out.println("<---------------Ex01 Lambdas ---------------->\n");
		List<String> names = Arrays.asList("Raul", "Astor", "Carlos", "Antonio", "Adolofo", "Juan", "Alfonzina", "Art",
				"art", "Ant", "ant");
		List<String> filteredNames = names.stream().filter(s -> s.startsWith("A") && s.length() == 3)
				.collect(Collectors.toList());
		System.out.println("<<<Unfiltered names List>>>");
		names.forEach(s -> System.out.println(s));
		System.out
				.println("<<<List after filtering only those names that start with an A and have exactly 3 letters>>>");
		filteredNames.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex02 Lambdas ---------------->\n");
		Function<Integer, String> prepend = i -> (i % 2 == 0 ? "e" : "o") + i;
		List<Integer> numbers = Arrays.asList(3, 44, 55, 67, 99, 333, 124, 258, 21312312);
		System.out.println("Numbers list before");
		numbers.forEach(n -> System.out.println(n));
		String result = numbers.stream().map(prepend).collect(Collectors.joining(", "));
		System.out.println("List after being parsed and prepended with o for uneven numbers and e for even numbers:\n|"
				+ result + "|");
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex03 Lambdas ---------------->\n");
		Calculator incrementer = (N1, N2) -> (N1 + N2);
		float sumResult = incrementer.operation(2, 2);
		System.out.println("Result after appling operation() as sum: " + sumResult);
		Calculator multiplicator = (N1, N2) -> (N1 * N2);
		float multResult = multiplicator.operation(3, 3);
		System.out.println("Result after appling operation() as multiplication: " + multResult);
		Calculator decrementor = (N1, N2) -> (N1 - N2);
		float restResult = decrementor.operation(4, 8);
		System.out.println("Result after appling operation() as rest: " + restResult);
		Calculator divider = (N1, N2) -> (N1 / N2);
		try {
			float divitionResult = divider.operation(9, 4);
			System.out.println("Result after appling operation() as divition: " + divitionResult);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		System.out.println("<============================================>\n");
		System.out.println("<---------------Ex04 Lambdas ---------------->\n");
		List<String> variedList = Arrays.asList("hola", "Zebra", "4567", "lhaasdg", "37373", "23893", "esdsd",
				"ecuador", "brasil", "triceratops");
		List<String> sortedList = variedList.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println("List after sorting by the first character");
		sortedList.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		List<String> listStartingWithA = variedList.stream().sorted((s1, s2) -> {
			boolean s1containsE = s1.contains("e");
			boolean s2ContainsE = s2.contains("e");
			if (s1containsE && !s2ContainsE) {
				return -1;
			} else if (!s1containsE && s2ContainsE) {
				return 1;
			} else {
				return s1.compareToIgnoreCase(s2);
			}
		})
				.collect(Collectors.toList());
		System.out.println(
				"List after putting all the string starting with e first and then sorting by the first character");
		listStartingWithA.forEach(s -> System.out.println(s));
		System.out.println("<============================================>\n");
		List<String> replacedList = variedList.stream().map(s -> s.replace("a", "4")).collect(Collectors.toList());
		System.out.println("List after replacing each appearence of a with 4");
		replacedList.forEach(System.out::println);
		System.out.println("<============================================>\n");
		List<String> onlyNumbersList = variedList.stream().filter(s -> s.matches("^\\d+$"))
				.collect(Collectors.toList());
		System.out.println("List after filtering only those that contain only numeric values");
		onlyNumbersList.forEach(System.out::println);
		System.out.println("<============================================>\n");
	}

}
