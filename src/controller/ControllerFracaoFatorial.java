package controller;

public class ControllerFracaoFatorial {

	public ControllerFracaoFatorial() {
		super();
	}

	public double Fracao (int N) {
		double soma = 0;
		if (N == 1) { // Quando valor for 1, retorna o primeiro valor da sequência, que é o próprio 1
			return 1;
		} else {
			soma = Fracao(N-1) + 1/(Fatorial(N)); /* A cada execução somar o resultado da posição anterior
			 com a divisão de 1 pelo faotrial do valor atual. Usei uma segunda recursiva para calcular os fatoriais*/
												
			return soma;
		}
	}
	
	public double Fatorial (int n) { // Recursiva para calcular fatorial
		if (n == 1) {
			return 1; // Quando valor == 1 retorna 1 para seguir com a sequência de multiplicações
		} else {
			double res = n * Fatorial(n-1); // ...3.2.1
			System.out.println(res);
			return res;
			
		}
	}
}
