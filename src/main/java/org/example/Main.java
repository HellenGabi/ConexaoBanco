package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        AlunoDAO alunoDAO = new AlunoDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        LivrosDAO livrosDAO = new LivrosDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        PedidoDAO pedidoDAO = new PedidoDAO();

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Usuário");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Cadastrar Livro");
            System.out.println("5 - Cadastrar Funcionário");
            System.out.println("6 - Cadastrar Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    Aluno aluno = new Aluno(nomeAluno, matricula, curso);
                    alunoDAO.inserir(aluno);
                    alunoDAO.AttCurso("23213", "mfer");
                    alunoDAO.Daluno("23213");
                    break;
                }

                case 2: {
                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Digite o id do aluno: ");
                    int id = sc.nextInt();

                    Usuario usuario = new Usuario(nomeUsuario, email, id);
                    usuarioDAO.inserir(usuario);
                    usuarioDAO.atualizarEmail("julia", "hellen@gmail");
                    List<Usuario> listar = UsuarioDAO.listar();
                    for (Usuario u : listar) {
                        System.out.println(u);
                        break;
                    }
                }

                case 3: {
                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Produto produto = new Produto(nomeProduto, preco, quantidade);
                    produtoDAO.inserir(produto);
                    produtoDAO.Attpreco("touca", Double.parseDouble("60,00"));
                    produtoDAO.Dproduto("touca");
                    break;
                }
                case 4: {
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    Livros livro = new Livros(titulo, autor, ano);
                    livrosDAO.inserir(livro);
                    livrosDAO.Attautor("geovanna", "mouse");
                    break;
                }
                case 5: {
                    System.out.print("Nome do funcionário: ");
                    String nomeFuncionario = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    Funcionarios funcionario = new Funcionarios(nomeFuncionario, cargo, salario);
                    funcionarioDAO.inserir(funcionario);
                    funcionarioDAO.Attfuncionario(2.000, "zabeli");
                    funcionarioDAO.Dfuncionario("zabeli");
                    break;
                }
                case 6: {
                    System.out.print("Nome do pedido: ");
                    String nomePedido = sc.nextLine();
                    LocalDate data = LocalDate.now();
                    System.out.print("Total: ");
                    double total = sc.nextDouble();
                    System.out.println("Digite o ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(nomePedido, data, total);
                    pedidoDAO.inserir(pedido);
                    pedidoDAO.Atttotal(3, 100);
                    pedidoDAO.Dpedido(1);
                    break;
                }
                case 0: {
                    System.out.println("Encerrando o sistema...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } while (opcao != 0);

        sc.close();

    }
}



