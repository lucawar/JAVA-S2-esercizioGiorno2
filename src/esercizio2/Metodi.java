package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Metodi {

	// METODO GENERAZIONE NUMERI CASUALI
	public static List<Integer> numeriCasuali(int n) {
		List<Integer> casualList = new ArrayList<>();
		Random rndm = new Random();

		for (int i = 0; i < n; i++) {
			int numeri = rndm.nextInt(101);
			casualList.add(numeri);
		}

		// ORDINA LA LISTA IN MODO CRESCENTE
		Collections.sort(casualList);
		return casualList;
	}

	// METODO LISTA ORDINE INVERSO
	public static List<Integer> listaInversaConc(List<Integer> lista) {
		List<Integer> listaInversa = new ArrayList<>(lista);
		// INVERTE ORDINE DEGLI ELEMENTI DELLA LISTA
		Collections.reverse(listaInversa);
		// CONCATENA ELEMENTI DELLA LISTA
		lista.addAll(listaInversa);
		return lista;
	}

	// METODO STAMPA POSIZIONI LISTA, SE È TRUE STAMPA ELEMENTI NELLE POSIZIONI PARI
	// ALTRIMENTI LI STAMPA NELLE POSIZIONI DISPARI
	public static void stampaPosizioneLista(List<Integer> lista, boolean stampaPosizioni) {
		for (int i = 0; i < lista.size(); i++) {
			if ((stampaPosizioni && i % 2 == 0) || (!stampaPosizioni && i % 2 != 0)) {
				System.out.println(lista.get(i));
			}
		}
	}
}
