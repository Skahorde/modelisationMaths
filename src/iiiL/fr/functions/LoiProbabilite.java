/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;
import java.util.Scanner;

/**
 * TODO commenter les responsabilités de la classe
 * @author Perez & Fock-Chow-Tho
 *
 */
public class LoiProbabilite {
	
	/**
	 * Loi uniforme générateur du système (ensemble N)
	 * @param nbMax borne maximale de l'intervalle dans lequel la loi est définie
	 * @return un nombre aléatoire entre 0 et la borne maximale
	 */
	public static int loiUniforme(int nbMax) {
		/** Le résultat final */
		int result = 0;
		
		// La fonction random() renvoie un nombre aléatoire entre 0 et nbMax non compris
		return result = (int)(Math.random() * nbMax); 
	}
	
	/**
	 * Loi exponentielle - Loi de probabilité : f(x) = lambda * exp(-lambda * x)
	 * @param lambda reel positif représentant le paramètre de la loi exponentielle
	 * @param x variable aléatoire
	 * @return le résultat de la loi exponentielle après tirage
	 */
	public static double loiExponentielle(double lambda, int x) {
		/** Le résultat final */
		double result = 0.0;
		
		if (lambda < 0) {
			System.out.println("Impossible ! Le paramètre est négatif !");
			return result = -1;
		} else {
			return result = lambda * Math.exp(-lambda * x);
		}
	}
	
	/**
	 * Loi de Poisson - Loi de probabilité : f(x) = exp(-lambda) * ((lambda^x)/(k!))
	 * @param lambda reel positif représentant le paramètre de la loi exponentielle
	 * @param x variable aléatoire
	 * @return le résultat de la loi exponentielle après tirage
	 */
	public static double loiPoisson(double lambda, int x) {
		/** Le résultat final */
		double result = 0.0;
		
		if (lambda < 0 ) {
			System.out.println("Impossible ! Le paramètre est négatif !");
			return result = -1;
		} else {
			return result = Math.exp(-lambda) * ((Math.pow(lambda, x)/Calcul.factorielle(x)));
		}
	}
}
