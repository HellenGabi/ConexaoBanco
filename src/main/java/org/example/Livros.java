package org.example;

public class Livros {

        String titulo;
        String autor;
        int ano_publicacao;

        public Livros(String titulo, String autor, int ano_publicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano_publicacao = ano_publicacao;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
}
