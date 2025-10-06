package questao1;

/**
 * Superclasse abstrata que representa um meio de transporte.
 * Define um contrato comum para todas as subclasses através do método abstrato calcularFrete().
 * Isso estabelece a base para a aplicação de Herança e Polimorfismo.
 */
public abstract class Transporte {
    /**
     * Método abstrato para cálculo de frete.
     * As subclasses são obrigadas a fornecer uma implementação específica,
     * garantindo que cada tipo de transporte tenha sua própria regra de cálculo.
     * @return o valor do frete calculado.
     */
    public abstract double calcularFrete();
}