package br.ucsal;

import java.util.Scanner;

public class Converter_Tem_Exec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperatura = obterDados();
		int escolha = obterEscolha();
		double result = executarOperacao(temperatura, escolha);
		Impressao.imprimir(result);
	}

	public static double obterDados() {
		double valorInput;
		Scanner input = new Scanner(System.in);
		Impressao.imprimir("Usuário, informe o valor: ");
		valorInput = input.nextDouble();
		return valorInput;
	}

	public static int obterEscolha() {
		int escolhaInput;
		Scanner input = new Scanner(System.in);
		Impressao.imprimir("Usuário, escolha detro das opções qual deseja para converter: "
				+ "\n(1) De Celsius para Fahrenheit: \n" + "(2) De Celsius para Kelvin: \n"
				+ "(3) De Fahrenheit para Celsius: \n" + "(4) De Fahrenheit para Kelvin: \n"
				+ "(5) De Kelvin para Celsius: \n" + "(6) De Kelvin para Fahrenheit: ");
		escolhaInput = input.nextInt();
		return escolhaInput;
	}

	public static double executarOperacao(double temp, int op) {
		double resultadoConvert = 0;
		switch (op) {
		case 1:
			resultadoConvert = Converter_Temp.CelsiusparaFahrenheit(temp);
			break;
		case 2:
			resultadoConvert = Converter_Temp.CelsiusparaKelvin(temp);

			break;
		case 3:
			resultadoConvert = Converter_Temp.FahrenheitparaCelsius(temp);

			break;
		case 4:
			resultadoConvert = Converter_Temp.FahrenheitparaKelvin(temp);

			break;
		case 5:
			resultadoConvert = Converter_Temp.KelvinparaCelsius(temp);
			break;
		case 6:
			resultadoConvert = Converter_Temp.KelvinparaFahrenheit(temp);

			break;
		default:
			break;
		}
		return resultadoConvert;
	}

}
