public class Pokemon {
    //Essa classe funciona basicamente como um banco de dados
    //Ela guarda o valor dos atributos de cada pokemon
    //E retorna eles quando é pedido

    private static Double ata, def, agil, hp;
    
    //Recebe o nome do pokemon em batalha e o atributo escolhido, e retorna o valor de atributo no metodo conrrespondente
    public double selecionarPoke(String nome, int op){
        if(nome.equals("charmander")){
            return charmander(op);
        }
        if(nome.equals("hoho")){
            return hoho(op);
        }
        if(nome.equals("vulpix")){
            return vulpix(op);
        }
        if(nome.equals("magmar")){
            return magmar(op);
        }
        if(nome.equals("pikachu")){
            return pikachu(op);
        }
        if(nome.equals("ampharos")){
            return ampharos(op);
        }
        if(nome.equals("dedenne")){
            return dedenne(op);
        }
        if(nome.equals("jolteon")){
            return jolteon(op);
        }
        if(nome.equals("bayleef")){
            return bayleef(op);
        }
        if(nome.equals("treecko")){
            return treecko(op);
        }
        if(nome.equals("shaymin")){
            return shaymin(op);
        }
        if(nome.equals("bulbasaur")){
            return bulbasaur(op);
        }
        if(nome.equals("totodile")){
            return totodile(op);
        }
        if(nome.equals("squirtle")){
            return squirtle(op);
        }
        if(nome.equals("lapras")){
            return lapras(op);
        }
        if(nome.equals("maril")){
            return maril(op);
        }
        return 0;
    }
    //Cada método representa um pokemon e guarda os atributos
    //Fogo
    public double charmander(int op){
        if(op == 1){return 4000.0;}
        if(op == 2){return 7000.0;}
        if(op == 3){return 35.0;}
        if(op == 4){return 25000.0;}
        return 10;
    }
    public double hoho(int op){
        if(op == 1){return 10000.0;}
        if(op == 2){return 6000.0;}
        if(op == 3){return 40.0;}
        if(op == 4){return hp = 40000.0;}
        return 0;
    }
    public double vulpix(int op){
        if(op == 1){return ata = 3000.0;}
        if(op == 2){return def = 5000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 20000.0;}
        return 0;
    }
    public double magmar(int op){
        if(op == 1){return ata = 5000.0;}
        if(op == 2){return def = 4000.0;}
        if(op == 3){return agil = 25.0;}
        if(op == 4){return hp = 50000.0;}
        return 0;
    }
    //Eletricidade
    public double pikachu(int op){
        if(op == 1){return ata = 7000.0;}
        if(op == 2){return def = 8000.0;}
        if(op == 3){return agil = 40.0;}
        if(op == 4){return hp = 20000.0;}
        return 0;
    }
    public double ampharos(int op){
        if(op == 1){return ata = 9000.0;}
        if(op == 2){return def = 10000.0;}
        if(op == 3){return agil = 35.0;}
        if(op == 4){return hp = 50000.0;}
        return 0;
    }
    public double dedenne(int op){
        if(op == 1){return ata = 4000.0;}
        if(op == 2){return def = 4000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 35000.0;}
        return 0;
    }
    public double jolteon(int op){
        if(op == 1){return ata = 5000.0;}
        if(op == 2){return def = 5000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 45000.0;}
        return 0;
    }
    //Terra
    public double bayleef(int op){
        if(op == 1){return ata = 9000.0;}
        if(op == 2){return def = 6000.0;}
        if(op == 3){return agil = 20.0;}
        if(op == 4){return hp = 50000.0;}
        return 0;
    }
    public double treecko(int op){
        if(op == 1){return ata = 6000.0;}
        if(op == 2){return def = 6000.0;}
        if(op == 3){return agil = 35.0;}
        if(op == 4){return hp = 35000.0;}
        return 0;
    }
    public double shaymin(int op){
        if(op == 1){return ata = 3000.0;}
        if(op == 2){return def = 7000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 45000.0;}
        return 0;
    }
    public double bulbasaur(int op){
        if(op == 1){return ata = 7000.0;}
        if(op == 2){return def = 2000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 10000.0;}
        return 0;
    }
    //Água
    public double totodile(int op){
        if(op == 1){return ata = 7000.0;}
        if(op == 2){return def = 3000.0;}
        if(op == 3){return agil = 30.0;}
        if(op == 4){return hp = 35000.0;}
        return 0;
    }
    public double squirtle(int op){
        if(op == 1){return ata = 6000.0;}
        if(op == 2){return def = 5000.0;}
        if(op == 3){return agil = 40.0;}
        if(op == 4){return hp = 30000.0;}
        return 0;
    }
    public double lapras(int op){
        if(op == 1){return ata = 10000.0;}
        if(op == 2){return def = 5000.0;}
        if(op == 3){return agil = 50.0;}
        if(op == 4){return hp = 40000.0;}
        return 0;
    }
    public double maril(int op){
        if(op == 1){return ata = 3000.0;}
        if(op == 2){return def = 5000.0;}
        if(op == 3){return agil = 40.0;}
        if(op == 4){return hp = 40000.0;}
        return 0;
    }
}
