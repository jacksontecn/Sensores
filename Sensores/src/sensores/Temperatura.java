package sensores;

/**
 * 
 * @author Jackson Elias de Souza
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados.
 * Atividade Contextualizada
 *
 */

/**
 * De forma crescente junto com Co2 e a umidade de forma decrescente
 */

public class Temperatura extends CasosHora {

	private int temperatura[][] = new int[48][2];
	private int coletorTemperatura[] = new int[48];
	private int coletorHora[] = new int[48];

	public int[][] getTemperatura() {
		return temperatura;
	}

	public int[] getColetorTemperatura() {
		return coletorTemperatura;

	}

	public int[] getColetorHora() {
		return coletorHora;
	}

	public void addTemperatura() {
		for (int i = 0; i < this.coletorTemperatura.length; i++) {

			this.temperatura[i][0] = this.coletorTemperatura[i];
			this.temperatura[i][1] = this.coletorHora[i];

		}

	}

	public void setColetorTemperatura(int[] aux) {
		for (int i = 0; i < aux.length; i++) {
			this.coletorTemperatura[i] = aux[i];
		}
	}

	public void setColetorHora(int[] aux1) {
		for (int i = 0; i < aux1.length; i++) {
			this.coletorHora[i] = aux1[i];
		}
	}

	public void bubbleSortCrescente() {
		boolean troca = true;
		int aux, aux1;
		while (troca) {
			troca = false;
			for (int i = 0; i < this.coletorTemperatura.length - 1; i++) {
				if (this.coletorTemperatura[i] > this.coletorTemperatura[i + 1]) {
					aux = this.coletorTemperatura[i];
					aux1 = this.coletorHora[i];
					this.coletorTemperatura[i] = this.coletorTemperatura[i + 1];
					this.coletorHora[i] = this.coletorHora[i + 1];
					this.coletorTemperatura[i + 1] = aux;
					this.coletorHora[i + 1] = aux1;
					troca = true;

				}
			}

		}

	}

	@Override
	public void imprimirResultado(String texto, String subTexto, int[][] matriz) {
		// TODO Auto-generated method stub
		super.imprimirResultado(texto, subTexto, matriz);
	}

}
