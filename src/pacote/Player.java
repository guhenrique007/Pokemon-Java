package pacote;

public class Player extends Character{

    public Sexo sexo;
    public String nome;
    public Classe classe;
    
    public Player(int life, int attack,Sexo sexo,String nome,Classe classe) {
        super(life, attack);
        this.sexo = sexo;
        this.nome = nome;
        this.classe = classe;
    }

}