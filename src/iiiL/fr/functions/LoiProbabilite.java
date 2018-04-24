/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.util.ArrayList;

/**
 * TODO commenter les responsabilités de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class LoiProbabilite {

	/**
	 * Loi uniforme générateur du système (ensemble N)
	 * @return une liste contenant des nombres aléatoires entre 0 et 1
	 */
	public static ArrayList<Double> loiUniforme() {
		// Le résultat final
		ArrayList<Double> nbGeneres = new ArrayList<Double>();

		for (int i = 0; i < 300; i ++) {
			nbGeneres.add(Math.random());
		}

		return nbGeneres;
	}

	/**
	 * Loi exponentielle
	 * @param lambda paramètre de la loi exponentielle
	 * @return une liste de nombre générés suivant la loi exponentielle
	 */
	public ArrayList<Double> loiExponentielle(double lambda) {
		// Génération d'une liste de nombre aléatoire
		ArrayList<Double> nbAleatoires = loiUniforme();
		// Le résultat final
		ArrayList<Double> result = new ArrayList<Double>();

		// Fonction inversée de la loi exponentielle
		for (int i = 0; i < nbAleatoires.size(); i ++) {
			double calcul = - (Math.log(nbAleatoires.get(i)) / lambda);
			result.add(calcul);
		}

		return result;
	}

	/**
	 * Loi normale - Méthode de Box et Müller
	 * @return le résultat de la loi normale après tirage
	 */
	public static ArrayList<Double> loiNormale() {
		// Série listeU de nombres aléatoires suivant la loi uniforme
		ArrayList<Double> listeU = loiUniforme();
		// Le résultat final 
		ArrayList<Double> result = new ArrayList<Double>();
		// Variables X et Y normales, centrées, réduites et indépendantes
		double x, y;
		
		// Calcul de X et Y en fonction des valeurs U et V
		for (int i = 0; i < listeU.size(); i += 2) {
			x = (Math.sqrt(-2 * Math.log(listeU.get(i)))) * Math.cos(2 * Math.PI * listeU.get(i+1));
			result.add(x);
			y = (Math.sqrt(-2 * Math.log(listeU.get(i)))) * Math.sin(2 * Math.PI * listeU.get(i+1));
			result.add(y);
		}
		
		return result;
	}

	/**
	 * Loi de Poisson (se génère à partir de la loi exponentielle)
	 * @param lambda reel positif représentant le paramètre de la loi exponentielle
	 * @param p paramètre de la loi de Poisson
	 * @param lambda paramètre de la loi exponentielle
	 * @return une liste de nombres générés aléatoirement selon la loi de Poisson
	 */
	public static ArrayList<Double> loiPoissondouble (int p, double lambda) {
		// Liste de nombres aléatoires générés suivant la loi Uniforme (0,1)
		ArrayList<Double> listeNbAleatoires = loiUniforme();
		// Le résultat final
		ArrayList<Double> listeResultats = new ArrayList<Double>();
		
		// Parcours de la liste et calcul via la fonction inverse de la loi
		for (int i = 0; i < listeNbAleatoires.size(); i ++) {
			int fact = Calcul.factorielle(p);
			double calcul = Math.exp(-lambda) * Math.pow(lambda, p) / fact;
			listeResultats.add(calcul);
		}

		return listeResultats;
	}

	/**
	 * Loi de Weibull 
	 * @param alpha paramètre de la loi de Weibull
	 * @param beta paramètre de la loi de Weibull
	 * @return liste de nombres générés aléatoirement selon la loi de Weibull
	 */
	public static ArrayList<Double> loiDeWeibull(double alpha, double beta) {
		// Liste de nombres générés aléatoirement suivant la loi uniforme
		ArrayList<Double> nbAleatoires = loiUniforme();
		// La liste finale 
		ArrayList<Double> result = new ArrayList<Double>();

		// Parcours de la liste et calcul via la fonction inversée de la loi
		for (int i = 0; i < nbAleatoires.size(); i ++) {
			double calcul = Math.pow((- (Math.log(1 - nbAleatoires.get(i))) / Math.pow(alpha, beta)), 1/beta);
			result.add(calcul);
		}

		return result;

	}
}
