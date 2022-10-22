package uninter;
//Walace Arantes de Souza RU : 3918750

public class Dolar extends Moeda {

	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);

	}

	@Override
	public double converter() {
		return this.valor * 5.2;
	}

	@Override
	public boolean equals(Object obj) {
		Dolar outraMoeda = (Dolar) obj;
		return valor == outraMoeda.valor;
	}
}
