package questao1;

/**
 * Implementação concreta para transporte aéreo.
 * Herda de Transporte e implementa a regra de cálculo baseada no peso.
 */
public class TransporteAereo extends Transporte {
    private double pesoKg;
    private static final double TAXA_BASE = 100.0; 
    private static final double TAXA_POR_KG = 10.0;  

    public TransporteAereo(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularFrete() {
        return TAXA_BASE + (this.pesoKg * TAXA_POR_KG);
    }
}