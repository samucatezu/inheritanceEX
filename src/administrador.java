public class administrador extends pessoa {
    private double ajudaDeCusto;

    public administrador(String nome, String endereco, int telefone, double ajudaDeCusto) {
        super(nome, endereco, String.valueOf(telefone));
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public void imprimirinf2() {

        System.out.println("Nome: "+nome+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\nAjuda de custo: "+ajudaDeCusto );
    }
}
