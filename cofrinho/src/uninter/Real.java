package uninter;
//Walace Arantes de Souza RU : 3918750

public class Real extends Moeda {

	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);

	}

	@Override
	public double converter() {
		return this.valor;

	}

	@Override
	public boolean equals(Object obj) {
		Real outraMoeda = (Real) obj;
		return valor == outraMoeda.valor;
	}
}
