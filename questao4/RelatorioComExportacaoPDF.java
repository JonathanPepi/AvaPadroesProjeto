package questao4;

/**
 * Outro ConcreteDecorator.
 * Adiciona a funcionalidade de exportação para PDF.
 */
public class RelatorioComExportacaoPDF extends RelatorioDecorator {
    
    public RelatorioComExportacaoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar();
        String exportacao = adicionarExportacaoPDF();
        return relatorioBase + exportacao;
    }

    private String adicionarExportacaoPDF() {
        return ">> Adicional: Exportado para o formato PDF.\n";
    }
}