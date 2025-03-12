/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saisiecorrecte;

/**
 *
 * @author ouahm
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieCorrecte {

    public static int saisieCorrecte() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Entrez un entier supérieur à 10 : ");
                nombre = scanner.nextInt();

                if (nombre <= 10) {
                    throw new IllegalArgumentException("Erreur : L'entier doit être strictement supérieur à 10 !");
                }

                saisieValide = true;

            } catch (InputMismatchException e) {
                System.out.println("Erreur : Vous devez entrer un nombre entier valide.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }

    public static void main(String[] args) {
        int valeur = saisieCorrecte();
        System.out.println("Vous avez saisi : " + valeur);
    }
}
