import java.util.Scanner;
public class TestMatematicas{
	public static void main (String args[]) {
		//llamada a los metodos de la clase Matemáticas
		System.out.println("Introduce un número entero");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		boolean par = Matematicas.esPar(numero);
		boolean divisiblePorTres = Matematicas.esDivisiblePorTres(numero);
		boolean divisiblePorCinco = Matematicas.esDivisiblePorCinco(numero);
		System.out.printf("El número %d ¿es par? %b, ¿es divisible por tres? %b, ¿es divisible por 5? %b%n",numero,par, divisiblePorTres, divisiblePorCinco);
	}
}
