package curso_java_basico_exercicios_calculadora;

import java.util.Iterator;

public class Calculadora {

	public static double somar(int value1, int value2) {
		return value1 + value2;
	}

	public static double subtrair(int value1, int value2) {
		return value1 - value2;
	}

	public static double multiplicar(int value1, int value2) {
		return value1 * value2;
	}

	public static double dividir(int value1, int value2) {
		return value1 / value2;
	}

	public static double elevarAPotencia(int value, int n) {
		return Math.pow(value, n);
	}
	
	public static int factorial(int number) {
		int fatorial = 1;
		int i = 1;
		
		while (i <= number) {
			fatorial *= i;
			i++;
		}
		return fatorial;
	}
	
	
	public static int factorialRecursivo(int number) {
		if (number == 0) {
			return 1;
		}
		
		return number * factorialRecursivo(number - 1);
	}
}
