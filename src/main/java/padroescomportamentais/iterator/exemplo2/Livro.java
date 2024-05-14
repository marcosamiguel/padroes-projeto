package padroescomportamentais.iterator.exemplo2;

public class Livro {

    private String nome;
    private String autor;


    public Livro(String nome, String autor){
        this.autor = autor;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
