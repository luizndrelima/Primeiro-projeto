public class Geral {
    private String tipo;
    private double valorVenda;
    private double valorCompra;
    private String fornecedor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
       this.valorVenda = (valorCompra * valorVenda);
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public  Geral () {};
    public Geral (String tipo){
        this.tipo = tipo;
    };

    public void exibirFichaInterna(){
        System.out.println("FICHA INTERNA DO SEU PRODUTO");
        System.out.println("Produto do Tipo; "+ getTipo());
        System.out.println("O Fornecedor; "+ getFornecedor());
        System.out.println("O valor de Compra foi; "+ getValorCompra());
        System.out.println("O valor de Revenda será; "+ getValorVenda());
    }


}
