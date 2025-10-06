package questao4;

/**
 * A classe abstrata Decorator.
 * Mantém uma referência ao objeto Component (o relatório que está sendo "decorado")
 * e encaminha as requisições para ele. As subclasses concretas adicionarão
 * sua própria funcionalidade antes ou depois de chamar o método do objeto encapsulado.
 */
public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioDecorado = relatorio;
    }

    @Override
    public String gerar() {
        // Por padrão, apenas delega a chamada para o objeto decorado.
        return relatorioDecorado.gerar();
    }
}
