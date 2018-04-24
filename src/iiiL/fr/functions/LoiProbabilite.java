/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.util.ArrayList;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author Perez & Fock-Chow-Tho
 *
 */
public class LoiProbabilite {
	
	/**
	 * Loi uniforme g�n�rateur du syst�me (ensemble N)
	 * @param tailleListe la taille de la liste � renvoyer
	 * @return une liste contenant des nombres al�atoires entre 0 et 1
	 */
	public static ArrayList<Double> loiUniforme(int tailleListe) {
		/** Le r�sultat final */
		ArrayList<Double> nbGeneres = new ArrayList<Double>();
		
		for (int i = 0; i < tailleListe; i ++) {
			nbGeneres.add(Math.random());
		}
		
		return nbGeneres;
	}
	
	/**
	 * Loi exponentielle - Loi de probabilit� : f(x) = lambda * exp(-lambda * x)
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi exponentielle apr�s tirage
	 */
	public static ArrayList<Double> loiExponentielle(ArrayList<Double> nbAl�atoires, double lambda) {
		/** Le r�sultat final */
		ArrayList<Double> result = new ArrayList<Double>();
		
		// Fonction invers�e de la loi exponentielle
		for (int i = 0; i < nbAl�atoires.size(); i ++) {
			double calcul = (-1.0/lambda) * (Math.log(nbAl�atoires.get(i)));
			result.add(calcul);
		}
		
		return result;
	}
	

}
