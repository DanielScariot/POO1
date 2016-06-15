package trabalho.pkg2;

public class Usuario {
    String Nome;
    int ID;
    Item[] LivrosLocados;
    boolean Operador;
    public Usuario(String nome, int id, int espaco){
        this(nome, id, espaco, false);
    }
    public Usuario(String nome, int id, int espaco, boolean operador){
        this.Nome = nome;
        this.ID = id;
        this.LivrosLocados = new Item[espaco];
        this.Operador = operador;
    }
    
}
