public class pessoa {

    /*
     * Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus
     * respectivos seletores (getters) e modificadores (setters), e ainda o
     * construtor padrão e pelo menos mais duas opções de construtores conforme sua
     * percepção. Atributos: String nome; String endereço; String telefone;
     */

    public String nome;
    public String endereco;
    public String telefone;

    public pessoa() {
        super();
    }
    public pessoa(String nome) {
        super();
        this.nome = nome;
    }
    public pessoa(String nome, String endereco) {
        super();
        this.nome = nome;
        this.endereco = endereco;
    }
    public pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}

