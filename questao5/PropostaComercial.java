package questao5;

/**
 * Outra implementação concreta do Prototype.
 */
public class PropostaComercial extends Documento {
    public PropostaComercial() {
        // Configurações padrão para a proposta comercial
        setTipo("Proposta Comercial");
        setCor("Verde");
        setFonte("Arial");
        setLogotipo("Logotipo Padrão da Empresa");
    }
}