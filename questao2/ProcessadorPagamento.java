package questao2;

/**
 * Interface que define o contrato para todos os processadores de pagamento.
 * Qualquer meio de pagamento implementará esta interface, garantindo que o sistema
 * possa interagir com eles de uma maneira uniforme.
 */
public interface ProcessadorPagamento {
    void processar(double valor);
}