package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {


    public void inserir (Usuario usuario) {

        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarEmail(String nome, String novoEmail) {
        String sql = "UPDATE usuarios SET email = ? WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> listar() {
        String sql = "SELECT id, nome, email FROM usuarios ";
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                Usuario usuario = new Usuario(nome, email, id);
                usuarios.add(usuario);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

}
