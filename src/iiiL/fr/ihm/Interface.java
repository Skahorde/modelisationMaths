/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import java.util.ArrayList;

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
    
    	LoiProbabilite proba = new LoiProbabilite();
    	
    	ArrayList<Double> test = new ArrayList<Double>();
    	
//    	test = proba.loiUniforme(300);
//    	
//    	for (int i = 0; i < test.size(); i ++) {
//    		System.out.println(test.get(i));
//    	}

    	test = proba.loiExponentielle(proba.loiUniforme(300), 4.0);
    	
    	// Afficher liste 
    	for (int i = 0; i < test.size(); i ++) {
    		System.out.println(test.get(i));
    	}
    }

}
