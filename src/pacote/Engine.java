package pacote;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;



public class Engine {
    
    public static  Sexo s; 
    public static  String nome;
    public static  Classe classe;
    
    
    
    public static void main(String[] args) throws IOException {
        Book book = Engine.createBook();
        
        
        System.out.println("test");
        //new Inicio().setVisible(true);
        Inicio.main(args);
        
        
  
       
}

            public static Book createBook(){
                Book livro = new Book();
                return livro;
            }
            
            public static void createPlayer(){
                Player p = new Player(100,50,s,nome,classe);
                System.out.println("Player criado:");
                System.out.println("seu sexo e:" + s);
            }
            
            
            
            
            
            
}