package questao3;

/**
 * A interface Observer (Observador).
 * Define o método que o Subject (Assunto) chamará quando seu estado mudar.
 * Neste caso, quando uma nova notícia for publicada.
 */
public interface Observador {
    void atualizar(String nomeTopico, String tituloNoticia);
}