package entities;

public class Metod {

	private int contvideos;
	private double price;
	
	public Metod(int contvideos, double price) {
		this.contvideos = contvideos;
		this.price = price;
	}
	
	public double faturamento() { 
		double aux = contvideos / 3;
		double fatumes = aux * price;
		return fatumes * 12;
	}
	public double atraso() {
		double aux = contvideos * 10 / 100;
		double atraso = aux * price;
		return atraso;
	}
	public int reposicao() {
		int aux = contvideos - contvideos * 2 / 100;
		return aux + (aux * 10 / 100);
	}
	
	public String toString() {
		return "Faturamento: $"
				+ String.format("%.2f%n", faturamento())
				+ "Ganho em multas: $"
				+ String.format("%.2f%n", atraso())
				+ "Quantidade fim do ano: "
				+ reposicao();
	}
}
