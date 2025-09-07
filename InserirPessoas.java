import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPessoas {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/exemplo";
        String usuario = "root";
        String senha = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("================ SISTEMA DE CADASTRO - CLIENTES ========================");


        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // corrige nextInt() com nextLine()

        System.out.print("Digite o email da pessoa: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha da pessoa: ");
        String senhaUsuario = scanner.nextLine();

        // Criptografa a senha usando a classe externa
        String senhaCriptografada = Criptografia.criptografarSHA256(senhaUsuario);

        String sql = "INSERT INTO pessoas (nome, idade, email, senha) VALUES (?, ?, ?, ?)";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, email);
            stmt.setString(4, senhaCriptografada);

            int linhasInseridas = stmt.executeUpdate();
            if (linhasInseridas > 0) {
                System.out.println();
                System.out.println("================ CLIENTES CADASTRADO COM SUCESSO =======================");
                System.out.println();
                System.out.println("Dados inseridos no banco de dados{exemplo}!");
                System.out.println();
                System.out.println("===============================================================================");
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
