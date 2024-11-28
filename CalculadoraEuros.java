package ejerciciosIf;

import java.util.Scanner;

public class CalculadoraEuros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double pesetas, euros;

		System.out.printf("Introduzca un número en pesetas: ");
		pesetas = teclado.nextDouble();
		if (pesetas > 0) {
			euros = pesetas / 166.386;
			System.out.printf("La cantidad en euros es: %.3f", euros);
		} else {
			System.out.printf("El valor de pesetas introducido no es válido");
		}
		teclado.close();
	}
}
