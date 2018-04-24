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
	 * @param tailleListe la taille de la liste � renvoyer
	 * @return une liste contenant des nombres al�atoires entre 0 et 1
	 */
	public ArrayList<Double> loiUniforme(int tailleListe) {
		// Le r�sultat final
		ArrayList<Double> nbGeneres = new ArrayList<Double>();
		
		for (int i = 0; i < tailleListe; i ++) {
			nbGeneres.add(Math.random());
		}
		
		return nbGeneres;
	}
	
	/**
	 * Loi exponentielle
	 * @param nbAl�atoires liste de nombres g�n�r�s al�atoirement suivant une loi uniforme
	 * @param lambda param�tre de la loi exponentielle
	 * @return une liste de nombre g�n�r�s suivant la loi exponentielle
	 */
	public ArrayList<Double> loiExponentielle(ArrayList<Double> nbAl�atoires, double lambda) {
		// Le r�sultat final
		ArrayList<Double> result = new ArrayList<Double>();
		
		// Fonction invers�e de la loi exponentielle
		for (int i = 0; i < nbAl�atoires.size(); i ++) {
			double calcul = - (Math.log(nbAl�atoires.get(i)) / lambda);
			result.add(calcul);
		}
		
		return result;
	}
	
	/**
         * Loi normale - Loi de probabilit� f(x) = 1 / (sigma * racine(2 * pi)) * exp((x - m�) / (2 * sigma�)) 
         * @param m reel repr�sentant la moyenne de la fonction
         * @param sigma reel positif repr�sentant l'�cart-type de la fonction
         * @param x variable al�atoire
         * @return le r�sultat de la loi normale apr�s tirage
         */
        public static double loiNormale(double m, double sigma, int x) {
                /** Le r�sultat final */
                double result = 0.0;
                
                if (sigma < 0) {
                        System.out.println("Impossible ! Le sigma est n�gatif !");
                        return result = -1;
                } else if (x < 0) {
                        System.out.println("Impossible ! Le x est n�gatif !");
                        return result = -1;
                } else {
                        return result = 1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.exp((x - Math.pow(m, 2)) / (2 * Math.pow(sigma, 2)));
                }            
        }
	
	/**
	 * Loi de Poisson (se g�n�re � partir de la loi exponentielle)
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param p param�tre de la loi de Poisson
	 * @param lambda param�tre de la loi exponentielle
	 * @return une liste de nombres g�n�r�s al�atoirement selon la loi de Poisson
	 */
	public static ArrayList<Double> loiPoisson(ArrayList<Double> data, double p, double lambda) {
		/** Le r�sultat final */
		ArrayList<Double> result = new ArrayList<Double>();
		/** t repr�sente un intervalle de temps entre 2 �v�nements */
		double t = p/lambda;
		
		//TODO
		
		return result;
	}
	
	 /**
         * Loi de Weibull 
         * @param data liste de valeurs g�n�r�es al�atoirement suivant la loi uniforme
         * @param alpha param�tre de la loi de Weibull
         * @param beta param�tre de la loi de Weibull
         * @return liste de nombres g�n�r�s al�atoirement selon la loi de Weibull
         */
        public static ArrayList<Double> loiDeWeibull(ArrayList<Double> data, double alpha, double beta) {
        	// La liste finale 
        	ArrayList<Double> result = new ArrayList<Double>();
        	
        	// Parcours de la liste et calcul via la fonction invers�e de la loi
        	for (int i = 0; i < data.size(); i ++) {
        		double calcul = Math.pow((- (Math.log(1 - data.get(i))) / Math.pow(alpha, beta)), 1/beta);
        		result.add(calcul);
        	}
        	
        	return result;
         
        }
}
