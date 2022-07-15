import java.util.Scanner;

public class Ex08_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int cont_consoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!((letra.equalsIgnoreCase("a")) |
                    (letra.equalsIgnoreCase("e")) |
                    (letra.equalsIgnoreCase("i")) |
                    (letra.equalsIgnoreCase("o")) |
                    (letra.equalsIgnoreCase("u")))) {

                consoantes[count] = letra;
                cont_consoantes++;
            }

            count++;
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");

            }

        }
        System.out.print(cont_consoantes);
    }
}

