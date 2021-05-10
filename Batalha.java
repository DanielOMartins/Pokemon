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

    public void iniciarJogo(){
        System.out.println("****************Bem vindo ao Pokemon!!****************");
        System.out.println("Aqui você e seu amigo vão batalhar duelos para descobrir quem é o melhor treinador.\n");
        //Adicionar todas as 16 opções de pokemons
    }

    public String[] escolherPokes(int num){
        System.out.printf("Jogador %d selecione 3 pokemons:\n", num);
        for (int i = 0; i < 3; i++) {
            nomes[i] = ler.nextLine();
        }
        
        return nomes;
    }

    public void mostrarPoke(String[] jog){
        for (int i = 0; i < 2; i++) {
            System.out.printf("%d - %s\n",(i + 1), jog[i]);
        }
        System.out.printf("%d - %s\n", 3,  jog[2]);
    }

    public void iniciarBatalha(){
        
    }
}
