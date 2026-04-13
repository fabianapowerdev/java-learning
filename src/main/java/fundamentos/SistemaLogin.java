package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Novo usuário: ");
                    String novoLogin = scanner.nextLine().trim();

                    System.out.print("Nova senha: ");
                    String novaSenha = scanner.nextLine().trim();

                    boolean existe = false;

                    for (Usuario u : usuarios) {
                        if (u.getLogin().equalsIgnoreCase(novoLogin)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Usuário já existe ❌");
                    } else {
                        usuarios.add(new Usuario(novoLogin, novaSenha));
                        System.out.println("Usuário cadastrado com sucesso! 🎉");
                    }
                    break;

                case 2:
                    System.out.print("Login: ");
                    String login = scanner.nextLine().trim();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine().trim();

                    boolean loginValido = false;

                    for (Usuario u : usuarios) {
                        if (u.autenticar(login, senha)) {
                            loginValido = true;
                            break;
                        }
                    }

                    if (loginValido) {
                        System.out.println("Login realizado com sucesso! 🚀");
                    } else {
                        System.out.println("Usuário ou senha inválidos ❌");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
