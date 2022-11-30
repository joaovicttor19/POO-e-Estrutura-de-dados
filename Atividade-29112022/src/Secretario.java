public class Secretario extends Funcionario{

    private String contratante;

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    protected void imprimir() {
        System.out.println("O Secretario " + this.getNome() +" Tem o contratante " + this.getContratante() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho){
        System.out.println("Relatório do funcionário");
        System.out.println("O Secretario " + this.getNome() +" Tem o contratante " + this.getContratante() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho,String texto,String rodape){
        System.out.println("Relatorio do funcionário");
        System.out.println("O Secretario " + this.getNome() +" Tem o contratante " + this.getContratante() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
    protected void imprimir(String texto , String rodape ){
        System.out.println("O Secretario " + this.getNome() +" Tem o contratante " + this.getContratante() + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
}

