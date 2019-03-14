package com.zenika.decathlon.tp.premier;
import java.util.Arrays;

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
		System.out.println(Arrays.asList(args));
	}
	
	public static int fibonacci(int value) {
		switch(value) {
		case 0: return 0;
		case 1: return 1;
		default:
			return fibonacci(value-1)+fibonacci(value-2);
		}
	}
}
