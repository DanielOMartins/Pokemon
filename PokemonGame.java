public class PokemonGame {
    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        String jogador1[] = new String[3];
        String jogador2[] = new String[3];
        char resp;
        
        batalha.iniciarJogo();
        
        do{
            jogador1 = batalha.escolherPokes(1);
            jogador2 = batalha.escolherPokes(2);
        
             batalha.iniciarBatalha(jogador1, jogador2);
             resp = batalha.jogarDnv();
        }while(resp == 's');
       
        
    }
}
