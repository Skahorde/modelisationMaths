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
	 * @param tailleListe la taille de la liste à renvoyer
	 * @return une liste contenant des nombres aléatoires entre 0 et 1
	 */
	public ArrayList<Double> loiUniforme(int tailleListe) {
		// Le résultat final
		ArrayList<Double> nbGeneres = new ArrayList<Double>();
		
		for (int i = 0; i < tailleListe; i ++) {
			nbGeneres.add(Math.random());
		}
		
		return nbGeneres;
	}
	
	/**
	 * Loi exponentielle
	 * @param nbAléatoires liste de nombres générés aléatoirement suivant une loi uniforme
	 * @param lambda paramètre de la loi exponentielle
	 * @return une liste de nombre générés suivant la loi exponentielle
	 */
	public ArrayList<Double> loiExponentielle(ArrayList<Double> nbAléatoires, double lambda) {
		// Le résultat final
		ArrayList<Double> result = new ArrayList<Double>();
		
		// Fonction inversée de la loi exponentielle
		for (int i = 0; i < nbAléatoires.size(); i ++) {
			double calcul = - (Math.log(nbAléatoires.get(i)) / lambda);
			result.add(calcul);
		}
		
		return result;
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
	 * Loi de Poisson (se génère à partir de la loi exponentielle)
	 * @param lambda reel positif représentant le paramètre de la loi exponentielle
	 * @param p paramètre de la loi de Poisson
	 * @param lambda paramètre de la loi exponentielle
	 * @return une liste de nombres générés aléatoirement selon la loi de Poisson
	 */
	public static ArrayList<Double> loiPoisson(ArrayList<Double> data, double p, double lambda) {
		/** Le résultat final */
		ArrayList<Double> result = new ArrayList<Double>();
		/** t représente un intervalle de temps entre 2 évènements */
		double t = p/lambda;
		
		//TODO
		
		return result;
	}
	
	 /**
         * Loi de Weibull 
         * @param data liste de valeurs générées aléatoirement suivant la loi uniforme
         * @param alpha paramètre de la loi de Weibull
         * @param beta paramètre de la loi de Weibull
         * @return liste de nombres générés aléatoirement selon la loi de Weibull
         */
        public static ArrayList<Double> loiDeWeibull(ArrayList<Double> data, double alpha, double beta) {
        	// La liste finale 
        	ArrayList<Double> result = new ArrayList<Double>();
        	
        	// Parcours de la liste et calcul via la fonction inversée de la loi
        	for (int i = 0; i < data.size(); i ++) {
        		double calcul = Math.pow((- (Math.log(1 - data.get(i))) / Math.pow(alpha, beta)), 1/beta);
        		result.add(calcul);
        	}
        	
        	return result;
         
        }
}
