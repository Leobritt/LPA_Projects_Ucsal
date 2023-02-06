package br.ucsal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double n1, n2;
		int escolha;
		n1 = obterValor();
		imp(n1);

		n2 = obterValor();
		imp(n2);

		escolha = obterEscolha();
		imp(escolha);

		executarOperacao(n1, n2, escolha);
	}

	/* método para executar a op escolhida */
	public static void executarOperacao(double n1, double n2, int op) {
		double resultado;

		switch (op) {
		case 1:
			resultado = soma(n1, n2);
			break;
		case 2:
			resultado = sub(n1, n2);
			break;
		case 3:
			resultado = multi(n1, n2);
			break;
		case 4:
			resultado = div(n1, n2);
			break;
		default:
			resultado = 0;
			System.out.println("Operação inválidas");
			break;
		}

		imp(resultado);

	}

	/* método para obter um input de escolha da operação */
	public static int obterEscolha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Usuario, escolha uma operação:" + "\n(1)Somar" + "\n(2)Subtrair" + "\n(3)Multiplicar"
				+ "\n(4)Dividir");
		return sc.nextInt();
	}

	/* método para obter input */
	public static double obterValor() {
		Scanner input = new Scanner(System.in);
		double valor;
		System.out.println("Informe dois valores e escolha a operação desejada");
		valor = input.nextDouble();

		return valor;
	}

	/* método p imprimir um double */
	public static void imp(double valor) {
		System.out.println(valor);
	}

	/* método para imprimir um int */
	public static void imp(int valor) {
		System.out.println(valor);
	}

	/* método para imprimir uma string */
	public static void imp(String valor) {
		System.out.println(valor);
	}

	/* método soma */
	public static double soma(double n1, double n2) {
		return n1 + n2;

	}

	/* método sub */
	public static double sub(double n1, double n2) {
		return n1 - n2;

	}

	/* método da multiplicação */
	public static double multi(double n1, double n2) {
		return n1 * n2;
	}

	/* método da divsão */
	public static double div(double n1, double n2) {
		return n1 / n2;

	}

}
