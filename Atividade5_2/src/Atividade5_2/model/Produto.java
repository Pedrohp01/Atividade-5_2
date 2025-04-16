package Atividade5_2.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nm,double vlr,int qntd ){
  this.nome = nm;
  this.preco = vlr;
  this.quantidade = qntd;

  // Getters
    }
    public String getNome(){

        return this.nome;
    }
    public double getPreco(){

        return this.preco;
    }
    public int getQuantidade(){

        return this.quantidade;
    }

    //setters
    public void setNome(String novo){
        this.nome = novo;

    }
    public void alterarQuantidade(int valor){
     if (valor > quantidade) {
        System.out.println("A quantidade não pode ser negativa");
     }
     else{
        quantidade -= valor;
        System.out.println("Essa é a nova quantidade: " + quantidade );
     }


    }
    public void alterarPreco(double desconto){
        if(desconto >= preco){
             
            System.out.println("o valor de deconto está muito alto por favor, troque o valor");
        }
        else{
            preco -= desconto;
            System.out.println("o preço do produto" + nome+ "é: R$ " + preco  );
        }
    }


}
