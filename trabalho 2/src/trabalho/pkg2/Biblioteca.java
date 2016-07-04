
package trabalho.pkg2;

public abstract class Biblioteca {
    protected Item[] acervo;
    protected Usuario[] usuarios;
    
    protected void cadastrarUsuario(Usuario u){
        for(int i = 0; i < usuarios.length; i++){
            if(usuarios[i] == null){
                usuarios[i] = u;
                break;
            }
        }
    }
    protected void cadastrarItem(Item x, Usuario u){
        if(u.isOperador())
        {
            for(int i = 0; i < acervo.length; i++){
                if(x == acervo[i])
                {
                    break;  
                }else
                {
                    if(acervo[i] == null){
                        acervo[i] = x;
                        x.setDisponivel(true);
                        break;
                    }
                }
            }
        }
    }
    
    protected void locarItem(Item x,Usuario u){
    }
    
    protected boolean consultarSituacao(int id){
        return false;
    }
    protected void devolverItem(Item x, Usuario u){
        
    }
}
