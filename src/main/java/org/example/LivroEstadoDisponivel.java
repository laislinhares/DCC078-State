package org.example;

public class LivroEstadoDisponivel extends  LivroEstado {
    private LivroEstadoDisponivel() {};
    private static LivroEstadoDisponivel instance = new LivroEstadoDisponivel();
    public static LivroEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponivel";
    }

    public boolean pegarEmprestado(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        return true;
    }

    public boolean restaurar(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        return true;
    }
}
