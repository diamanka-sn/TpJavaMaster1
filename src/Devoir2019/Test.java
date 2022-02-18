package Devoir2019;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1, r2, i1, i2;

		System.out.println("Nombre Complexe 1");
		System.out.print("Donner la partie reelle");
		r1 = sc.nextInt();
		System.out.print("Donner la partie imaginaire");
		i1 = sc.nextInt();
		
		Complexe Z = new Complexe(r1, i1);
		System.out.println("Nombre complexe 1: "+Z);
		//System.out.println(Z);
		
		System.out.println("Nombre Complexe 2");
		System.out.print("Donner la partie reelle");
		r2 = sc.nextInt();
		System.out.print("Donner la partie imaginaire");
		i2 = sc.nextInt();
		
		Complexe Z1 = new Complexe(r2, i2);
		
		System.out.println("La somme");
		System.out.println(Z.plus(Z1));
		
		System.out.println("La soustraction");
		System.out.println(Z.moins(Z1));

	}

}
