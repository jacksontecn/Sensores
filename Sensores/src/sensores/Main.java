package sensores;

/**
 * 
 * @author Jackson Elias de Souza
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados.
 * Atividade Contextualizada
 *
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Coletando a Temperatura
		 * Imprimindo dados Coletado de Temperatura
		 */

		Temperatura teste1 = new Temperatura();

		int[] escrever = new int[48];
		int[] escrever2 = new int[48];
		int cont = 0;

		for (int i = 0; i < escrever2.length; i++) {
			cont += 1;
			escrever[i] = (int) (Math.random() * 100);
			escrever2[i] = cont;
		}
		System.out.println("Dados da Temperatura.\n");

		teste1.setColetorTemperatura(escrever);
		teste1.setColetorHora(escrever2);
		teste1.bubbleSortCrescente();
		teste1.addTemperatura();		
		teste1.imprimirResultado("Temperatura: ", "Hora: ", teste1.getTemperatura());
		
		Co2 teste2 = new Co2();

		int[] escrever1 = new int[48];
		int[] escrever3 = new int[48];	
		int cont1 = 0;

		for (int i = 0; i < escrever3.length; i++) {
			cont1 += 1;
			escrever1[i] = (int) (Math.random() * 300);
			escrever3[i] = cont1;
		}
		System.out.println("\nDados da Co2.\n");

		teste2.setColetorCo2(escrever1);
		teste2.setColetorHora(escrever3);
		teste2.bubbleSortCrescente();
		teste2.addCo2();;		
		teste2.imprimirResultado("Qtd Co2: ", "Hora: ", teste2.getCo2());
		
		Umidade teste3 = new Umidade();

		int[] escrever4 = new int[48];
		int[] escrever6= new int[48];	
		int cont2 = 0;

		for (int i = 0; i < escrever4.length; i++) {
			cont2 += 1;
			escrever4[i] = (int) (Math.random() * 100);
			escrever6[i] = cont2;
		}
		System.out.println("\nDados da Umidade.\n");

		teste3.setColetorUmidade(escrever4);
		teste3.setColetorHora(escrever6);
		teste3.bubbleSortDecrescente();
		teste3.addUmidade();		
		teste3.imprimirResultado("Umidade: ", "Hora", teste3.getUmidade());

	}

}
