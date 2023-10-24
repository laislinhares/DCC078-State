package org.example;

public class LivroEstadoEmprestado extends LivroEstado {

    private LivroEstadoEmprestado() {};
    private static LivroEstadoEmprestado instance = new LivroEstadoEmprestado();
    public static LivroEstadoEmprestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Emprestado";
    }

    public boolean devolver(LivroBiblioteca livro) {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        return true;
    }
}
