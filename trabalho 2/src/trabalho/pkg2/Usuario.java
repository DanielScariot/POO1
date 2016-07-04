package trabalho.pkg2;

public class Usuario {
    private String Nome;
    private int ID;
    Item[] LivrosLocados;
    private boolean Operador;
    public Usuario(String nome, int id, int espaco){
        this(nome, id, espaco, false);
    }
    public Usuario(String nome, int id, int espaco, boolean operador){
        this.Nome = nome;
        this.ID = id;
        this.LivrosLocados = new Item[espaco];
        this.Operador = operador;
    }

    public Item[] getLivrosLocados() {
        return LivrosLocados;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setLivrosLocados(Item[] LivrosLocados) {
        this.LivrosLocados = LivrosLocados;
    }

    public boolean isOperador() {
        return Operador;
    }
    
    
    
}
