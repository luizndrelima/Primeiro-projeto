public class Produto extends Geral {
  private   String modelo;
  private String nome;
  private String tamanho;
  private   String cor;
  private   int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public  Produto (String tipo,String nome,String modelo, String tamanho, String cor){
        super(tipo); this.nome = nome; this.modelo = modelo; this.tamanho = tamanho; this.cor
             = cor;
    }

    public void exibirFichaTecnica() {
        System.out.println("FICHA TECNICA DO PRODUTO ");
        System.out.println("modelo é; "+ modelo);
        System.out.println("nome do produto é; "+ nome);
        System.out.println("A cor é; "+ cor);
        System.out.println("O tamaho é "+  tamanho);
    }

    @Override
    public String toString() {
        return " nome "+ nome + "o modelo é " + modelo;
    }
}

