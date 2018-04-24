/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import iiiL.fr.functions.Calcul;
import java.util.ArrayList;
import iiiL.fr.functions.LoiProbabilite;

/**
 * TODO commenter les responsabilités de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class Interface {
	/** Liste des données */
	private static ArrayList<Double> donnees= new ArrayList<Double>();
	
	/** Chemin où se trouve le fichier excel */
	private static String path = "excel/KhiDeux.xlsm";

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
    public static void main(String[] args) {

    	System.out.println("--- DEBUT ---");
    	
    	// Instanciation de l'objet LoiProbabilité
    	LoiProbabilite proba = new LoiProbabilite();
    	
    	// Simulation de la loi exponentielle
    	donnees = proba.loiExponentielle(4.0);
    	// Envoi des données vers le fichier Excel
    	ExcelManager excelManager = new ExcelManager(path, "Exponentielle");
    	excelManager.writeExcelFile(donnees);
    	
//    	// Simulation de la loi de Poisson
//    	donnees = proba.loiPoisson();
//    	
//    	// Simulation de la loi normale
//    	donnees = proba.loiNormale();
//    	
//    	// Simulation de la loi de Weibull
//    	donnees = proba.loiDeWeibull(1, 3.25);    	
    	
    	System.out.println("--- FIN ---");
    }

}
