package controller;

public class ContadorVetor {
	public ContadorVetor() {
		super();
	}
	public void contaVetor1000() {
		int vetor[] = new int[1000];
		double tempoInicial = System.nanoTime();
		for (int i=0; i<1000; i++) {
			vetor[i] = i;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		System.out.println("Vetor 1000 posições ==> " + tempoTotal +"ns");
		//tempoTotal nS - 10^9s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(" ou seja, em " + tempoTotal + "s");
	}
	public void contaVetor10000() {
		int vetor[] = new int[10000];
		double tempoInicial = System.nanoTime();
		for (int i=0; i<10000; i++) {
			vetor[i] = i;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		System.out.println("Vetor 10000 posições ==> " + tempoTotal +"ns");
		//tempoTotal nS - 10^9s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(" ou seja, em " + tempoTotal + "s");
	}	

	public void contaVetor100000() {
		int vetor[] = new int[100000];
		double tempoInicial = System.nanoTime();
		for (int i=0; i<100000; i++) {
			vetor[i] = i;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		System.out.println("Vetor 100000 posições ==> " + tempoTotal +"ns");
		//tempoTotal nS - 10^9s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println(" ou seja, em " + tempoTotal + "s");
	}	
}