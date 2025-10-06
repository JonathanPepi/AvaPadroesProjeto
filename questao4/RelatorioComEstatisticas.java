package questao4;

/**
 * Um ConcreteDecorator (Decorador Concreto).
 * Adiciona a funcionalidade de estatísticas ao relatório.
 */
public class RelatorioComEstatisticas extends RelatorioDecorator {
    
    public RelatorioComEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar(); // Gera o relatório do objeto decorado
        String estatisticas = adicionarEstatisticas(); // Adiciona sua própria funcionalidade
        return relatorioBase + estatisticas;
    }

    private String adicionarEstatisticas() {
        return ">> Adicional: Estatísticas de Faturamento (Total: R$ 10.500,00)\n";
    }
}