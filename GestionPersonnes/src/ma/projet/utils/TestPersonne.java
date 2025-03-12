/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.utils;

import java.util.ArrayList;
import java.util.List;
import ma.projet.Personne;
import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

/**
 *
 * @author ouahm
 */
public class TestPersonne {

    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>();

        personnes.add(new Developpeur(1, "Ouahmane", "Doha", 3000, "Java"));

        personnes.add(new Manager(2, "Ouahamne", "Kaoutar", 4000, "Informatique"));

        System.out.println("Liste des personnes :");
        PersonneUtils.afficherListePersonnes(personnes);
    }
}
