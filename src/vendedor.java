public class vendedor extends pessoa {
    private double valorVendas,comissao;

    public vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
        super(nome, endereco, telefone);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
