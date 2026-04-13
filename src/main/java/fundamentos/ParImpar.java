
package fundamentos;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Zero é neutro");
        } else if (num % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }

        scanner.close();
    }
}


