/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import iiiL.fr.functions.Calcul;
import iiiL.fr.functions.LoiProbabilite;

/**
 * TODO commenter les responsabilités de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class Interface {

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
    public static void main(String[] args) {
    	
    	LoiProbabilite proba = new LoiProbabilite(60);
    	
    	// ------------------------------
    	// --- Test de la factorielle ---
    	// ------------------------------
    	System.out.println("Factorielle\nRésultat = " + Calcul.factorielle(10) + "\n");
    	
    	// -------------------------------
    	// --- Test de la loi uniforme ---
    	// -------------------------------
    	System.out.println("Loi uniforme sur [0;20[\n");
    	proba.loiUniforme(6);
    	
    	
//    	// ------------------------------------
//    	// --- Test de la loi exponentielle ---
//    	// ------------------------------------
//    	System.out.println("Loi exponentielle -> lambda = 0.004, variable aléatoire = 365\nRésultat = " + proba.loiExponentielle(0.004, 365) + "\n");
//    	
//    	// ---------------------------------
//        // --- Test de la loi normale ---
//        // ---------------------------------
//        System.out.println("Loi normale -> moyenne = 0, écart-type = 0.2, variable aléatoire = 50\nRésultat = " + proba.loiNormale(0, 0.2, 50) + "\n");
//    
//    	// ---------------------------------
//    	// --- Test de la loi de Poisson ---
//    	// ---------------------------------
//    	System.out.println("Loi de Poisson -> lambda = 20, variable aléatoire = 10\nRésultat = " + proba.loiExponentielle(20, 10) + "\n");
//    	
//    	// ---------------------------------
//        // --- Test de la loi de Weibull ---
//        // ---------------------------------
//        System.out.println("Loi de Weibull -> paramètre de forme k = 2, paramètre d'échelle lambda = 0.5 , variable aléatoire = 100\nRésultat = " + proba.loiDeWeibull(2, 0.5, 100) + "\n");
    
    }

}
