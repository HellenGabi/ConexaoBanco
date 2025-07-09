package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    public void inserir (Aluno aluno) {

        String sql = "INSERT INTO aluno (nome, matricula, curso) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setString(3, aluno.getCurso());
            stmt.executeUpdate();

            System.out.println("aluno inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void AttCurso (String novocurso, String matricula){
        String sql = "UPDATE aluno SET matricula = ? WHERE curso = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novocurso);
            stmt.setString(2, matricula);
            stmt.executeUpdate();

            System.out.println("curso atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Daluno (String matricula){
        String sql = "DELETE FROM alunos WHERE matricula = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, matricula);
            stmt.executeUpdate();
            System.out.println("aluno deletado com sucesso!");
        }catch (
                SQLException e
        ){
            e.printStackTrace();
        }
    }
}
