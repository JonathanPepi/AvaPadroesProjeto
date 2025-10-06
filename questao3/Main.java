package questao3;

public class Main {
    public static void main(String[] args) {
        // Criando os Subjects (tópicos)
        TopicoNoticia esportes = new TopicoNoticia("Esportes");
        TopicoNoticia tecnologia = new TopicoNoticia("Tecnologia");

        // Criando os Observers (leitores)
        Observador leitor1 = new Leitor("Ana");
        Observador leitor2 = new Leitor("Bruno");
        Observador leitor3 = new Leitor("Carla");

        // Leitores se inscrevem nos tópicos de interesse
        esportes.adicionarObservador(leitor1);
        esportes.adicionarObservador(leitor3);
        
        tecnologia.adicionarObservador(leitor2);
        tecnologia.adicionarObservador(leitor3); // Carla se interessa por ambos

        // Publicando notícias - isso irá notificar automaticamente os inscritos
        esportes.publicarNovaNoticia("Brasil vence a copa do mundo!");
        tecnologia.publicarNovaNoticia("Google lança novo modelo de IA.");
        
        // Exemplo de cancelamento de inscrição
        System.out.println("\n--- Carla cancelou a inscrição em Esportes ---");
        esportes.removerObservador(leitor3);

        // Publicando outra notícia em esportes
        esportes.publicarNovaNoticia("Final do campeonato de tênis definida.");
    }
}