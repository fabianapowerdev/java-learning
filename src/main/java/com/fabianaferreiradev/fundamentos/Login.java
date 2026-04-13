/*package fundamentos;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista de objetos Usuario
        Usuario[] usuarios = {
                new Usuario("admin", "1234"),
                new Usuario("fabiana", "abcd")
        };

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine().trim();

        System.out.println("Digite sua senha:");
        String pass = scanner.nextLine().trim();

        boolean loginValido = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (nome.equalsIgnoreCase(usuarios[i].login) &&
                    pass.equals(usuarios[i].senha)) {

                loginValido = true;
                break;
            }
        }

        if (loginValido) {
            System.out.println("Login realizado com sucesso! 🎉");
        } else {
            System.out.println("Usuário ou senha inválidos ❌");
        }

        scanner.close();
    }
}*/

// usando encapsulamento

package com.fabianaferreiradev.fundamentos;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Usuario[] usuarios = {
                new Usuario("admin", "1234"),
                new Usuario("fabiana", "abcd")
        };

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine().trim();

        System.out.println("Digite sua senha:");
        String pass = scanner.nextLine().trim();

        boolean loginValido = false;

        for (Usuario u : usuarios) {
            if (u.autenticar(nome, pass)) {
                loginValido = true;
                break;
            }
        }

        if (loginValido) {
            System.out.println("Login realizado com sucesso! 🎉");
        } else {
            System.out.println("Usuário ou senha inválidos ❌");
        }

        scanner.close();
    }
}
