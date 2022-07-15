import java.util.Random;
import java.util.Scanner;

public class Ex09_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i<numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        for (int numeroAleatorio :numeros ) {
            System.out.println("Número: "+ numeroAleatorio+" e seu suscessor é: "+ (numeroAleatorio+1));

        }


    }
}
