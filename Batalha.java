import java.util.Scanner;
public class Batalha {
    private Pokemon pokemon;
    private Scanner ler, ler1, resp;
    private int op, op1, op2, escolher, tipo1, tipo2, vencedor, count1, count2, fim;
    private Double atributo1, atributo2;

    public Batalha(){
        pokemon = new Pokemon();
        ler = new Scanner(System.in);
        ler1 = new Scanner(System.in);
        resp = new Scanner(System.in);
    }

    //Inicia o jogo mostrando algumas regras
    public void iniciarJogo(){
        System.out.println("\n**************** Bem vindo ao Pokemon!! ****************");
        System.out.println("Aqui você e seu amigo vão batalhar duelos para descobrir quem é o melhor treinador.\n");
        
        System.out.println("\n\n************ Como jogar ************\n");
        System.out.println("- Cada jogador deve escolher 6 Pokemons (se certifique de digitar o nome do pokemon corretamente).");
        System.out.println("- Depois devem escolher um entre eles para uma batalha de atributos.");
        System.out.println("- O primeiro a ganhar 3 dos embates vence a rodada, caso de empate os dois saem desmaiados.");
        System.out.println("- Quem tiver todos os seus pokemons desmaiados perde.");

        System.out.println("\n\n************ Pokemons ************\n");
        System.out.println("Fogo:\nCharmander - Hoho - Vulpix - Magmar");
        System.out.println("Elétrico:\nPikachu - Ampharos - Dedenne - Jolteon");
        System.out.println("Grama:\nBayleef - Treecko - Shaymin - Bulbasaur");
        System.out.println("Água:\nTotodile - Squirtle - Lapras - Maril\n");
    }

    //É onde o jogar faz a escolha de seus Pokemons
    public String[] escolherPokes(int num){
        String nomes[] = {"", "", "", "", "", ""};
        System.out.printf("\nJogador %d selecione 6 pokemons:\n", num);
        for (int i = 0; i < 6; i++) {
            nomes[i] = ler.nextLine();
            nomes[i] = nomes[i].toLowerCase();
        }
        
        return nomes;
    }

    //É onde mostra para o jogador os Pokemons escolhidos
    public void mostrarPoke(String[] jog){
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d - %s\n",(i + 1), jog[i]);
        }
        System.out.printf("%d - %s\n", 6,  jog[5]);
    }

    //O jogador seleciona com qual pokemon vai batalhar
    public int pokeBatalha(String[] poke, int num){
        System.out.printf("jogador %d: \n", num);
        mostrarPoke(poke);
        System.out.printf("Escolha o seu pokemon (escolha usando o número de referência): ");
        op = ler1.nextInt();
        System.out.println("");
        return op;

    }

    //Inicia e desenvolve toda a batalha entre os jogadores
    public void iniciarBatalha(String[] jog1, String[] jog2){
        System.out.println("\n****************A batalha vai começar!!****************");
        int num;
        for (int i = 0; i < 12; i++) { //Esse for representa a quantidade total possível de batalhas
            op1 = pokeBatalha(jog1, 1);
            op2 = pokeBatalha(jog2, 2);

            count1 = 0;
            count2 = 0;
            for (int j = 0; j < 4; j++) { //Esse for representa a rodada de batalhas entre dois pokemons
                if(vencedor == 0){
                    num = 1;
                }else{
                    num = 2;
                }
                //Aqui o vencedor da rodada anterior seleciona o atributo a ser disputado
                System.out.printf("jogador %d escolha um atributo para batalhar:\n", num);
                System.out.println("1 - Ataque");
                System.out.println("2 - Defesa");
                System.out.println("3 - Agilidade");
                System.out.println("4 - HP");
                System.out.printf("Escolha: ");
                escolher = ler1.nextInt();
                  
                //Aqui retornamos o tipo e o qual o valor do atributo escolhido do pokemon
                atributo1 = pokemon.selecionarPoke(jog1[op1 - 1], escolher);
                tipo1 = verificarTipo(jog1[op1 - 1]);
                                    
                atributo2 = pokemon.selecionarPoke(jog2[op2 - 1], escolher);
                tipo2 = verificarTipo(jog2[op2 - 1]);

                //Verifica se os atributos vão ser super efetivos ou não
                atributo1 = efetividade(atributo1, tipo1, tipo2);
                atributo2 = efetividade(atributo2, tipo2, tipo1);

                System.out.printf("\nAtributo %s: %.0f\n", jog1[op1 - 1],  atributo1);
                System.out.printf("Atributo %s: %.0f\n\n", jog2[op2 - 1], atributo2);
            
                //retorna o vencedor da batalha onde 0 é o jogador 1 e 1 é o jogador 2
                vencedor = batalha(atributo1, atributo2, jog1[op1 - 1], jog2[op2 - 1]);

                if(vencedor == 0){
                    count1++;
                }else{
                    count2++;
                }

                //É onde se verifica quem foi o vencedor da rodada
                if(count1 == 3){
                    jog2[op2 - 1] = "Desmaiado";
                    System.out.println("\nJogador 1 foi o vencedor da rodada!!");
                    j = 4;
                }    
                if(count2 == 3){
                    jog1[op1 - 1] = "Desmaiado";
                    System.out.println("\nJogador 2 foi o vencedor da rodada!!");
                    j = 4;
                }
                if(count1 == 2 && count2 == 2){
                    jog1[op1 - 1] = "Desmaiado";
                    jog2[op2 - 1] = "Desmaiado";
                    System.out.println("Houve um empate!!");
                }
            }
            System.out.println("*********************************\n");
            //Ao final de cada rodada verifica se algum jogador perdeu todos os pokemos e declara o vencedor
            fim = verficarGanhador(jog1, jog2);
            if(fim == 1){
                i = 11;
            }
        }
        System.out.println("\nPokemons jogador 1:");
        mostrarPoke(jog1);
        System.out.println("\nPokemons jogador 2:");
        mostrarPoke(jog2);
    }

    //É onde ocorre toda a batalha dos atributos escolhidos
    public int batalha(double atributo1, double atributo2, String poke1, String poke2){
        int vencedor;
        if(atributo1 > atributo2){
            System.out.println("Jogador 1 venceu a rodada.");
            return vencedor = 0;
        }else{
            System.out.println("Jogador 2 venceu a rodada.");
            return vencedor = 1;
        }
    }

    //Verifica o tipo do pokemon
    public int verificarTipo(String poke){
        // 1 - fogo, 2 - eletrico, 3 - planta, 4 - água
        int tipo;
        if(poke.equals("charmander") || poke.equals("magmar") || poke.equals("hoho") || poke.equals("vulpix")){
            return tipo = 1;
        }
        if(poke.equals("pikachu") || poke.equals("ampharos") || poke.equals("dedenne") || poke.equals("dedenne")){
            return tipo = 2;
        }
        if(poke.equals("bayleef") || poke.equals("treecko") || poke.equals("shaymin") || poke.equals("bulbasaur")){
            return tipo = 3;
        }
        if(poke.equals("totodile") || poke.equals("totodile") || poke.equals("lapras") || poke.equals("maril")){
            return tipo = 4;
        }
        return 0;
    }

    //Verifica se o atributo recebe efetividade devido aos tipos dos pokemons
    public double efetividade(Double atributo, int tipo1, int tipo2){
        if(tipo1 == 1 && tipo2 == 3){
            System.out.println("\nAtaque super efetivo!!");
            return atributo * 1.5;
        }
        if(tipo1 == 2 && tipo2 == 4){
            System.out.println("\nAtaque super efetivo!!");
            return atributo * 1.5;
        }
        if(tipo1 == 3 && tipo2 == 2){
            System.out.println("\nAtaque super efetivo!!");
            return atributo * 1.5;
        }
        if(tipo1 == 4 && tipo2 == 1){
            System.out.println("\nAtaque super efetivo!!");
            return atributo * 1.5;
        }
        return atributo;
    }

    //Verifica quem foi o ganhador da rodada
    public int verficarGanhador(String[] jog1, String[] jog2){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < jog1.length; i++) {
            if(jog1[i].equals("Desmaiado")){
                count1++;
            }
        }
        for (int j = 0; j < jog2.length; j++) {
            if(jog2[j].equals("Desmaiado")){
                count2++;
            }
        }
        if(count1 == 6){
            System.out.println("O jogador 2 venceu!!");
            return 1;
        }
        if(count2 == 6){
            System.out.println("O jogador 1 venceu!!");
            return 1;
        }
        return 0;
    }

    //Verifica se os jogadores desejam jogar novamente
    public char jogarDnv(){
        System.out.println("Deseja continuar jogando? (s/n)");
        return resp.next().charAt(0);
    }
}
