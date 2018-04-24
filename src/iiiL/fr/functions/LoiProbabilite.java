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
	public ArrayList<Double> loiExponentielle(ArrayList<Double> nbAl�atoires, double lambda) {
		/** Le r�sultat final */
		ArrayList<Double> result = new ArrayList<Double>();
		
		// Fonction invers�e de la loi exponentielle
		for (int i = 0; i < nbAl�atoires.size(); i ++) {
			double calcul = (-1.0/lambda) * (Math.log(nbAl�atoires.get(i)));
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
	
	 /**
         * Loi de Weibull - Loi de probabilit� f(x) = (k / lambda) * (x / lambda)^(k-1) * exp(-x / lambda)^k 
         * @param k reel positif repr�sentant le param�tre de forme
         * @param lambda reel positif repr�sentant le param�tre d'�chelle de la distribution
         * @param x variable al�atoire
         * @return le r�sultat de la loi de Weibull apr�s tirage
         */
        public static double loiDeWeibull(double k, double lambda, int x) {
                /** Le r�sultat final */
                double result = 0.0;
                
                if (k < 0) {
                        System.out.println("Impossible ! Le sigma est n�gatif !");
                        return result = -1;
                } else if (lambda < 0) {
                        System.out.println("Impossible ! Le lambda est n�gatif !");
                        return result = -1;
                } else if (x < 0) {
                        System.out.println("Impossible ! Le x est n�gatif !");
                        return result = -1;
                } else {
                        return result = (k / lambda) * Math.pow((x / lambda), (k-1)) * Math.exp(Math.pow((-x / lambda), k));
                }            
        }
}
