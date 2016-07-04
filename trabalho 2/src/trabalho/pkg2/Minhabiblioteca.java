package trabalho.pkg2;

public class Minhabiblioteca extends Biblioteca {
    
    public Minhabiblioteca(int tamanhoDoAcervo,int numeroDeUsuarios ){
        this.acervo = new Item[tamanhoDoAcervo];
        this.usuarios = new Usuario[numeroDeUsuarios];
    }
    @Override
    protected void locarItem(Item x,Usuario u){
        for(int i = 0; i < acervo.length; i++){
            if(x == acervo[i]){
                if(x.getdisponivel()){
                    x.setDisponivel(false);
                    for(int aux = 0; aux < u.LivrosLocados.length; aux++){
                        if(u.LivrosLocados[aux]== null){
                            u.LivrosLocados[aux] = x;
                            x.setIdusuario(u.getID());
                            break;
                        }
                    }
                }
                break;
            }
        }
    }
    @Override
    protected boolean consultarSituacao(int id){
        boolean retorno = false;
        for(int i = 0; i < acervo.length; i++){
            if(acervo[i] != null){
                if(id == acervo[i].getID()){
                    retorno = acervo[i].getdisponivel();
                    break;
                }    
            }
        }
        return retorno;
    }
    @Override
    protected void devolverItem(Item x, Usuario u){
        if(x.getIdusuario()== u.getID()){
            x.setIdusuario(-1);
            x.setDisponivel(true);
            for(int i = 0; i < u.LivrosLocados.length;i++){
                if(u.getLivrosLocados()[i] != null){
                    if(u.LivrosLocados[i].getID()== x.getID())
                        u.LivrosLocados[i] = null;
                }
            }
        }
    }

    public Item[] getAcervo() {
        return acervo;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    
    
}
