package src;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU CRUD - CLIENTES =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Deletar Cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    String senhaCripto = Criptografia.criptografarSHA256(senha);
                    Pessoa p = new Pessoa(nome, idade, email, senhaCripto);
                    dao.inserir(p);
                }
                case 2 -> {
                    List<Pessoa> pessoas = dao.listar();
                    System.out.println("\n📋 Lista de Clientes:");
                    for (Pessoa p : pessoas) {
                        System.out.println("ID: " + p.getId() + 
                                           " | Nome: " + p.getNome() + 
                                           " | Idade: " + p.getIdade() + 
                                           " | Email: " + p.getEmail());
                    }
                }
                case 3 -> {
                    System.out.print("Digite o ID do cliente que deseja atualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nova Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nova Senha: ");
                    String senha = scanner.nextLine();

                    String senhaCripto = Criptografia.criptografarSHA256(senha);
                    Pessoa p = new Pessoa(id, nome, idade, email, senhaCripto);
                    dao.atualizar(p);
                }
                case 4 -> {
                    System.out.print("Digite o ID do cliente que deseja deletar: ");
                    int id = scanner.nextInt();
                    dao.deletar(id);
                }
                case 0 -> {
                    System.out.println("👋 Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("⚠️ Opção inválida!");
            }
        }
    }
}
