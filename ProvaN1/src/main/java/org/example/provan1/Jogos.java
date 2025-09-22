package org.example.provan1;

class Jogos {
    private int id;
    private String nome;
    private String categoria;

    public Jogos(int id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}


