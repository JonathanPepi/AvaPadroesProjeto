package questao3;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe ConcreteSubject (Assunto Concreto).
 * Mantém o estado de interesse e notifica os observadores quando ele muda.
 */
public class TopicoNoticia {
    private String nome;
    private List<Observador> observadores = new ArrayList<>();
    private String ultimaNoticia;

    public TopicoNoticia(String nome) {
        this.nome = nome;
    }

    /**
     * Permite que um observador (leitor) se inscreva neste tópico.
     */
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    /**
     * Permite que um observador cancele sua inscrição.
     */
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    /**
     * Notifica todos os observadores inscritos sobre a mudança.
     */
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this.nome, this.ultimaNoticia);
        }
    }

    /**
     * A ação que causa a mudança de estado e dispara a notificação.
     */
    public void publicarNovaNoticia(String tituloNoticia) {
        this.ultimaNoticia = tituloNoticia;
        System.out.println("\n=== Publicando nova notícia em " + this.nome + " ===");
        notificarObservadores();
    }
}