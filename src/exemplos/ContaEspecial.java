package exemplos;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        // Envia os atributos para o construtor da classe mãe
        super(numero, nomeTitular);
        this.limite = limite;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
