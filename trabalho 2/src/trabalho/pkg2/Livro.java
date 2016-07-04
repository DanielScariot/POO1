package trabalho.pkg2;

public class Livro extends Item{
    private String Autor;
    private String Editora;
    private String Titulo;

    public Livro(int id,String autor, String editora, String titulo) {
        this.ID = id;
        this.Idusuario = -1;
        this.Disponivel = false;
        this.Autor = autor;
        this.Editora = editora;
        this.Titulo = titulo;
    }
    
    public String getAutor() {
        return Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public String getTitulo() {
        return Titulo;
    }
    
}
