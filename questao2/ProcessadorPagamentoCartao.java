package questao2;

/**
 * Implementação concreta para processamento de pagamentos via Cartão de Crédito.
 */
public class ProcessadorPagamentoCartao implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via Cartão de Crédito.\n", valor);
    }
}