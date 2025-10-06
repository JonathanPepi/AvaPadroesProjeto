package questao5;

/**
 * Uma implementação concreta do Prototype.
 * Este é um dos modelos de documento que podem ser clonados.
 */
public class Curriculo extends Documento {
    public Curriculo() {
        // Configurações padrão para o modelo de currículo
        setTipo("Currículo");
        setCor("Azul");
        setFonte("Calibri");
        setLogotipo("N/A");
    }
}
