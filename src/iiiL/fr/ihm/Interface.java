/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import iiiL.fr.functions.Calcul;
import iiiL.fr.functions.LoiProbabilite;

/**
 * TODO commenter les responsabilités de la classe
 * @author conta
 *
 */
public class Interface {

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
    public static void main(String[] args) {
    	// ------------------------------
    	// --- Test de la factorielle ---
    	// ------------------------------
    	System.out.println("Factorielle\nRésultat = " + Calcul.factorielle(10) + "\n");
    	
    	// -------------------------------
    	// --- Test de la loi uniforme ---
    	// -------------------------------
    	System.out.println("Loi uniforme sur [0;100[\nRésultat = " + LoiProbabilite.loiUniforme(100) + "\n");
    	
    	// ------------------------------------
    	// --- Test de la loi exponentielle ---
    	// ------------------------------------
    	System.out.println("Loi exponentielle -> lambda = 0.004, variable aléatoire = 365\nRésultat = " + LoiProbabilite.loiExponentielle(0.004, 365) + "\n");
    
    	// ---------------------------------
    	// --- Test de la loi de Poisson ---
    	// ---------------------------------
    	System.out.println("Loi de Poisson -> lambda = 20, variable aléatoire = 10\nRésultat = " + LoiProbabilite.loiExponentielle(20, 10) + "\n");
    
    }

}
