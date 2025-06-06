package ClasseAutorDeLivros;

public class Autor {

    private String autor;
    private String email;
    private String cpf;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void InforAutor(){

        System.out.println("Nome: "+ getAutor());
        System.out.println("E-mail: "+getEmail());
        System.out.println("cpf: "+getCpf());

    }
}
