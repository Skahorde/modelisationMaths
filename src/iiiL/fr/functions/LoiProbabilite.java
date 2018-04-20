/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;

/**
 * TODO commenter les responsabilités de la classe
 * @author conta
 *
 */
public class LoiProbabilite {
    
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
