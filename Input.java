/*
 * Main
 *
 * Problem#1
 *
 * 16.10.2018
 */

import java.util.Scanner;


public class Input {
	public static void main(String[] args) {
		System.out.println("Enter weight of dinosaur (in kilograms)");
		Scanner in = new Scanner (System.in);
		float weight = in.nextInt();
		Main w1 = new Main();
		Main w2 = new Main();
		Main w3 = new Main();
		float weight_gr = w1.transInGr(weight);
		System.out.println("Weight of dinousaur is " + weight_gr + " gr");
		float weight_ml = w2.transInMl(weight);
		System.out.println("Weight of dinousaur is " + weight_ml + " ml");
		float weight_t = w3.transInT(weight);
		System.out.println("Weight of dinousaur is " + weight_t + " t");
	}
}

