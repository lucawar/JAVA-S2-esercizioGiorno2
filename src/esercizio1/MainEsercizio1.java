package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEsercizio1 {

	public static void main(String[] args) {

		// CREAZIONE OGGETTI "Set" CON IMPLEMENTAZIONE "HashSet"
		// MEMORIZZA LE PAROLE INSERITE
		Set<String> parole = new HashSet<>();
		// MEMORIZZA LE PAROLE DUPLICATE
		Set<String> paroleDuplicate = new HashSet<>();

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il numero di parole da inserire:");
		int n = Integer.parseInt(input.nextLine());

		// CICLO FOR ESEGUITO "n" VOLTE PER RICHIEDERE ALL'UTENTE DI INSERIRE IL NUMERO
		// DI PAROLE CHE ANDRANNO INSERITE
		// AD OGNI ITERAZIONE VIENE CHIESTO ALL'UTENTE DI INSERIRE UNA PAROLA
		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci la parola " + (i + 1) + ":");
			String parola = input.nextLine();
			// CONDIZIONE IN BASE ALLA QUALE SE LA PAROLA INSERITA è GIA PRESENTE NEL "Set"
			// "parole", VIENE INSERITA NEL "Set" "ParoleDupilcate"
			if (!parole.add(parola)) {
				paroleDuplicate.add(parola);
			}
		}

		System.out.println("Parole duplicate:");
		// CICLO FOR-EACH PER STAMPARE LA LISTA DELLE PAROLE DUPLICATE
		for (String parola : paroleDuplicate) {
			System.out.println(parola);
		}

		// METODO "Size()", PER STAMPARE IL NUMERO DI ELEMENTI NEL "Set"
		System.out.println("Numero di parole distinte: " + parole.size());

		System.out.println("Elenco parole distinte:");
		// CICLO FOR-EACH PER STAMPARE LA LISTA DELLE PAROLE
		for (String parola : parole) {
			System.out.println(parola);
		}

		input.close();

	}

}
