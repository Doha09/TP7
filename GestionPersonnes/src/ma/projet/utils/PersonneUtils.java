/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.utils;

import java.util.List;
import ma.projet.Personne;

/**
 *
 * @author ouahm
 */
public class PersonneUtils {

    public static void afficherListePersonnes(List<? extends Personne> liste) {
        for (Personne p : liste) {
            System.out.println(p.affiche());
        }
    }
}
