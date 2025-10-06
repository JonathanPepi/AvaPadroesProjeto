package questao5;

public class Main {
    public static void main(String[] args) {
        // Criar os modelos originais (protótipos)
        Documento modeloCurriculo = new Curriculo();
        Documento modeloProposta = new PropostaComercial();

        System.out.println("--- Modelos Originais (Protótipos) ---");
        System.out.println(modeloCurriculo);
        System.out.println(modeloProposta);
        System.out.println("\n");

        // Usar o protótipo para criar um novo currículo para um cliente
        // Em vez de "new Curriculo()", usamos "clone()"
        Documento curriculoClienteA = modeloCurriculo.clone();
        
        // Personalizar a cópia sem afetar o original
        curriculoClienteA.setCor("Preto");
        curriculoClienteA.setFonte("Times New Roman");

        System.out.println("--- Documentos Personalizados (Clones) ---");
        System.out.println("Currículo Cliente A: " + curriculoClienteA);
        
        // Criar e personalizar uma proposta para outro cliente
        Documento propostaClienteB = modeloProposta.clone();
        propostaClienteB.setLogotipo("Logotipo do Cliente B");

        System.out.println("Proposta Cliente B: " + propostaClienteB);
        System.out.println("\n");
        
        // Verificar se os modelos originais não foram alterados
        System.out.println("--- Modelos Originais (Após Clonagem) ---");
        System.out.println("O modelo original de currículo permanece inalterado: " + modeloCurriculo);
        System.out.println("O modelo original de proposta permanece inalterado: " + modeloProposta);
    }
}