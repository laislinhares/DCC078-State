import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    LivroBiblioteca livro;

    @BeforeEach
    public void setUp() {
        livro = new LivroBiblioteca();
    }

    // Livro Disponivel
    @Test
    public void naoDeveDevolverLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertFalse(livro.devolver());
    }
    @Test
    public void naoDevecolocarParaConsultaLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertFalse(livro.colocarParaConsulta());
    }
    @Test
    public void deveEmprestarLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertTrue(livro.pegarEmprestado());
        assertEquals(LivroEstadoEmprestado.getInstance(), livro.getEstado());
    }
    @Test
    public void deveRestaurarLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertTrue(livro.restaurar());
        assertEquals(LivroEstadoEmRestauracao.getInstance(), livro.getEstado());
    }


    // Livro Emprestado
    @Test
    public void deveDevolverLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.devolver());
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }
    @Test
    public void naoDevecolocarParaConsultaLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.colocarParaConsulta());
    }
    @Test
    public void naoDeveEmprestarLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.pegarEmprestado());
    }
    @Test
    public void naoDeveRestaurarLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.restaurar());
    }


    // Livro para consulta
    @Test
    public void deveRestaurarLivroParaConsulta() {
        livro.setEstado(LivroEstadoConsulta.getInstance());
        assertTrue(livro.restaurar());
        assertEquals(LivroEstadoEmRestauracao.getInstance(), livro.getEstado());
    }
    @Test
    public void naoDevecolocarParaConsultaLivroParaConsulta() {
        livro.setEstado(LivroEstadoConsulta.getInstance());
        assertFalse(livro.colocarParaConsulta());
    }
    @Test
    public void naoDeveEmprestarLivroParaConsulta() {
        livro.setEstado(LivroEstadoConsulta.getInstance());
        assertFalse(livro.pegarEmprestado());
    }
    @Test
    public void naoDeveDevolverLivroParaConsulta() {
        livro.setEstado(LivroEstadoConsulta.getInstance());
        assertFalse(livro.devolver());
    }


    // Livro em restauração
    @Test
    public void deveDevolverLivroEmRestauracao() {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        assertTrue(livro.devolver());
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }
    @Test
    public void devecolocarParaConsultaLivroEmRestauracao() {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        assertTrue(livro.colocarParaConsulta());
        assertEquals(LivroEstadoConsulta.getInstance(), livro.getEstado());
    }
    @Test
    public void naoDeveEmprestarLivroEmRestauracao() {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        assertFalse(livro.pegarEmprestado());
    }
    @Test
    public void naoDeveRestaurarLivroEmRestauracao() {
        livro.setEstado(LivroEstadoEmRestauracao.getInstance());
        assertFalse(livro.restaurar());
    }
}
