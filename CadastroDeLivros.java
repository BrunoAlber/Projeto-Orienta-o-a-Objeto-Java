package Pacote.ClasseLivro.CriarCadstroDeLivros;

import ClasseAutorDeLivros.Autor;

import java.util.Locale;
import java.util.Scanner;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Autor autor1, autor2;
        Livro livro1, livro2;

        autor1 = new Autor();
        livro1 = new Livro();

        System.out.println("==================================================================");

        System.out.println("Progra Faz Leitura de Dados com Scanner com Métodos Encapsulados ");
        System.out.println("------ Projeto Livraria ------");

        System.out.println("==================================================================");



        System.out.print("Digite o Nome: ");
        String DigitNome = sc.nextLine();
        livro1.setNome(DigitNome);


        System.out.print("Informe uma Descrição: ");
        String descricao = sc.nextLine();
        livro1.setDescricao(descricao);


        System.out.print("Digite o Valor: ");
        double Valor = sc.nextDouble();
        livro1.setValor(Valor);
        livro1.AddDescont(0.1);
        livro1.Acrescimo();




        sc.nextLine();

        System.out.print("Digite o isbn: ");
        String isbn = sc.nextLine();
        livro1.setisbn(isbn);

        /*

        Criar uma Composição entre Livro1 e Autor1


         */

        livro1.setAutor1(autor1);

        System.out.print("Autor: ");
        String NomeAutor = sc.nextLine();
        autor1.setAutor(NomeAutor);

        System.out.print("E-mail: ");
        String Email = sc.nextLine();
        autor1.setEmail(Email);

        System.out.print("cpf: ");
        String cpf = sc.nextLine();
        autor1.setCpf(cpf);

        System.out.println();

        System.out.println("============== Informação do Livro ==============");
        livro1.InformLivro();
        livro1.getAutor1().InforAutor();




        sc.close();
    }
}
