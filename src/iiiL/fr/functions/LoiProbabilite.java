/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;
import java.util.Scanner;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author Perez & Fock-Chow-Tho
 *
 */
public class LoiProbabilite {
	
	public static int loiUniforme(int nbMax) {
		/** Le r�sultat final */
		int result = 0;
		
		// La fonction random() renvoie un nombre al�atoire entre 0 et nbMax non compris
		return result = (int)(Math.random() * nbMax); 
	}
	
}
