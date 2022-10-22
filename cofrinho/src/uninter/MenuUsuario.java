package uninter;

import java.util.Scanner;

public class MenuUsuario {
	
	private Scanner sc; 
	
	public MenuUsuario () {
		sc = new Scanner(System.in);
}

	public void exibirMenuPrincipal ( ) {
	    System.out.println ( " COFRINHO : " ) ;
	    System.out.println ( " 1 - Adicionar moeda " ) ;
	    System.out.println ( " 2 - Remover moeda " ) ;
	    System.out.println ( " 3 - Listar moedas " ) ;
	    System.out.println ( " 4 - Calcular valor total convertido para real " ) ;
	    System.out.println ( " 0 - Encerrar " ) ;
	    
	    String opcaoSelecionada = sc.next ( ) ;
	    
	    System.out.println(opcaoSelecionada);
	    
	    switch (opcaoSelecionada) {
		case "0":
			System.out.println("Programa Encerrado!");
			break;
		default:
			System.out.println("Opão Inválida!");
			exibirMenuPrincipal();
			break;
		
		}
}
}