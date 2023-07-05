package esercizio3;

import java.util.Scanner;

public class MainEsercizio3 {

	public static void main(String[] args) {

		RubricaTelefonica rubrica = new RubricaTelefonica();
		Scanner input = new Scanner(System.in);

		boolean continua = true;
		while (continua) {
			System.out.println("Seleziona un'opzione:");
			System.out.println("1. Inserisci contatto");
			System.out.println("2. Cancella contatto");
			System.out.println("3. Ricerca nome per numero di telefono");
			System.out.println("4. Ricerca numero di telefono per nome");
			System.out.println("5. Stampa tutti i contatti");
			System.out.println("6. Esci");

			int scelta = input.nextInt();
			input.nextLine();

			switch (scelta) {
			case 1:
				System.out.print("Inserisci il nome: ");
				String nome = input.nextLine();
				System.out.print("Inserisci il numero di telefono: ");
				String numeroTelefono = input.nextLine();
				rubrica.inserisciContatto(nome, numeroTelefono);
				System.out.println("Contatto inserito con successo.");
				break;
			case 2:
				System.out.print("Inserisci il nome del contatto da cancellare: ");
				nome = input.nextLine();
				rubrica.cancellaContatto(nome);
				System.out.println("Contatto cancellato con successo.");
				break;
			case 3:
				System.out.print("Inserisci il numero di telefono da cercare: ");
				numeroTelefono = input.nextLine();
				String nomeTrovato = rubrica.ricercaNome(numeroTelefono);
				if (nomeTrovato != null) {
					System.out.println(
							"Il nome associato al numero di telefono " + numeroTelefono + " è: " + nomeTrovato);
				} else {
					System.out.println("Numero di telefono non trovato nella rubrica.");
				}
				break;
			case 4:
				System.out.print("Inserisci il nome da cercare: ");
				nome = input.nextLine();
				String numeroTrovato = rubrica.ricercaNumero(nome);
				if (numeroTrovato != null) {
					System.out.println("Il numero di telefono associato al nome " + nome + " è: " + numeroTrovato);
				} else {
					System.out.println("Nome non trovato nella rubrica.");
				}
				break;
			case 5:
				System.out.println("Lista dei contatti:");
				rubrica.stampaContatti();
				break;
			case 6:
				continua = false;
				break;
			default:
				System.out.println("Opzione non valida.");
			}
			System.out.println();
		}
		input.close();
	}
}