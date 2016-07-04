package trabalho.pkg2;

public abstract class Item {
    int ID;
    int Idusuario;
    protected boolean Disponivel;

    public int getID() {
        return ID;
    }

    public int getIdusuario() {
        return Idusuario;
    }
    
    public boolean getdisponivel(){
        return this.Disponivel;
    }

    public void setDisponivel(boolean Disponivel) {
        this.Disponivel = Disponivel;
    }

    public void setIdusuario(int Idusuario) {
        this.Idusuario = Idusuario;
    }
    
}
