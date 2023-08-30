import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int numeroA, numeroB;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero A: ");
        numeroA = sc.nextInt();
        
        System.out.println("Ingrese un numero B: ");
        numeroB = sc.nextInt();

        if(numeroA > 0 && numeroB >0){
	        System.out.println("true");
        }
	}
}
