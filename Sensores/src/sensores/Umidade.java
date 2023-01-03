package sensores;

/**
 * 
 * @author Jackson Elias de Souza
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados.
 * Atividade Contextualizada
 *
 */

public class Umidade extends CasosHora{

	private int[][] umidade = new int[48][2];
	private int coletorUmidade[] = new int[48];
	private int coletorHora[] = new int[48];

	public int[][] getUmidade() {
		return umidade;
	}

	public int[] getColetorUmidade() {
		return coletorUmidade;

	}

	public int[] getColetorHora() {
		return coletorHora;
	}

	public void addUmidade() {
		for (int i = 0; i < this.coletorUmidade.length; i++) {

			this.umidade[i][0] = this.coletorUmidade[i];
			this.umidade[i][1] = this.coletorHora[i];
			
		}

	}

	public void setColetorUmidade(int[] aux) {
		for (int i = 0; i < aux.length; i++) {
			this.coletorUmidade[i] = aux[i];
		}
	}

	public void setColetorHora(int[] aux1) {
		for (int i = 0; i < aux1.length; i++) {
			this.coletorHora[i] = aux1[i];
		}
	}

	public void bubbleSortDecrescente() {
		boolean troca = true;
		int aux, aux1;
		while (troca) {
			troca = false;
			for (int i = 0; i < this.coletorUmidade.length - 1; i++) {
				if (this.coletorUmidade[i] < this.coletorUmidade[i + 1]) {
					aux = this.coletorUmidade[i];
					aux1 = this.coletorHora[i];
					this.coletorUmidade[i] = this.coletorUmidade[i + 1];
					this.coletorHora[i] = this.coletorHora[i + 1];
					this.coletorUmidade[i + 1] = aux;
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
