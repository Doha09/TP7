/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ouahm
 */
public class FibonacciMain {

    public static int fibonacci(int n) throws FibonacciException {
        if (n <= 0) {
            throw new FibonacciException("Le nombre doit être supérieur à 0 !");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Entrez un entier strictement positif pour la suite de Fibonacci : ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Erreur : Veuillez entrer un nombre entier !");
                    scanner.next();
                    continue;
                }

                n = scanner.nextInt();

                if (n <= 0) {
                    throw new FibonacciException("Erreur : Vous devez entrer un entier strictement positif !");
                }

                saisieValide = true;

            } catch (FibonacciException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            System.out.println("Calcul en cours...");
            int resultat = fibonacci(n);
            System.out.println("Le " + n + "ème nombre de Fibonacci est : " + resultat);
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }
    }

}
