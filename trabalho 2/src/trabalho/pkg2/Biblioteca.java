
package trabalho.pkg2;

public class Biblioteca {
    private Item[] acervo;
    private Usuario[] usuarios;
    public Biblioteca(int tamanhoDoAcervo,int numeroDeUsuarios ){
        this.acervo = new Item[tamanhoDoAcervo];
        this.usuarios = new Usuario[numeroDeUsuarios];
    }
    private void cadastrarUsuario(Usuario u){
        for(int i = 0; i < usuarios.length; i++){
            if(usuarios[i] == null){
                usuarios[i] = u;
            }
        }
    }
    private void cadastrarItem(Item x){
        for(int i = 0; i < acervo.length; i++){
            if(acervo[i] == null){
                acervo[i] = x;
            }
        }
    }
    private void locarItem(Item x,Usuario u){
        for(int i = 0; i < acervo.length; i++){
            if(x == acervo[i]){
                if(x.getdisponivel()){
                    x.Disponivel = false;
                    for(int aux = 0; aux < u.LivrosLocados.length; aux++){
                        if(u.LivrosLocados[aux]== null){
                            u.LivrosLocados[aux] = x;
                        }
                    }
                }
            }
        }
    }
}
