package org.example;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {

    public void inserir(Pedido pedido) {

        String sql = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pedido.getNome());
            stmt.setDate(2, Date.valueOf(pedido.getData()));
            stmt.setDouble(3, pedido.getTotal());

            stmt.executeUpdate();

            System.out.println("Produto inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Atttotal (int novoid, int total) {
        String sql = "UPDATE pedidos SET total = ? WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, novoid);
            stmt.setInt(2, total);

            System.out.println("Atualizado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void Dpedido (int id){
        String sql = "DELETE FROM pedidos WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, 1);
            stmt.executeUpdate();

            System.out.println("Pedido deletado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}




