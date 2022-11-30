public class Main {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario();
        joao.setNome("João Victtor");
        joao.setSalario(1200);
        joao.setAumento(10.0);
        joao.imprimir();

        Gerente giovanni = new Gerente();
        giovanni.setNome("Giovanni Paulo");
        giovanni.setSetor("Vendas");
        giovanni.setSalario(1200);
        giovanni.setAumento();
        giovanni.imprimir();

        Secretario guilherme = new Secretario();
        guilherme.setNome("Guilherme Silva");
        guilherme.setContratante("Paulo Mendes");
        guilherme.setSalario(1200);
        guilherme.setAumento();
        guilherme.imprimir("","");

        Programador marcos = new Programador();
        marcos.setNome("Marcos Santos");
        marcos.setLinguagem("Java");
        marcos.setSalario(1200);
        marcos.setAumento();
        marcos.imprimir("","","");
    }
}