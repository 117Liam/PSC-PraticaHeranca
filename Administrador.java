public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor padrão
    public Administrador() {}

    // Construtor com parâmetros
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getter e Setter
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinindo o método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
