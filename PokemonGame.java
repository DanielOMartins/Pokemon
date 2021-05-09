public class PokemonGame {
    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        String jogador1[] = new String[3];
        String jogador2[] = new String[3];

        jogador1 = batalha.selecionarPoke();
        batalha.mostrarPoke(jogador1);
        
    }
}
