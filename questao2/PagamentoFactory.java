package questao2;

/**
 * Esta é a classe Factory.
 * O padrão Factory Method é aplicado aqui para encapsular a lógica de criação dos objetos.
 * O cliente não precisa saber como criar cada processador, ele apenas pede à fábrica.
 * Isso desacopla o cliente das classes concretas de pagamento.
 */
public class PagamentoFactory {
    
    /**
     * O "Factory Method". Baseado no tipo, ele decide qual objeto concreto instanciar e retornar.
     * @param tipo O tipo de pagamento desejado (ex: "PIX", "CARTAO").
     * @return Uma instância de um ProcessadorPagamento.
     * @throws IllegalArgumentException se o tipo for desconhecido.
     */
    public static ProcessadorPagamento criarProcessador(String tipo) {
        if (tipo.equalsIgnoreCase("PIX")) {
            return new ProcessadorPagamentoPIX();
        } else if (tipo.equalsIgnoreCase("CARTAO")) {
            return new ProcessadorPagamentoCartao();
        }
        throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipo);
    }
}