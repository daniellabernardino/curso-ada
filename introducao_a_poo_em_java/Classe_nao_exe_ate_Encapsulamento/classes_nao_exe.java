import Animais.Cachorro;

public class classes_nao_exe {
  public static void main(String[] args) {
    //Criando o objeto em si 
    //Classe de referência - nome da variavel - cria o novo objeto
    Cachorro cachorro1 = new Cachorro() ;
     //Atribuir valores no objeto 
    Cachorro cachorro2 = new Cachorro("Puppy", "Marron", 25, 5.7, 3, "nada") ;


    //System.out.println(cachorro1); mostra o endereço do objeto na memoria

    System.out.println(cachorro2.getNome());
    System.out.println(cachorro2.getCor());

    //Chamando um método
    cachorro1.latir(); //Ira retorna au au 

    System.out.println("O cachorro pegou uma " + cachorro1.pegar());

    System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
    System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
  }
}
