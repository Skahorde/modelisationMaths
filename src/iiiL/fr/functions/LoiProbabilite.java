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
}
