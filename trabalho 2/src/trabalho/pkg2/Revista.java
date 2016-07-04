package trabalho.pkg2;

public class Revista extends Item {
    private String Editora;
    private String Titulo;

    public Revista(int id, String editora, String titulo) {
        this.ID = id;
        this.Idusuario = -1;
        this.Disponivel = false;
        this.Editora = editora;
        this.Titulo = titulo;
    }
    
    public String getEditora() {
        return Editora;
    }

    public String getTitulo() {
        return Titulo;
    }

    
}
