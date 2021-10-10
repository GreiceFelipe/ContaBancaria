
public class CalculadoraDeImpostos {
	private double totalImpostos;
	
	public void resgistra(Tributavel t) {
		this.totalImpostos += t.getValorImposto();
	}

	public double getTotalImpostos() {
		return totalImpostos;
	}
	

}
