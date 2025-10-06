package questao2;

/**
 * Implementação concreta para processamento de pagamentos via PIX.
 */
public class ProcessadorPagamentoPIX implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via PIX.\n", valor);
    }
}
