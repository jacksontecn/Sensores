package sensores;

/**
 * 
 * @author Jackson Elias de Souza
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados.
 * Atividade Contextualizada
 *
 */


public class Co2 extends CasosHora{

	private int[][] co2 = new int[48][2];
	private int coletorCo2[] = new int[48];
	private int coletorHora[] = new int[48];

	public int[][] getCo2() {
		return co2;
	}

	public int[] getColetorCo2() {
		return coletorCo2;

	}

	public int[] getColetorHora() {
		return coletorHora;
	}

	public void addCo2() {
		for (int i = 0; i < this.coletorCo2.length; i++) {

			this.co2[i][0] = this.coletorCo2[i];
			this.co2[i][1] = this.coletorHora[i];

		}

	}

	public void setColetorCo2(int[] x) {
		for (int i = 0; i < x.length; i++) {
			this.coletorCo2[i] = x[i];
		}
	}

	public void setColetorHora(int[] y) {
		for (int i = 0; i < y.length; i++) {
			this.coletorHora[i] = y[i];
		}
	}

	public void bubbleSortCrescente() {
		boolean troca = true;
		int aux, aux1;
		while (troca) {
			troca = false;
			for (int i = 0; i < this.coletorCo2.length - 1; i++) {
				if (this.coletorCo2[i] > this.coletorCo2[i + 1]) {
					aux = this.coletorCo2[i];
					aux1 = this.coletorHora[i];
					this.coletorCo2[i] = this.coletorCo2[i + 1];
					this.coletorHora[i] = this.coletorHora[i + 1];
					this.coletorCo2[i + 1] = aux;
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
