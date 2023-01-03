package sensores;

/**
 * 
 * @author Jackson Elias de Souza
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados.
 * Atividade Contextualizada
 *
 */

public class CasosHora {

	private String resultado;

	public String convert(int teste) {

		switch (teste) {
		case 1:
			resultado = "00:00";
			break;
		case 2:
			resultado = "00:30";
			break;
		case 3:
			resultado = "01:00";
			break;
		case 4:
			resultado = "01:30";
			break;
		case 5:
			resultado = "02:00";
			break;
		case 6:
			resultado = "02:30";
			break;
		case 7:
			resultado = "03:00";
			break;
		case 8:
			resultado = "03:30";
			break;
		case 9:
			resultado = "04:00";
			break;
		case 10:
			resultado = "04:30";
			break;
		case 11:
			resultado = "05:00";
			break;
		case 12:
			resultado = "05:30";
			break;
		case 13:
			resultado = "06:00";
			break;
		case 14:
			resultado = "06:30";
			break;
		case 15:
			resultado = "07:00";
			break;
		case 16:
			resultado = "07:30";
			break;
		case 17:
			resultado = "08:00";
			break;
		case 18:
			resultado = "08:30";
			break;
		case 19:
			resultado = "09:00";
			break;
		case 20:
			resultado = "09:30";
			break;
		case 21:
			resultado = "10:00";
			break;
		case 22:
			resultado = "10:30";
			break;
		case 23:
			resultado = "11:00";
			break;
		case 24:
			resultado = "11:30";
			break;
		case 25:
			resultado = "12:00";
			break;
		case 26:
			resultado = "12:30";
			break;
		case 27:
			resultado = "13:00";
			break;
		case 28:
			resultado = "13:30";
			break;
		case 29:
			resultado = "14:00";
			break;
		case 30:
			resultado = "14:30";
			break;
		case 31:
			resultado = "15:00";
			break;
		case 32:
			resultado = "15:30";
			break;
		case 33:
			resultado = "16:00";
			break;
		case 34:
			resultado = "16:30";
			break;
		case 35:
			resultado = "17:00";
			break;
		case 36:
			resultado = "17:30";
			break;
		case 37:
			resultado = "18:00";
			break;
		case 38:
			resultado = "18:30";
			break;
		case 39:
			resultado = "19:00";
			break;
		case 40:
			resultado = "19:30";
			break;
		case 41:
			resultado = "20:00";
			break;
		case 42:
			resultado = "20:30";
			break;
		case 43:
			resultado = "21:00";
			break;
		case 44:
			resultado = "21:30";
			break;
		case 45:
			resultado = "22:00";
			break;
		case 46:
			resultado = "22:30";
			break;
		case 47:
			resultado = "23:00";
			break;
		case 48:
			resultado = "23:30";
			break;

		default:
			resultado = "hora invalida";
			break;

		}

		return resultado;

	}

	public void imprimirResultado(String texto, String subTexto, int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(texto + ": " + matriz[i][0] + " " + subTexto + ": " + convert(matriz[i][1]));
		}
	}
}