/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;
import java.util.Scanner;

/**
 * TODO commenter les responsabilités de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
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
         * Loi normale - Loi de probabilité f(x) = 1 / (sigma * racine(2 * pi)) * exp((x - m²) / (2 * sigma²)) 
         * @param m reel représentant la moyenne de la fonction
         * @param sigma reel positif représentant l'écart-type de la fonction
         * @param x variable aléatoire
         * @return le résultat de la loi normale après tirage
         */
        public static double loiNormale(double m, double sigma, int x) {
                /** Le résultat final */
                double result = 0.0;
                
                if (sigma < 0) {
                        System.out.println("Impossible ! Le sigma est négatif !");
                        return result = -1;
                } else if (x < 0) {
                        System.out.println("Impossible ! Le x est négatif !");
                        return result = -1;
                } else {
                        return result = 1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.exp((x - Math.pow(m, 2)) / (2 * Math.pow(sigma, 2)));
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
	
	 /**
         * Loi de Weibull - Loi de probabilité f(x) = (k / lambda) * (x / lambda)^(k-1) * exp(-x / lambda)^k 
         * @param k reel positif représentant le paramètre de forme
         * @param lambda reel positif représentant le paramètre d'échelle de la distribution
         * @param x variable aléatoire
         * @return le résultat de la loi de Weibull après tirage
         */
        public static double loiDeWeibull(double k, double lambda, int x) {
                /** Le résultat final */
                double result = 0.0;
                
                if (k < 0) {
                        System.out.println("Impossible ! Le sigma est négatif !");
                        return result = -1;
                } else if (lambda < 0) {
                        System.out.println("Impossible ! Le lambda est négatif !");
                        return result = -1;
                } else if (x < 0) {
                        System.out.println("Impossible ! Le x est négatif !");
                        return result = -1;
                } else {
                        return result = (k / lambda) * Math.pow((x / lambda), (k-1)) * Math.exp(Math.pow((-x / lambda), k));
                }            
        }
}
