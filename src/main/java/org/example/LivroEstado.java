package org.example;

public abstract class LivroEstado {

    public abstract String getEstado();

    public boolean pegarEmprestado(LivroBiblioteca livro) {
        return false;
    }
    public boolean devolver(LivroBiblioteca livro) {
        return false;
    }
    public boolean restaurar(LivroBiblioteca livro) {
        return false;
    }
    public boolean colocarParaConsulta(LivroBiblioteca livro) {
        return false;
    }
}
