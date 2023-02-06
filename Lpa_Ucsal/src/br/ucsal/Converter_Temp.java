package br.ucsal;

public class Converter_Temp {
	public static double CelsiusparaKelvin(double temp) {
		return temp + 273;
	}

	public static double KelvinparaCelsius(double temp) {
		return (273 - temp) * -1;
	}

	public static double CelsiusparaFahrenheit(double temp) {
		return 1.8 * temp + 32;
	}

	public static double FahrenheitparaCelsius(double temp) {
		return (temp - 32) / 1.8;
	}

	public static double KelvinparaFahrenheit(double temp) {
		return (temp - 273) * 1.8 + 32;
	}

	public static double FahrenheitparaKelvin(double temp) {
		return (temp - 32) * 5 / 9 + 273;

	}
}