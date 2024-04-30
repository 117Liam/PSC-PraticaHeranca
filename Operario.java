public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor padrão
    public Operario() {}

    // Construtor com parâmetros
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefinindo o método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }
}
