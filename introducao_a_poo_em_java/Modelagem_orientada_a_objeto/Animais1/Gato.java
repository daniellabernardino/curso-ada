package Animais1;

public class Gato extends Animal{
  
  static int numeroDeGatos;

  public Gato(String nome, String cor, double peso) {
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
    System.out.println("MIAU MIAU!");
  }
}
