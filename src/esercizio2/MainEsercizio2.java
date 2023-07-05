package esercizio2;

import java.util.List;
import java.util.Scanner;

public class MainEsercizio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci quanti numeri interi casuali vuoi generare:");
		int n = Integer.parseInt(input.nextLine());

		List<Integer> casualList = Metodi.numeriCasuali(n);
		System.out.println("Lista numeri casuali generata: " + casualList);

		List<Integer> concatenaList = Metodi.listaInversaConc(casualList);
		System.out.println("Lista concatenata e invertita: " + concatenaList);

		System.out.println("Stampa delle posizioni pari:");
		Metodi.stampaPosizioneLista(concatenaList, true);

		System.out.println("Stampa delle posizioni dispari:");
		Metodi.stampaPosizioneLista(concatenaList, false);

		input.close();
	}
}
