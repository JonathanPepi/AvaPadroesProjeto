package questao5;

/**
 * A interface Prototype.
 * Declara um método de clonagem. A interface Cloneable do Java é uma interface
 * de marcação que indica que a classe suporta a clonagem.
 * A boa prática é sobrescrever o método clone() da classe Object.
 */
public abstract class Documento implements Cloneable {
    private String tipo;
    private String cor;
    private String fonte;
    private String logotipo;

    // Getters e Setters para personalização
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getFonte() { return fonte; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public String getLogotipo() { return logotipo; }
    public void setLogotipo(String logotipo) { this.logotipo = logotipo; }
    
    /**
     * O método de clonagem.
     * Retorna uma cópia deste objeto.
     */
    @Override
    public Documento clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Documento) clone;
    }

    @Override
    public String toString() {
        return String.format("Documento [Tipo: %s, Cor: %s, Fonte: %s, Logotipo: %s]",
                tipo, cor, fonte, logotipo);
    }
}