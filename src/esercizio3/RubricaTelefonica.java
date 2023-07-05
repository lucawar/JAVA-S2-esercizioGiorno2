package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

	private Map<String, String> contatti;

	public RubricaTelefonica() {
		contatti = new HashMap<>();
	}

	public void inserisciContatto(String nome, String numeroTelefono) {
		contatti.put(nome, numeroTelefono);
	}

	public void cancellaContatto(String nome) {
		contatti.remove(nome);
	}

	public String ricercaNome(String numeroTelefono) {
		for (Map.Entry<String, String> entry : contatti.entrySet()) {
			if (entry.getValue().equals(numeroTelefono)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public String ricercaNumero(String nome) {
		return contatti.get(nome);
	}

	public void stampaContatti() {
		for (Map.Entry<String, String> entry : contatti.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Numero di telefono: " + entry.getValue());
		}
	}
}
