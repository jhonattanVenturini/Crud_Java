package src;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private String url = "jdbc:mysql://localhost:3306/exemplo";
    private String usuario = "root";
    private String senha = "";

    // CREATE
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoas (nome, idade, email, senha) VALUES (?, ?, ?, ?)";
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getSenha());

            stmt.executeUpdate();
            System.out.println("✅ Pessoa cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao inserir: " + e.getMessage());
        }
    }

    // READ
    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoas";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Pessoa pessoa = new Pessoa(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("email"),
                    rs.getString("senha")
                );
                pessoas.add(pessoa);
            }

        } catch (SQLException e) {
            System.out.println("❌ Erro ao listar: " + e.getMessage());
        }
        return pessoas;
    }

    // UPDATE
    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoas SET nome=?, idade=?, email=?, senha=? WHERE id=?";
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getSenha());
            stmt.setInt(5, pessoa.getId());

            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("✅ Pessoa atualizada com sucesso!");
            } else {
                System.out.println("⚠️ Nenhum registro encontrado para atualizar.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Erro ao atualizar: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int id) {
        String sql = "DELETE FROM pessoas WHERE id=?";
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                System.out.println("✅ Pessoa deletada com sucesso!");
            } else {
                System.out.println("⚠️ Nenhum registro encontrado para deletar.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Erro ao deletar: " + e.getMessage());
        }
    }
}
