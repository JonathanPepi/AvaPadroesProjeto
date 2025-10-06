package questao1;
/**
 * Implementação concreta para transporte terrestre.
 * Herda de Transporte e implementa a regra de cálculo baseada na distância.
 * Segue o Princípio da Responsabilidade Única, pois sua única
 * responsabilidade é o cálculo do frete terrestre.
 */
public class TransporteTerrestre extends Transporte {
    private double distanciaKm;
    private static final double TAXA_POR_KM = 1.50; 

    public TransporteTerrestre(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularFrete() {
        return this.distanciaKm * TAXA_POR_KM;
    }
}