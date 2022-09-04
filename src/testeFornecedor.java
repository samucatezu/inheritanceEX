public class testeFornecedor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        pessoa Samuel = new pessoa("Samucatezu","Wall street","123456789");
        fornecedor Quintao = new fornecedor("Quintao","Unip rangel",987654321,1000,30000);

        Quintao.imprimirinfo();
        Quintao.obterSaldo();
        System.out.println("\n");

    }

}
