
public class PruebasCasting {

	public static void main(String[] args) {
		// Empieza el programa

		char digito;
		System.out.println("Introduzca un d�gito (0-9):");
		try {
			digito = (char) System.in.read();
			if (Character.isDigit(digito)) {
				System.out.println("Buen trabajo");
			} else {
				System.out.println("Te dije que escribieras un d�gito");
			}

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
}
