public class Pokemon {
    private String nome, tipo;
    private int ata, def, agil, hp, atributo;

    public Pokemon(){
    }
    
    public int selecionarPoke(String nome, int op){
        if(nome == "charmander"){
            return atributo = charmander(op);
        }
        if(nome == "hoho"){
            return atributo = hoho(op);
        }
        if(nome == "vulpix"){
            return atributo = vulpix(op);
        }
        if(nome == "magmar"){
            return atributo = magmar(op);
        }
        if(nome == "pikachu"){
            return atributo = pikachu(op);
        }
        if(nome == "ampharos"){
            return atributo = ampharos(op);
        }
        if(nome == "dedenne"){
            return atributo = dedenne(op);
        }
        if(nome == "jolteon"){
            return atributo = jolteon(op);
        }
        if(nome == "bayleef"){
            return atributo = bayleef(op);
        }
        if(nome == "treecko"){
            return atributo = treecko(op);
        }
        if(nome == "shaymin"){
            return atributo = shaymin(op);
        }
        if(nome == "bulbasaur"){
            return atributo = bulbasaur(op);
        }
        if(nome == "totodile"){
            return atributo = totodile(op);
        }
        if(nome == "squirtle"){
            return atributo = squirtle(op);
        }
        if(nome == "lapras"){
            return atributo = lapras(op);
        }
        if(nome == "maril"){
            return atributo = maril(op);
        }
        return 0;
    }
    //Fogo
    public int charmander(int op){
        nome = "Charizard";
        tipo = "fogo";
        if(op == 1){return ata = 4000;}
        if(op == 2){return def = 7000;}
        if(op == 3){return agil = 35;}
        if(op == 4){hp = 25000;}
        return 0;
    }
    public int hoho(int op){
        nome = "Ho-Ho";
        tipo = "fogo";
        if(op == 1){return ata = 10000;}
        if(op == 2){return def = 6000;}
        if(op == 3){return agil = 40;}
        if(op == 4){hp = 40000;}
        return 0;
    }
    public int vulpix(int op){
        nome = "Vulpix";
        tipo = "fogo";
        if(op == 1){return ata = 3000;}
        if(op == 2){return def = 5000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 20000;}
        return 0;
    }
    public int magmar(int op){
        nome = "Magmar";
        tipo = "fogo";
        if(op == 1){return ata = 5000;}
        if(op == 2){return def = 4000;}
        if(op == 3){return agil = 25;}
        if(op == 4){hp = 50000;}
        return 0;
    }
    //Eletricidade
    public int pikachu(int op){
        nome = "Pikachu";
        tipo = "elétrico";
        if(op == 1){return ata = 7000;}
        if(op == 2){return def = 8000;}
        if(op == 3){return agil = 40;}
        if(op == 4){hp = 20000;}
        return 0;
    }
    public int ampharos(int op){
        nome = "Ampharos";
        tipo = "elétrico";
        if(op == 1){return ata = 9000;}
        if(op == 2){return def = 10000;}
        if(op == 3){return agil = 35;}
        if(op == 4){hp = 50000;}
        return 0;
    }
    public int dedenne(int op){
        nome = "Dedenne";
        tipo = "elétrico";
        if(op == 1){return ata = 4000;}
        if(op == 2){return def = 4000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 35000;}
        return 0;
    }
    public int jolteon(int op){
        nome = "Jolteon";
        tipo = "elétrico";
        if(op == 1){return ata = 5000;}
        if(op == 2){return def = 5000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 45000;}
        return 0;
    }
    //Terra
    public int bayleef(int op){
        nome = "Bayleef";
        tipo = "terra";
        if(op == 1){return ata = 9000;}
        if(op == 2){return def = 6000;}
        if(op == 3){return agil = 20;}
        if(op == 4){hp = 50000;}
        return 0;
    }
    public int treecko(int op){
        nome = "Treecko";
        tipo = "terra";
        if(op == 1){return ata = 6000;}
        if(op == 2){return def = 6000;}
        if(op == 3){return agil = 35;}
        if(op == 4){hp = 35000;}
        return 0;
    }
    public int shaymin(int op){
        nome = "Shaymin";
        tipo = "terra";
        if(op == 1){return ata = 3000;}
        if(op == 2){return def = 7000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 45000;}
        return 0;
    }
    public int bulbasaur(int op){
        nome = "Bulbasaur";
        tipo = "terra";
        if(op == 1){return ata = 7000;}
        if(op == 2){return def = 2000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 10000;}
        return 0;
    }
    //Água
    public int totodile(int op){
        nome = "Totodile";
        tipo = "água";
        if(op == 1){return ata = 7000;}
        if(op == 2){return def = 3000;}
        if(op == 3){return agil = 30;}
        if(op == 4){hp = 35000;}
        return 0;
    }
    public int squirtle(int op){
        nome = "Squirtle";
        tipo = "água";
        if(op == 1){return ata = 6000;}
        if(op == 2){return def = 5000;}
        if(op == 3){return agil = 40;}
        if(op == 4){hp = 30000;}
        return 0;
    }
    public int lapras(int op){
        nome = "Lapras";
        tipo = "água";
        if(op == 1){return ata = 10000;}
        if(op == 2){return def = 5000;}
        if(op == 3){return agil = 50;}
        if(op == 4){hp = 40000;}
        return 0;
    }
    public int maril(int op){
        nome = "Maril";
        tipo = "água";
        if(op == 1){return ata = 3000;}
        if(op == 2){return def = 5000;}
        if(op == 3){return agil = 40;}
        if(op == 4){hp = 40000;}
        return 0;
    }    
}
