package org.example;

public class LivroEstadoEmRestauracao extends LivroEstado {
    private LivroEstadoEmRestauracao() {};
    private static LivroEstadoEmRestauracao instance = new LivroEstadoEmRestauracao();
    public static LivroEstadoEmRestauracao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em restauracao";
    }

    public boolean colocarParaConsulta(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoConsulta.getInstance());
        return true;
    }

    public boolean devolver(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        return true;
    }
}
