package trabalho.pkg2;
public class Trabalho2 {
    public static void main(String[] args) {
        Minhabiblioteca Biblioteca = new Minhabiblioteca(5,5);
        Livro Percy = new Livro(1, "Rick Riordan ", "Maio ", "Ladrao de Raios ");
        Livro Harry = new Livro(3, "Harry ", "Harry ", "Ladraoaios ");
        Revista veja = new Revista(2, "janeiro ", "Capitao Europa ");
        Usuario Bob = new Usuario("Pablito ", 1, 3);
        Usuario Djones = new Usuario("Djones", 2, 4, true);
        Biblioteca.cadastrarUsuario(Bob);
        Biblioteca.cadastrarUsuario(Djones);
        
        System.out.println("  --- USUARIOS ---  ");
        for(int j = 0; j < Biblioteca.usuarios.length; j++)
        {
            if(Biblioteca.usuarios[j] != null){
                System.out.println(Biblioteca.usuarios[j].getNome());
            }
        }
        
        Biblioteca.cadastrarItem(veja, Bob);
        
        System.out.println("  --- ITENS ---  ");
        for(int i = 0; i < Biblioteca.acervo.length; i++)
        {
            if(Biblioteca.acervo[i] != null){
                if(Biblioteca.acervo[i].getdisponivel())
                {
                    System.out.println(Biblioteca.acervo[i].getID());
                }
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        Biblioteca.cadastrarItem(veja, Djones);
        Biblioteca.cadastrarItem(Percy, Djones);
        Biblioteca.cadastrarItem(Harry, Djones);
        
        System.out.println("  --- ITENS JA CADASTRADOS ---  ");
        for(int i = 0; i < Biblioteca.acervo.length; i++)
        {
            if(Biblioteca.acervo[i] != null){
                if(Biblioteca.acervo[i].getdisponivel())
                {
                    System.out.println(Biblioteca.acervo[i].getID());
                }
            }
        }
        
        Biblioteca.locarItem(veja, Bob);
        Biblioteca.locarItem(Percy, Djones);
        System.out.println("");
        System.out.println("");
        System.out.println("  --- ITENS LOCADOS ---  ");
        for(int i = 0; i < Biblioteca.acervo.length; i++)
        {
            if(Biblioteca.acervo[i] != null){
                if(Biblioteca.acervo[i].getdisponivel())
                {
                    System.out.println(Biblioteca.acervo[i].getID());
                }
            }
        }
        
        System.out.println("");
        System.out.println("Situaçao da disponibilidade do livro 3: " + Biblioteca.consultarSituacao(3));
        System.out.println("");
        for(int a = 0; a < Bob.getLivrosLocados().length; a++)
        {
            if(Bob.getLivrosLocados()[a] != null){
                System.out.println("ID dos livros locados pelo BOB: " + Bob.getLivrosLocados()[a].getID());
            }
        }
        Biblioteca.devolverItem(veja, Bob);
        for(int a = 0; a < Bob.getLivrosLocados().length; a++)
        {
            if(Bob.getLivrosLocados()[a] != null){
                System.out.println(Bob.getLivrosLocados()[a].getID());
            }
        }
        
        
    }
}
