package questao4;

/**
 * A classe ConcreteComponent (Componente Concreto).
 * É o objeto base ao qual funcionalidades extras serão adicionadas.
 */
public class RelatorioBasico implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório Básico: Lista de Pedidos do Dia.\n";
    }
}