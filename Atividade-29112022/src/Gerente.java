public class Gerente extends Funcionario{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    protected void imprimir() {
        System.out.println("O Gerente " + this.getNome() + " Do setor "+ this.getSetor() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }

    @Override
    protected void imprimir(String cabecalho) {
        System.out.println("Relatório do Gerente");
        System.out.println("O Gerente " + this.getNome() + " Do setor "+ this.getSetor() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());

    }

    @Override
    protected void imprimir(String cabecalho, String texto, String rodape) {
        System.out.println("Relatorio do funcionário");
        System.out.println("O Gerente " + this.getNome() + " Do setor "+ this.getSetor() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }

    @Override
    protected void imprimir(String texto, String rodape) {
        System.out.println("O Gerente " + this.getNome() + " Do setor "+ this.getSetor() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
}

