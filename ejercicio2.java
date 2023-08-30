import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        if(numero > 0 && numero%2 != 0){
	        System.out.println("true");
        }
	}
}
