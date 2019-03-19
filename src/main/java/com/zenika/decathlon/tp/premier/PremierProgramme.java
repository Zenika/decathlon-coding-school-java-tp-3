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
	}
	
	public static String fibonacci(String value) {
		int number = Integer.parseInt(value);
		return String.format("fibonacci(%d)=%d", number, fibonacci(number));
	}
    /** 
     *  
     * @param integer
     * @return integer
     */

	public static int fibonacci(int value) {
		// TODO implémenter cette fonction
		int somme=0;
		switch (value) {
			case 0 :
				somme=0;
				break;
			case 1 :
				somme=1;
				break;
			default :
				somme=fibonacci(value-1)+fibonacci(value-2);
		}
		return somme;
	}
}
