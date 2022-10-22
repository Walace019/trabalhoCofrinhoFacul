package uninter;
//Walace Arantes de Souza RU : 3918750

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas;

	public Cofrinho() { // Inicio
		this.listaMoedas = new ArrayList<>();
	}// Fim

	// Essa linha faz o código adicionar moedas no cofrinho
	public void adicionar(Moeda i) { // inicio adicionar
		listaMoedas.add(i);
	} // fim adicionar

	public void removerMoeda(Moeda i) {
		listaMoedas.remove(i);

	}

	// Esse método lista as moedas dentro do cofrinho
	public void listagemMoedas() {
		// Inicio listagemMoedas
		// Caso não tenha uma moeda no cofrinho, aparece a mensagem abaixo
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}

		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	} // Fim listagemMoedas

	// Essa linha converte as moedas para valor Real
	public double totalConvertido() { // inicio totalConvertido
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		double valorAcumulado = 0;

		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		return valorAcumulado;
	} // fim totalConvertido

}
