/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author conta
 *
 */
public class LoiProbabilite {
    
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
