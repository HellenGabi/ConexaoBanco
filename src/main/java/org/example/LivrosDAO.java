package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivrosDAO {

    public void inserir (Livros livros){

        String sql = "INSERT INTO livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getTitulo());
            stmt.setInt(3, livros.getAno_publicacao());

            stmt.executeUpdate();

            System.out.println("Livros cadastrado com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void Attautor (String novoautor, String livro){
        String sql = "UPDATE livros SET novoautor = ? WHERE livro = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoautor);
            stmt.setString(2, livro);
            stmt.executeUpdate();

            System.out.println("livro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Dlivro (String titulo){
        String sql = "DELETE FROM livros WHERE titulo = ?";
        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,"nanana");
            stmt.executeUpdate();
            System.out.println("livro deletado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

