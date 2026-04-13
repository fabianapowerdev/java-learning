package fundamentos;

import java.util.Scanner;

public class MaiorIdade {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 13) {
            System.out.println("Com essa idade de " + idade + " anos, você ainda é um bebê");
        } else if (idade < 18) {
            System.out.println("Com essa idade de " + idade + " anos, você continua rebelde");
        } else {
            System.out.println("Com seus " + idade + " anos, você já é um idoso (a)");
        }
        scanner.close();

    }
}



