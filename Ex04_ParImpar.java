import java.util.Scanner;

public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade;
        int count = 0;
        int num;
        int par = 0;
        int impar = 0;


        System.out.println("Quantos números você deseja inserir?  ");
        quantidade = scan.nextInt();

        do{
            System.out.println("Número: ");
            num = scan.nextInt();
            if (num%2==0){
                par++;
            }else{
                impar++;
            }
            count++;
        }while(count < quantidade);
        System.out.println("Foram inseridos "+quantidade+" números onde temos "+par+" pares e "+impar+" ímpares");
    }
}
