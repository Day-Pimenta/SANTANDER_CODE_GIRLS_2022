import java.util.Scanner;

public class Ex01_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota<0 | nota>10){
            System.out.println(" Por favor insira uma nota válida");
            System.out.println("Nota: ");
            nota = scan.nextInt();
        }
        System.out.println("FIM");

    }
}
