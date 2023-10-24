package org.example;

public class LivroEstadoConsulta extends LivroEstado {

    private LivroEstadoConsulta() {};
    private static LivroEstadoConsulta instance = new LivroEstadoConsulta();
    public static LivroEstadoConsulta getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Para consulta";
    }

    public boolean restaurar(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        return true;
    }
}
