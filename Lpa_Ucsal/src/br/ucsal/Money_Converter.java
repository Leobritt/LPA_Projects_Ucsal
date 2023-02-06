package br.ucsal;

public class Money_Converter {
	/*
	 * utiliza-se final para representar uma constante e nome de constante usa letra
	 * maisucula
	 */
	final static double CONV_EURO = 0.19, CONV_DOLAR = 0.21, CONV_IENE = 26.19;

	public static double realParaEuro(double real) {
		return real * CONV_EURO;
	}

	public static double euroParaReal(double euro) {
		return euro / CONV_EURO;
	}

	public static double realParaDolar(double real) {
		return real * CONV_DOLAR;
	}

	public static double dolarParaReal(double dolar) {
		return dolar / CONV_DOLAR;
	}

	public static double euroParaDolar(double euro) {
		double real = euroParaReal(euro);
		return realParaDolar(real);
	}

	public static double dolarParaEuro(double dolar) {
		double real = dolarParaReal(dolar);
		return realParaDolar(real);
	}
	public static double realParaIene(double real) {
		return real*CONV_IENE;
	}
	public static double ieneParaReal(double iene) {
		return iene/CONV_IENE;
	}
	public static double euroParaIene(double euro) {
		double real = euroParaReal(euro);
		return realParaIene(real);
	}
	public static double ieneParaEuro(double iene) {
		double real = ieneParaReal(iene);
		return realParaEuro(real);
	}

	public static double dolarParaIene(double dolar) {
		double real = dolarParaReal(dolar);
		return realParaIene(real);
	}
	public static double ieneParaDolar(double iene) {
		double real = ieneParaReal(iene);
		return realParaDolar(real);
	}

}
