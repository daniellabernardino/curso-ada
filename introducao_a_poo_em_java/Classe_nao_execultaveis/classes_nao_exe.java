import Animais.Cachorro;

public class classes_nao_exe {
  public static void main(String[] args) {
    //Criando o objeto em si 
    //Classe de referência - nome da variavel - cria o novo objeto
    Cachorro cachorro1 = new Cachorro() ;

    //Atribuir valores no objeto 
    cachorro1.nome = "Puppy";
    cachorro1.cor = "Marron";
    cachorro1.altura = 25;
    cachorro1.peso = 5.5;
    cachorro1.tamanhoDoRabo = 5;

    System.out.println(cachorro1); // mostra o endereço do objeto na memoria
  }
}
