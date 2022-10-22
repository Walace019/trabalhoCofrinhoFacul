package uninter;
//Walace Arantes de Souza RU : 3918750

public class Euro extends Moeda {

	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);

	}

	@Override
	public double converter() {
		return this.valor * 5.09;
	}

	@Override
	public boolean equals(Object obj) {
		Euro outraMoeda = (Euro) obj;
		return valor == outraMoeda.valor;
	}
}
