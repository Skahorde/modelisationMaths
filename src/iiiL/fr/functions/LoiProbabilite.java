/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.util.ArrayList;

/**
 * TODO commenter les responsabilités de la classe
 * @author Perez & Fock-Chow-Tho
 *
 */
public class LoiProbabilite {
	
	/**
	 * Loi uniforme générateur du système (ensemble N)
	 * @param tailleListe la taille de la liste à renvoyer
	 * @return une liste contenant des nombres aléatoires entre 0 et 1
	 */
	public static ArrayList<Double> loiUniforme(int tailleListe) {
		/** Le résultat final */
		ArrayList<Double> nbGeneres = new ArrayList<Double>();
		
		for (int i = 0; i < tailleListe; i ++) {
			nbGeneres.add(Math.random());
		}
		
		return nbGeneres;
	}
	
	/**
	 * Loi exponentielle - Loi de probabilité : f(x) = lambda * exp(-lambda * x)
	 * @param lambda reel positif représentant le paramètre de la loi exponentielle
	 * @param x variable aléatoire
	 * @return le résultat de la loi exponentielle après tirage
	 */
	public static ArrayList<Double> loiExponentielle(ArrayList<Double> nbAléatoires, double lambda) {
		/** Le résultat final */
		ArrayList<Double> result = new ArrayList<Double>();
		
		// Fonction inversée de la loi exponentielle
		for (int i = 0; i < nbAléatoires.size(); i ++) {
			double calcul = (-1.0/lambda) * (Math.log(nbAléatoires.get(i)));
			result.add(calcul);
		}
		
		return result;
	}
	

}
