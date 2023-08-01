import Animais1.Cachorro1;

public class modela_orientada_obj {
  public static void main(String[] args) {
  
    Cachorro1 cachorro1 = new Cachorro1("Puppy", "Marron", 25, 5.7, 3, "nada") ;

    // System.out.println(cachorro1.getNumeroDeCachorros());
    
    Cachorro1 cachorro2 = new Cachorro1("Rex", "Marron", 25, 5.7, 3, "nada") ;
    
    // System.out.println(cachorro2.getNumeroDeCachorros());
    // System.out.println(cachorro1.getNumeroDeCachorros());
    //variavel statica server para as classes
    
    System.out.println(cachorro1.toString());
    System.out.println(cachorro2.toString());
    //Mostra 2 endereços de memmória diferente, cada obj possui um endereço de memoria diferente
    
    
 
  }
   
}
