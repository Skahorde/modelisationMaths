package iiiL.fr.functions;

public class Calcul {
	/**
	 * Calcule la factorielle d'un nombre entier
	 * @param x le nombre dont il faut calculer la factorielle
	 * @return le résultat
	 */
	public static int factorielle(int x) {
		/** Le résultat final */
		int result = 1;
		
		// On additionne chaque entier allant de x à 1
		for (; x > 0; x --) {
			result *= x;
		}
		
		return result;
	}
}
