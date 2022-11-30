public class Funcionario {

    private String nome;
    private double salario;
    private double custo;
    private double aumento;
    private double percentual;

    private static final double Percentual_Custo = 1.8;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public final void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * Percentual_Custo;
    }

    protected double getPercentual_Custo() {
        return 1.8;
    }

    public class Gerente extends Funcionario {
        protected double getPercentualCusto() {
            return 1.0;
        }
    }

    public double getCusto() {
        return custo;
    }
    public void setAumento(){
        this.setAumento(10.0);
    }
    public void setAumento(double percentual) {
        double multiplicacao = (100.0 + percentual) / 100.0;
        this.setSalario(this.getSalario() * multiplicacao);
    }
    public void setAumento(String percentual) {
        double d = Double.parseDouble(percentual);
        this.setAumento(d);
    }

    public double getAumento() {
    return aumento;
}
    protected void imprimir() {
        System.out.println("O Funcionário " + this.getNome() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho){
        System.out.println("Relatório do funcionário");
        System.out.println("O Funcionário " + this.getNome() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho,String texto,String rodape){
        System.out.println("Relatorio do funcionário");
        System.out.println("O Funcionário " + this.getNome() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
    protected void imprimir(String texto , String rodape ){
        System.out.println("O Funcionário " + this.getNome() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
}

