/*
 * LoiProbabilite.java                                   19 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

import java.lang.Math;
import java.util.Scanner;

/**
 * TODO commenter les responsabilit�s de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class LoiProbabilite {

	/** Integer repr�sentant le nombre de tirages */
	private static int nbTirages = 0;

	/**
	 * Le tableau des effectifs sous la forme suivante :
	 * 
	 * |cat�gorie|th�orique|observ�|
	 * |    A    |    15   |   12  |
	 * |	B	 |	  15   |   14  |
	 * |    C    |    15   |   18  |
	 * |    D    |    15   |   16  |
	 * 
	 */
	private static int[][] tableauEffectifs = null;

	/**
	 * Constructeur
	 */
	public LoiProbabilite(int nbTirages) {
		this.nbTirages = nbTirages;
	}

	/**
	 * Permet d'instancier et d'initialiser le tableau des effectifs 
	 * Afin de mettre toutes les valeurs � z�ro
	 * @param nbLignes nombre de lignes du tableau
	 * @param nbColonnes nombre de colonnes du tableau
	 */
	private static void initialiserTableau(int nbLignes) {
		// Instanciation du tableau
		tableauEffectifs = new int[nbLignes][3];

		// Initialisation des valeurs
		for (int i = 0; i < nbLignes; i ++) {
			tableauEffectifs[i][0] = i+1;
			tableauEffectifs[i][1] = (int)(nbTirages / nbLignes);
			tableauEffectifs[i][2] = 0;
		}
	}

	public void afficherTableau() {
		for (int i = 0; i < tableauEffectifs.length; i ++) {
			for (int j = 0; j < tableauEffectifs[0].length; j ++) {
				System.out.print("\t" + tableauEffectifs[i][j] + "\t|");
			}
			System.out.println();
		}
	}

	/**
	 * Renvoie le tableau des effectifs
	 * @return le tableau des r�sultats comptabilis�s
	 */
	public int[][] getTableauEffectifs() {
		return tableauEffectifs;
	}

	/**
	 * Modifie le tableau des effectifs
	 * @param tableauEffectifs
	 */
	private void setTableauEffectifs() {
		// TODO
	}

	/**
	 * Loi uniforme g�n�rateur du syst�me (ensemble N)
	 * @param nbMax borne maximale de l'intervalle dans lequel la loi est d�finie
	 */
	public void loiUniforme(int nbMax) {
		/** Le r�sultat final */
		int result = 0;

		// Initialisation du tableau
		initialiserTableau(nbMax);

		// La fonction random() renvoie un nombre al�atoire entre 0 et nbMax non compris
		for (int i = 0; i < nbTirages; i ++) {
			result = (int)(Math.random() * nbMax + 1);
			tableauEffectifs[result - 1][2] ++;
		}

		afficherTableau();
	}

	/**
	 * Loi exponentielle - Loi de probabilit� : f(x) = lambda * exp(-lambda * x)
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi exponentielle apr�s tirage
	 */
	public double loiExponentielle(double lambda, int x) {
		/** Le r�sultat final */
		double result = 0.0;

		if (lambda < 0) {
			System.out.println("Impossible ! Le param�tre est n�gatif !");
			return result = -1;
		} else {
			return result = lambda * Math.exp(-lambda * x);
		}
	}

	/**
	 * Loi normale - Loi de probabilit� f(x) = 1 / (sigma * racine(2 * pi)) * exp((x - m�) / (2 * sigma�)) 
	 * @param m reel repr�sentant la moyenne de la fonction
	 * @param sigma reel positif repr�sentant l'�cart-type de la fonction
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi normale apr�s tirage
	 */
	public double loiNormale(double m, double sigma, int x) {
		/** Le r�sultat final */
		double result = 0.0;

		if (sigma < 0) {
			System.out.println("Impossible ! Le sigma est n�gatif !");
			return result = -1;
		} else if (x < 0) {
			System.out.println("Impossible ! Le x est n�gatif !");
			return result = -1;
		} else {
			return result = 1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.exp((x - Math.pow(m, 2)) / (2 * Math.pow(sigma, 2)));
		}            
	}

	/**
	 * Loi de Poisson - Loi de probabilit� : f(x) = exp(-lambda) * ((lambda^x)/(k!))
	 * @param lambda reel positif repr�sentant le param�tre de la loi exponentielle
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi exponentielle apr�s tirage
	 */
	public double loiPoisson(double lambda, int x) {
		/** Le r�sultat final */
		double result = 0.0;

		if (lambda < 0 ) {
			System.out.println("Impossible ! Le param�tre est n�gatif !");
			return result = -1;
		} else {
			return result = Math.exp(-lambda) * ((Math.pow(lambda, x)/Calcul.factorielle(x)));
		}
	}

	/**
	 * Loi de Weibull - Loi de probabilit� f(x) = (k / lambda) * (x / lambda)^(k-1) * exp(-x / lambda)^k 
	 * @param k reel positif repr�sentant le param�tre de forme
	 * @param lambda reel positif repr�sentant le param�tre d'�chelle de la distribution
	 * @param x variable al�atoire
	 * @return le r�sultat de la loi de Weibull apr�s tirage
	 */
	public double loiDeWeibull(double k, double lambda, int x) {
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
