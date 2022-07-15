import java.util.Scanner;

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número:");

        int fatorial = scan.nextInt();
        int multi = 1;


        for (int i = fatorial; i>=1 ;i--){
            multi = multi * i;
        }
        System.out.println(fatorial + "! = "+ multi);
    }
}
