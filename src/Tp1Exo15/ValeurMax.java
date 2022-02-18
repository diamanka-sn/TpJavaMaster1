package Tp1Exo15;

public class ValeurMax {

	public static void main(String[] args) {
		int[] tab = { 2, 3, 67, 8, 9, 0, 100, 653, 2, 4 };
		int max =0;
		int min = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max)
				max = tab[i];
		}
		System.out.println(max);
	}

}
