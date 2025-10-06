package questao1;

public class Main {
    public static void main(String[] args) {
        // O código cliente pode tratar diferentes tipos de transporte de forma uniforme.
        // Isso é polimorfismo em ação.
        Transporte terrestre = new TransporteTerrestre(150.0); 
        Transporte aereo = new TransporteAereo(50.0);      

        System.out.println("Cálculo de Fretes:");
        
        // A chamada ao método calcularFrete() executa a implementação correta
        // dependendo do tipo real do objeto, sem que o cliente precise saber os detalhes.
        System.out.printf("Custo do transporte terrestre (150km): R$ %.2f\n", terrestre.calcularFrete());
        System.out.printf("Custo do transporte aéreo (50kg): R$ %.2f\n", aereo.calcularFrete());
    }
}