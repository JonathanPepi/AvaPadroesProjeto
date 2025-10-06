package questao2;

public class Main {
    public static void main(String[] args) {
        // O tipo de pagamento pode vir de uma configuração, banco de dados ou input do usuário.
        String tipoDePagamentoEscolhido = "PIX";
        double valorDaCompra = 250.75;
        
        // O código principal não usa "new ProcessadorPagamentoPIX()".
        // Ele pede à fábrica para criar o objeto apropriado.
        // Isso centraliza e esconde a lógica de criação.
        try {
            ProcessadorPagamento processador = PagamentoFactory.criarProcessador(tipoDePagamentoEscolhido);
            processador.processar(valorDaCompra);
        
            tipoDePagamentoEscolhido = "CARTAO";
            valorDaCompra = 1200.00;
            processador = PagamentoFactory.criarProcessador(tipoDePagamentoEscolhido);
            processador.processar(valorDaCompra);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
