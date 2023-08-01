package Animais1;

public class Passaro extends Animal {

  static int numeroDePassaros;

  
  public Passaro(String nome, String cor, double peso) {
    super(nome, cor, peso);
    
  }
  
  @Override
  public String toString(){
    return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
  }

  @Override
  public void soar(){
    System.out.println("PIU PIU!");
  }

}

