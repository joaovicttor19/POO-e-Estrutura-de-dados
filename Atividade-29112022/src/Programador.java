public class Programador extends Funcionario{

    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    protected void imprimir() {
        System.out.println("O Programador " + this.getNome() +" Utiliza a linguagem " + this.getLinguagem()  + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho){
        System.out.println("Relatório do funcionário");
        System.out.println("O Programador " + this.getNome() +" Utiliza a linguagem " + this.getLinguagem()  + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
    }
    protected void imprimir(String cabecalho,String texto,String rodape){
        System.out.println("Relatorio do funcionário");
        System.out.println("O Programador " + this.getNome() +" Utiliza a linguagem " + this.getLinguagem()  + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
    protected void imprimir(String texto , String rodape ){
        System.out.println("O Programador " + this.getNome() +" Utiliza a linguagem " + this.getLinguagem()  + " ,Tem um salário de " + this.getSalario() + " ,E tem um custo de " + this.getCusto());
        System.out.println("⊛ Criado pela empresa Newtech");
    }
}

