package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadoraDeImpostos;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(100);
		
		SeguroDeVida s = new SeguroDeVida();
		
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		calc.resgistra(s);
		calc.resgistra(cc);
		
		System.out.println(calc.getTotalImpostos());

	}

}
