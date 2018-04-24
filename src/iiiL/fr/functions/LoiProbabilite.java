/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.util.ArrayList;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class LoiProbabilite {

	/**
	 * Loi uniforme g�n�rateur du syst�me (ensemble N)
	 * @return une liste contenant des nombres al�atoires entre 0 et 1
	 */
	public static ArrayList<Double> loiUniforme() {
		// Le r�sultat final
		ArrayList<Double> nbGeneres = new ArrayList<Double>();

		for (int i = 0; i < 300; i ++) {
			nbGeneres.add(Math.random());
		}

		return nbGeneres;
	}

	/**
	 * Loi exponentielle
	 * @param lambda param�tre de la loi exponentielle
	 * @return une liste de nombre g�n�r�s suivant la loi exponentielle
	 */
	public ArrayList<Double> loiExponentielle(double lambda) {
		// G�n�ration d'une liste de nombre al�atoire
		ArrayList<Double> nbAleatoires = loiUniforme();
		// Le r�sultat final
		ArrayList<Double> result = new ArrayList<Double>();

		// Fonction invers�e de la loi exponentielle
		for (int i = 0; i < nbAleatoires.size(); i ++) {
			double calcul = - (Math.log(nbAleatoires.get(i)) / lambda);
			result.add(calcul);
		}

		return result;
	}

	/**
	 * Loi normale - M�thode de Box et M�ller
	 * @return le r�sultat de la loi normale apr�s tirage
	 */
	public static ArrayList<Double> loiNormale() {
		// S�rie listeU de nombres al�atoires suivant la loi uniforme
		ArrayList<Double> listeU = loiUniforme();
		// Le r�sultat final 
		ArrayList<Double> result = new ArrayList<Double>();
		// Variables X et Y normales, centr�es, r�duites et ind�pendantes
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
	 * Loi de Poisson (se g�n�re � partir de la loi exponentielle)
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param p param�tre de la loi de Poisson
	 * @param lambda param�tre de la loi exponentielle
	 * @return une liste de nombres g�n�r�s al�atoirement selon la loi de Poisson
	 */
	public static ArrayList<Double> loiPoissondouble (int p, double lambda) {
		// Liste de nombres al�atoires g�n�r�s suivant la loi Uniforme (0,1)
		ArrayList<Double> listeNbAleatoires = loiUniforme();
		// Le r�sultat final
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
	 * @param alpha param�tre de la loi de Weibull
	 * @param beta param�tre de la loi de Weibull
	 * @return liste de nombres g�n�r�s al�atoirement selon la loi de Weibull
	 */
	public static ArrayList<Double> loiDeWeibull(double alpha, double beta) {
		// Liste de nombres g�n�r�s al�atoirement suivant la loi uniforme
		ArrayList<Double> nbAleatoires = loiUniforme();
		// La liste finale 
		ArrayList<Double> result = new ArrayList<Double>();

		// Parcours de la liste et calcul via la fonction invers�e de la loi
		for (int i = 0; i < nbAleatoires.size(); i ++) {
			double calcul = Math.pow((- (Math.log(1 - nbAleatoires.get(i))) / Math.pow(alpha, beta)), 1/beta);
			result.add(calcul);
		}

		return result;

	}
}
