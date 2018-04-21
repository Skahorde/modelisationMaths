/*
 * Calcul.java                                          20 avr. 2018
 * 3IL2 2017-2018 groupe B, ni copyright ni copyleft
 */
package iiiL.fr.functions;

/**
 * TODO commenter les responsabilités de la classe
 * @author Sandrine FOCK-CHOW-THO & Emmanuel PEREZ
 *
 */
public class Calcul {

    /**
     * Calcul de la factorielle par la méthode itérative
     * @param nombre Le nombre dont on veut calculer la factorielle
     * @return Le résultat de la factorielle
     */
    public static int factorielle(int nombre) {
        /** Le résultat final */
        int result = 1;
        
        for (; nombre > 0; nombre --) {
            result *= nombre;
        }
        return result;
    }
}
