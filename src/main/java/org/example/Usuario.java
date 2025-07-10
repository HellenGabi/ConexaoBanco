package org.example;

public class Usuario {

    String  nome;
    String  email;
    int id;


    public Usuario(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

}
