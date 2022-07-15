import java.util.Scanner;

public class Ex02_NomeIdade
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String nome;
        int idade;
        System.out.println("Para finalizar o processo digite 0 no nome!!");

        while (true){
            System.out.println("Informe seu nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Programa finalizado....");
    }
}
