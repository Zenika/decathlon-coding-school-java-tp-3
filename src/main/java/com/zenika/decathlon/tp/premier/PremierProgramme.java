package com.zenika.decathlon.tp.premier;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Ma classe a la classe
 * @author nicolas-delsaux
 *
 */
public class PremierProgramme {
	/**
	 * Evidement, cette méthode est exécutée
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.asList(args).stream()
			.map(PremierProgramme::fibonacci)
			.collect(Collectors.toList()));
		System.out.println(fibonacci(10));
		
	}
	
	public static String fibonacci(String value) {
		int number = Integer.parseInt(value);
		return String.format("fibonacci(%d)=%d", number, fibonacci(number));
	}
	
	public static int fibonacci(int value) {
		// TODO implémenter cette fonction
		if (value==0) {
			return 0;
		} else if (value==1) {
			return 1;
		} else {
			return fibonacci(value -1) + fibonacci(value - 2);
		}
	}
}
