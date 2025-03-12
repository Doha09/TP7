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
public class TestTripletH {

    public static void main(String[] args) {

        TripletH<Integer, String, Double> triplet1 = new TripletH<>(10, "Hello", 3.14);
        System.out.print("Triplet 1 : ");
        triplet1.affiche();

        TripletH<Boolean, Integer, String> triplet2 = new TripletH<>(true, 42, "Générique");
        System.out.print("Triplet 2 : ");
        triplet2.affiche();
    }
}
