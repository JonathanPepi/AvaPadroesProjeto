package questao4;

public class Main {
    public static void main(String[] args) {
        // Criando apenas o relatório básico
        Relatorio relatorioSimples = new RelatorioBasico();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorioSimples.gerar());

        // Adicionando estatísticas ao relatório básico dinamicamente
        Relatorio relatorioComEstatisticas = new RelatorioComEstatisticas(new RelatorioBasico());
        System.out.println("--- Relatório com Estatísticas ---");
        System.out.println(relatorioComEstatisticas.gerar());
        
        // Adicionando exportação PDF ao relatório básico
        Relatorio relatorioComPDF = new RelatorioComExportacaoPDF(new RelatorioBasico());
        System.out.println("--- Relatório com Exportação PDF ---");
        System.out.println(relatorioComPDF.gerar());

        // Combinando múltiplos decoradores: um relatório com estatísticas E exportação PDF
        // A ordem dos "embrulhos" importa!
        Relatorio relatorioCompleto = new RelatorioComExportacaoPDF(new RelatorioComEstatisticas(new RelatorioBasico()));
        System.out.println("--- Relatório Completo (Estatísticas + PDF) ---");
        System.out.println(relatorioCompleto.gerar());
    }
}