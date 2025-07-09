package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void inserir(Funcionarios funcionarios) {

        String sql = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, funcionarios.getNome());
            stmt.setString(2, funcionarios.getCargo());
            stmt.setDouble(3, funcionarios.getSalario());

            stmt.executeUpdate();

            System.out.println("Funcionarios cadastrado com sucesso!");
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public void Attfuncionario(double novosalario, String nome) {
        String sql = "UPDATE funcionarios SET novosalario = ? WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, novosalario);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Salario atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Dfuncionario(String nome) {
        String sql = "SELECT * FROM funcionarios WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, "zabeli");
            stmt.executeUpdate();
            System.out.println("Funcionario removido com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}


