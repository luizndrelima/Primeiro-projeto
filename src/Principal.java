import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Oculos","Queridinho", "Sport","unico","Blue");
        produto1.setFornecedor("skein");
        produto1.setValorCompra(2.50);
        produto1.setValorVenda(3);

        Produto produto2 = new Produto("Bolsa","Social","****", "small","yellow");

        produto2.setFornecedor("Alibaba");
        produto2.setValorCompra(5.30);
        produto2.setValorVenda(2);

        Produto produto3 =  new Produto("Oculos","Bloguiro","Grau","unico","black");
        produto3.setFornecedor("shopp");
        produto3.setValorCompra(1.90);
        produto3.setValorVenda(3);


       ArrayList<Produto> listaProdutos = new ArrayList<>();
       listaProdutos.add(produto1);
       listaProdutos.add(produto2);
       listaProdutos.add(produto3);
        System.out.println("QUANTIDADE DE PRODUTO É :"+ listaProdutos.size());
        System.out.println(listaProdutos.get(1).getNome());
        System.out.println(listaProdutos.toString());



        }
    }

