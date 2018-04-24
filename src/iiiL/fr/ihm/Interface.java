/*
 * Interface.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.ihm;

import java.util.ArrayList;

import iiiL.fr.functions.LoiProbabilite;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author conta
 *
 */
public class Interface {
	/** Liste des donn�es */
	private static ArrayList<Double> donnees = new ArrayList<Double>();
	/** Quantit� de nombres � g�n�rer */
	private static int qteNbAleatoires = 300;
	
	/** Chemin o� se trouve le fichier excel */
	private static String path = "excel/khi2.xlsx";

    /**
     * TODO commenter le r�le de cette m�thode
     * @param args
     */
    public static void main(String[] args) {
    	System.out.println("--- DEBUT ---");
    	// Simulation de la loi de probabilit�
    	LoiProbabilite proba = new LoiProbabilite();
    	donnees = proba.loiExponentielle(proba.loiUniforme(qteNbAleatoires), 4);
    	
    	// Traitement via Excel
    	ExcelManager excelManager = new ExcelManager(path, "exponentielle");
    	excelManager.writeExcelFile(donnees);
    	System.out.println("--- FIN ---");
    }

}
