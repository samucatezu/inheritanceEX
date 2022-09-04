public class fornecedor extends pessoa {

    private double valorCredito;
    private double valorDivida;

    public fornecedor(String nome, String endereco, int telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, String.valueOf(telefone));
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    public void imprimirinfo()
    {
        System.out.println("Nome: "+nome+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\nCrédito: "+valorCredito+"\nDívida: "+valorDivida);
    }

}
