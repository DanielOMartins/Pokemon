import java.util.Scanner;
import java.util.Random;

public class Batalha {
    private Pokemon pokemon;
    private Random rand;
    private int aux;
    private String nomes[], pokesBot[];
    private String nomesBot[] = {"charizard", "Ho-Ho", "vulpix", "magmar", "pikachu", "ampharos", "dedenne", "jolteon", "bayleef", "treecko", "shaymin", "bulbasaur", "totodile", "squirtle", "lapras", "maril"};
    private Scanner ler;

    public Batalha(){
        pokemon = new Pokemon();
        nomes = new String[3];
        pokesBot = new String[3];
        rand = new Random();
        ler = new Scanner(System.in);
        
    }

    public void iniciarBatalha(){

    }

    public String[] selecionarPoke(){
        System.out.println("Selecione 3 pokemons: ");
        for (int i = 0; i < 3; i++) {
            nomes[i] = ler.nextLine();
        }
        
        return nomes;
    }

    public void mostrarPoke(String[] jog){
        for (int i = 0; i < 2; i++) {
            System.out.printf("%s, ", jog[i]);
        }
        System.out.printf("%s.", jog[2]);
    }
}
