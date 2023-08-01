import Animais1.Cachorro1;
import Animais1.Gato;
import Animais1.Passaro;
import Animais1.Animal;
import Lojas.PetShop;

public class modela_orientada_obj {
  public static void main(String[] args) {
  
    Cachorro1 cachorro1 = new Cachorro1("Puppy", "Marron", 25, 3) ;

    // System.out.println(cachorro1.getNumeroDeCachorros());
    
    // Cachorro1 cachorro2 = new Cachorro1("Rex", "Marron", 25, 5.7, 3, "nada") ;
    
    // System.out.println(cachorro2.getNumeroDeCachorros());
    // System.out.println(cachorro1.getNumeroDeCachorros());
    //variavel statica server para as classes
    
    // System.out.println(cachorro1.toString());
    // System.out.println(cachorro2.toString());
    //Mostra 2 endereços de memmória diferente, cada obj possui um endereço de memoria diferente
    
    Gato gato1 = new Gato("Lulu","Branco", 6.5);
    Passaro passaro1 = new Passaro("Zeca","Verde", 2.5);
    
    // cachorro1.soar();
    // gato1.soar();
    // passaro1.soar();

    PetShop petShop = new PetShop();

    petShop.darBanho(cachorro1);
    System.out.println(cachorro1.getEstadoDoEspirito() );

    petShop.darBanho(gato1);
    System.out.println(gato1.getEstadoDoEspirito() );

    petShop.tosar(cachorro1);
    System.out.println(passaro1.getEstadoDoEspirito());
    
    // Gato gato2 = new Gato("Lulu","Branco", 6.5);

    Animal gato3 = new Gato("Lulu","Branco", 6.5);
    System.out.println(gato3.getEstadoDoEspirito() );
    // //Animal = classe de ref  ------ Gato = classe verdadeira 

    // //Gato gato4 = new Animal("Lulu","Branco", 6.5);
    // //Não é possivel pois nem todo animal é um gato 

    // Animal gato5 = new Animal("Lulu","Branco", 6.5);
    //não é possivel cria um objeto pode vir um objeto em si(classe pai)
    //por isso cria -se as classe abstratas, não tem coisas concretas, serve como um mapa 
  }
   
}
