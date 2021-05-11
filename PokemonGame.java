public class PokemonGame {
    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        String jogador1[] = new String[6];
        String jogador2[] = new String[6];
        char resp;
        
        //Inicio o jogo e as regras
        batalha.iniciarJogo();
        
        //O jogo começa com as escolhas de pokemon e só termina se os jogadores não quiserem mais jogar
        do{
            jogador1 = batalha.escolherPokes(1);
            jogador2 = batalha.escolherPokes(2);
        
             batalha.iniciarBatalha(jogador1, jogador2);
             resp = batalha.jogarDnv();
        }while(resp == 's'); 
    }
}
