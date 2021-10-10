
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public boolean saca(double valor) {
		double Valorsaque = valor + 0.2;
		return super.saca(Valorsaque);
	}
	
	
}
