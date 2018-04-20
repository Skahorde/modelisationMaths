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
	
	/**
	 * Loi uniforme g�n�rateur du syst�me (ensemble N)
	 * @param nbMax borne maximale de l'intervalle dans lequel la loi est d�finie
	 * @return un nombre al�atoire entre 0 et la borne maximale
	 */
	public static int loiUniforme(int nbMax) {
		/** Le r�sultat final */
		int result = 0;
		
		// La fonction random() renvoie un nombre al�atoire entre 0 et nbMax non compris
		return result = (int)(Math.random() * nbMax); 
	}
	
	/**
	 * Loi exponentielle - Loi de probabilit� : f(x) = lambda * exp(-lambda * x)
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi exponentielle apr�s tirage
	 */
	public static double loiExponentielle(double lambda, int x) {
		/** Le r�sultat final */
		double result = 0.0;
		
		if (lambda < 0) {
			System.out.println("Impossible ! Le param�tre est n�gatif !");
			return result = -1;
		} else {
			return result = lambda * Math.exp(-lambda * x);
		}
	}
	
	/**
	 * Loi de Poisson - Loi de probabilit� : f(x) = exp(-lambda) * ((lambda^x)/(k!))
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi exponentielle apr�s tirage
	 */
	public static double loiPoisson(double lambda, int x) {
		/** Le r�sultat final */
		double result = 0.0;
		
		if (lambda < 0 ) {
			System.out.println("Impossible ! Le param�tre est n�gatif !");
			return result = -1;
		} else {
			return result = Math.exp(-lambda) * ((Math.pow(lambda, x)/Calcul.factorielle(x)));
		}
	}
}
