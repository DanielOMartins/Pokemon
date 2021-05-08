import java.util.Scanner;

public class Batalha {
    private Pokemon pokemon;
    private String nomes[];
    private Scanner ler;

    public Batalha(){
        pokemon = new Pokemon();
        nomes = new String[3];
        ler = new Scanner(System.in);
    }

    public void iniciarBatalha(){

    }

    public String[] selecionar(){
        System.out.println("Selecione 3 pokemons: ");
        for (int i = 0; i < 3; i++) {
            nomes[i] = ler.nextLine();
        }
        
        return nomes;
    }

    public void ata (){
        int ata = pokemon.lapras();
        System.out.println(ata);
    }
}
