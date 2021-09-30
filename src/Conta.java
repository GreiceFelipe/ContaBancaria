
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("O numero da conta criada é: " + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		boolean retirada = this.retira(valor);
		
		if (retirada) {
			System.out.println("Saque realizado com sucesso!");	
			
		} else {
			System.out.println("Valor deve ser menor do que o saldo para realizar o saque");
			
		}
		
		return retirada;
	}
	
	public boolean transfere(double valor, Conta destino) {
		boolean retirada = this.retira(valor);
		if(retirada) {
			destino.deposita(valor);
			System.out.println("Transferencia realizado com sucesso!");
		} else {
			System.out.println("Valor deve ser menor do que o saldo para realizar a transferencia");
			
		}
		
		return retirada;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Agencia deve ser maior que 0.");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Numero da conta deve ser maior que 0.");
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	private boolean retira(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
}
