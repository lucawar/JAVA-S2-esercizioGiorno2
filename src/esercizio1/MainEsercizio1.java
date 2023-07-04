package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEsercizio1 {

	public static void main(String[] args) {

		Set<String> parole = new HashSet<>();
		Set<String> paroleDuplicate = new HashSet<>();

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il numero di parole da inserire:");
		int n = Integer.parseInt(input.nextLine());
		input.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci la parola " + (i + 1) + ":");
			String parola = input.nextLine();

			if (!parole.add(parola)) {
				paroleDuplicate.add(parola);
			}
		}

		System.out.println("Parole duplicate:");
		for (String parola : paroleDuplicate) {
			System.out.println(parola);
		}

		System.out.println("Numero di parole distinte: " + parole.size());

		System.out.println("Elenco parole distinte:");
		for (String parola : parole) {
			System.out.println(parola);
		}

		input.close();

	}

}
