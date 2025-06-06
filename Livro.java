package Pacote.ClasseLivro.CriarCadstroDeLivros;

import ClasseAutorDeLivros.Autor;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    //private double desconto;
    private String Alert;
    private String isbn;
    private Autor autor1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {

        return  this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void AddDescont(double Desconto){

        if (this.valor <= 59.90) {
            this.valor -= this.valor * Desconto; // Está Linha Calcula o Desconto de um Valor
            //this.Alert = "Você Recebeu um Desconto de 10% ";
        }
    }

    public void Acrescimo(){

        if (this.valor > 59.90){

             this.valor += this.valor * 0.05; // Está Linha Realiza um Acrescimo ao seu Valor
            //this.Alert = "Seu Valor sofreu um Acrescimo de 5%";
        }
    }

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }


    public Autor getAutor1() {
        return autor1;
    }

    public void setAutor1(Autor autor1) {
        this.autor1 = autor1;
    }

    void InformLivro(){

        System.out.println("Nome: "+getNome());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Valor do Livro:  "+ String.format("R$%.2f", getValor()));
     //   System.out.println("Atenção: "+Alert);
        System.out.println("isbn: "+getisbn());


    }
}
