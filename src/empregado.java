public class empregado {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super();
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = (imposto/100);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        if (imposto >=0  ) {

            this.imposto = (imposto/100);
        }else {
            System.out.println("Imposto negativo");
        }



    }

    public double calcularSalario () {
        return this.salarioBase - (this.salarioBase * this.imposto);
    }

}
