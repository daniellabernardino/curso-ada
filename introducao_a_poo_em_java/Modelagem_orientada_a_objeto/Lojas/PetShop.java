package Lojas;
import Animais1.Animal;
import Animais1.Cachorro1;

//Polimorfimos, capacidade de um objeto ser referenciado de várias formas 

public class PetShop {

  public void darBanho(Animal animal){
    animal.setEstadoDoEspirito("Limpo");

  }
  
  public void tosar(Cachorro1 cachorro1){
    cachorro1.setEstadoDoEspirito("Tosado");
  }

  public void deixarNoHotel(Animal animal){
    animal.setEstadoDoEspirito("com saudades");
  }

}
