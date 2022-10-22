package uninter;
//Walace Arantes de Souza RU : 3918750

import java.util.Scanner;

public class Menu {
	private Scanner sc;
	private Cofrinho cofrinho;

	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void exibirMenuPrincipal() { // Inicio do método Menu Principal
		// Esse Sysout mostra ao usuário a mensagem e opções de escolha
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moeda");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");

		String opcaoSelecionada = sc.next();
		switch (opcaoSelecionada) {
		// Criei esse Case para executar as ações conforme o usuário escolher
		// Case 0 Encerra o programa
		case "0":
			System.out.println("Sistema finalizado!");
			break;
		// Case 1 Adiciona a moeda desejada
		case "1":
			exibirSubMenuAdicionarMoedas();
			exibirMenuPrincipal();
			break;
		// Case 2 remove a moeda escolhida
		case "2":
			exibirSubMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
		// Case 3 - Lista as moedas Escolhidas anteriormente
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
		// case 4 converte todas as moedas para o valor em reais
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
			valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".", ",");
			System.out.println("o Valor total convertido para Real é de : " + valorTotalConvertido);
			exibirMenuPrincipal();
			break;
		// Caso o usuario digite qualquer coisa fora das opções aparece essa mensagem
		// abaixo
		default:
			System.out.println("Opção Inválida! ");
			exibirMenuPrincipal();
			break;

		}
	}

	// Esse Sub Menu Adiciona as moedas
	private void exibirSubMenuAdicionarMoedas() {
		// Aparece ao usuario essas opções abaixo
		System.out.println("Escolha Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		// O Scanner pega a opção escolhida
		int opcaoMoeda = sc.nextInt();
		// O Usuario digita o valor
		System.out.println("Digite o valor: ");

		String valorTextualMoeda = sc.next();
		// Usei o replace para caso o usuario digite o valor com , ser transformado em .
		valorTextualMoeda = valorTextualMoeda.replace(",", ".");
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		// Apresenta o valor da moeda ao usuario
		System.out.println("O Valor da moeda é : " + valorTextualMoeda);

		Moeda moeda = null;
		// Estrutura condicional if , else if para decidir o que cada case vai fazer
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Essa moeda não existe! ");
			exibirMenuPrincipal();
		}
		cofrinho.adicionar(moeda);
		System.out.println("Ação realizada com sucesso! ");
	} // Fim do Sub Menu Para Adicionar as Moedas

	// Esse SubMenu existe para criar o método remover moedas
	private void exibirSubMenuRemoverMoedas() { // Inicia o método remover moedas
		// Aparece ao usuario essas opções abaixo

		System.out.println("Escolha Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		// Scanner opçãoMoeda do usuario
		int opcaoMoeda = sc.nextInt();
		// Sysout para o usuario digitar o valor
		System.out.println("Digite o valor: ");

		String valorTextualMoeda = sc.next();
		// Usei o replace para caso o usuario digite o valor com , ser transformado em .
		valorTextualMoeda = valorTextualMoeda.replace(",", ".");
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		// Mostra o valor das modas ao usuario
		System.out.println("O Valor da moeda é : " + valorTextualMoeda);

		Moeda moeda = null;
		// Estrutura condicional if , else if para decidir o que cada case vai fazer
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			//// Caso o usuario digite qualquer coisa fora das opções aparece essa mensagem
			// abaixo
			System.out.println("Essa moeda não existe! ");
			exibirMenuPrincipal();
		}
		cofrinho.removerMoeda(moeda);
		System.out.println("Ação realizada com sucesso! ");
	} // Aqui encerra o método Remover Moedas
}
