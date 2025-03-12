/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generiques;

/**
 *
 * @author ouahm
 */
public class TestTriplet {

    public static void main(String[] args) {

        Triplet<Integer> tripletInt = new Triplet<>(1, 2, 3);
        System.out.print("Triplet d'entiers : ");
        tripletInt.affiche();

        Triplet<String> tripletStr = new Triplet<>("A", "B", "C");
        System.out.print("Triplet de chaînes : ");
        tripletStr.affiche();

        Triplet<Double> tripletDouble = new Triplet<>(1.5, 2.5, 3.5);
        System.out.print("Triplet de nombres décimaux : ");
        tripletDouble.affiche();
    }
}
