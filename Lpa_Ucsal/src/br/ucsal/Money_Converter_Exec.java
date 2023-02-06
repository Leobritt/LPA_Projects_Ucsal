package br.ucsal;

import java.util.*;

public class Money_Converter_Exec {
	public static void main(String[] args) {
		double valorMonetario = obterValor();
		int escolhaUser = escolhaDaOperacao();
		double resultado = executarOperacao(valorMonetario, escolhaUser);
		Impressao.imprimir(resultado);

	}

	public static double obterValor() {
		Scanner input = new Scanner(System.in);
		Impressao.imprimir("Usuário, informe o valor que deseja converter: ");
		double valorInput = input.nextDouble();
		return valorInput;
	}

	public static int escolhaDaOperacao() {
		Scanner input = new Scanner(System.in);
		Impressao.imprimir("Usuário, informe a conversão que deseja:\n" + "01) real para euro\n"
				+ "02) euro para real\n" + "03) real para dolar\n" + "04) dolar para real\n" + "05) euro para dolar\n"
				+ "06) dolar para euro\n" + "07) real para Iene\n" + "08) Iene para real\n" + "09) euro para Iene\n"
				+ "10) Iene para euro\n" + "11) dolar para Iene\n" + "12) Iene para dolar ");
		int escolhaInput = input.nextInt();
		return escolhaInput;
	}

	public static double executarOperacao(double valor, int escolha) {
		double result = 0;
		switch (escolha) {
		case 1:
			result = Money_Converter.realParaEuro(valor);
			break;
		case 2:
			result = Money_Converter.euroParaReal(valor);
			break;
		case 3:
			result = Money_Converter.realParaDolar(valor);
			break;
		case 4:
			result = Money_Converter.dolarParaReal(valor);
			break;
		case 5:
			result = Money_Converter.euroParaDolar(valor);
			break;
		case 6:
			result = Money_Converter.dolarParaEuro(valor);
			break;
		case 7:
			result = Money_Converter.realParaIene(valor);
			break;
		case 8:
			result = Money_Converter.ieneParaReal(valor);
			break;
		case 9:
			result = Money_Converter.euroParaIene(valor);
			break;
		case 10:
			result = Money_Converter.ieneParaEuro(valor);
			break;
		case 11:
			result = Money_Converter.dolarParaIene(valor);
			break;
		case 12:
			result = Money_Converter.ieneParaDolar(valor);
			break;
		default:
			break;
		}
		return result;
	}

}
