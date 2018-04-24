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
	/** Liste des données */
	private static ArrayList<Double> donneesExponentielle = new ArrayList<Double>();
	/** Quantité de nombres à générer */
	private static int qteNbAleatoires = 300;
	
	/** Chemin où se trouve le fichier excel */
	private static String path = "excel/khi2_macro.xlsm";

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
    public static void main(String[] args) {
    	System.out.println("--- DEBUT ---");
    	
    	// Instanciation de l'objet LoiProbabilité
    	LoiProbabilite proba = new LoiProbabilite();
    	
    	// Simulation de la loi exponentielle
    	donneesExponentielle = proba.loiExponentielle(proba.loiUniforme(qteNbAleatoires), 4);
    	
    	// Envoi des données vers le fichier Excel
    	ExcelManager excelManager = new ExcelManager(path, "exponentielle");
    	excelManager.writeExcelFile(donneesExponentielle);
    	System.out.println("--- FIN ---");
    }

}
