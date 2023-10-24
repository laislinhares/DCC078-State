package org.example;

public class LivroBiblioteca {
    private String nome;
    private LivroEstado estado;

    public LivroBiblioteca() {
        this.estado = LivroEstadoDisponivel.getInstance();
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean pegarEmprestado() {
        return estado.pegarEmprestado(this);
    }

    public boolean restaurar() {
        return estado.restaurar(this);
    }

    public boolean colocarParaConsulta() {
        return estado.colocarParaConsulta(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LivroEstado getEstado() {
        return estado;
    }

    public void setEstado(LivroEstado estado) {
        this.estado = estado;
    }


}
