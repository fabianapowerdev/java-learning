package fundamentos;

import java.util.Scanner;

public class Notas {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota < 5) {
            System.out.println("Reprovado " + nota);
        } else if (nota < 7) {
            System.out.println("Em recuperação " + nota);
        } else {
            System.out.println("Aprovado " + nota);
        }
        scanner.close();

    }
}
