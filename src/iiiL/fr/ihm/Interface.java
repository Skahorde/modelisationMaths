/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import iiiL.fr.functions.Calcul;
import iiiL.fr.functions.LoiProbabilite;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author conta
 *
 */
public class Interface {

    /**
     * TODO commenter le r�le de cette m�thode
     * @param args
     */
    public static void main(String[] args) {
    	// ------------------------------
    	// --- Test de la factorielle ---
    	// ------------------------------
    	System.out.println("Factorielle\nR�sultat = " + Calcul.factorielle(10) + "\n");
    	
    	// -------------------------------
    	// --- Test de la loi uniforme ---
    	// -------------------------------
    	System.out.println("Loi uniforme sur [0;100[\nR�sultat = " + LoiProbabilite.loiUniforme(100) + "\n");
    	
    	// ------------------------------------
    	// --- Test de la loi exponentielle ---
    	// ------------------------------------
    	System.out.println("Loi exponentielle -> lambda = 0.004, variable al�atoire = 365\nR�sultat = " + LoiProbabilite.loiExponentielle(0.004, 365) + "\n");
    
    	// ---------------------------------
    	// --- Test de la loi de Poisson ---
    	// ---------------------------------
    	System.out.println("Loi de Poisson -> lambda = 20, variable al�atoire = 10\nR�sultat = " + LoiProbabilite.loiExponentielle(20, 10) + "\n");
    
    }

}
