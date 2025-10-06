package questao3;

/**
 * A classe ConcreteObserver (Observador Concreto).
 * Implementa a interface Observador e define a ação a ser tomada ao receber uma notificação.
 */
public class Leitor implements Observador {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeTopico, String tituloNoticia) {
        System.out.printf("Notificação para %s: Nova notícia no tópico '%s': \"%s\"\n",
                this.nome, nomeTopico, tituloNoticia);
    }
}
