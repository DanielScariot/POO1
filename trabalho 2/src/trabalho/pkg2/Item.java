package trabalho.pkg2;

public class Item {
    String Titulo;
    int ID;
    boolean Disponivel;
    String Editora;
    String Autor;
    public void Item(String titulo, int id, String editora){
        this.Titulo = titulo;
        this.ID = id;
        this.Editora = editora;
        Disponivel = true;
    }
            
    public void Item(String titulo, int id, String editora, String autor){
        this.Titulo = titulo;
        this.ID = id;
        this.Editora = editora;
        Disponivel = true;
        this.Autor = autor;
    }
    public boolean getdisponivel(){
        return this.Disponivel;
    }
}
