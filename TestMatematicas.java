import java.util.Scanner;
public class TestMatematicas{
	public static void main (String args[]) {
		//llamada a los metodos de la clase Matemáticas
		System.out.println("Introduce un número entero");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		boolean par = Matematicas.esPar(numero);
		boolean divisiblePorTres = Matematicas.esPar(numero);
		boolean divisiblePorCinco = Matematicas.esPar(numero);
		System.out.printf("El número %d ¿es par? %b%, ¿es divisible por  res? %b, ¿es divisible por 5? %b%n",numero,par, divisiblePorTres, divisiblePorCinco);
	}
}
