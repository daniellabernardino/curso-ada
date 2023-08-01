package Animais;

//Criando a classe cachorro ( molde para objeto)
//Ordem: cria os atributos, cria os construtore, cria os métodos

public class Cachorro {
  //ATRIBUTOS

  //private, somente a própia classe pode acessar
  private String nome;
  private String cor;
  private int altura;
  private double peso;
  private int tamanhoDoRabo;
  private String estadoDoEspirito;

  //CONSTRUTORES

  //Execultam a construção do objeto
  //Construtor padrão, cria o objt com valores defaut
  public Cachorro(){}

  //Construtores adicionados
  public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDoEspirito){
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDoEspirito = estadoDoEspirito;
  }

  //MÉTODOS

  //Encapsulando um objeto - Getter e Setter

  //Atraves do método get é possivel controlar regras
  public String getNome(){ //get pega
    return this.nome; 
  }

  //Atraves do set é possivel validar como sera add o atributo 
  public void setNome(String nome){ //set recebe o que sera addcionado 
    this.nome = nome; //passa o nome que esta recebendo para o atributo 
  }

  public String getCor(){ 
    return this.cor; 
  }

  public void setCor(String cor){ 
    this.cor = cor; 
  }

  public int getAltura(){ 
    return this.altura; 
  }

  public void setAltura(int altura){ 
    this.altura = altura; 
  }

  public double getPeso(){ 
    return this.peso; 
  }

  public void setPeso(double peso){ 
    this.peso = peso; 
  }

  public int getTamanhoDoRabo(){ 
    return this.tamanhoDoRabo; 
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo){ 
    this.tamanhoDoRabo = tamanhoDoRabo; 
  }

  public String getEstadoDoEspirito(){ 
    return this.estadoDoEspirito; 
  }

  //Definindo um metodo ( as ações)
  //método publico, sem retorno com nome comer, não recebe variável, e não faz nada
  public void comer(){} 

  //método publico, sem retorno com nome latir, não recebe variável, e quando chamado ele faz au au
  public void latir(){
    System.out.println("AU AU!");
  }

  //método publico, com retorno, com nome pegar, não recebe variável, e quando chamado ele retorna bolinha
  public String pegar(){
    return "Bolinha"; 
  }

  public String interagir(String acao){

    switch (acao) {
      case "carinho":  this.estadoDoEspirito = "Feliz!"; break;
      case "vai dormir":  this.estadoDoEspirito = "Bravo:("; break;
      case "pisar na patinha":  this.estadoDoEspirito = "Triste:("; break;
      default: this.estadoDoEspirito = "Neutro";
        break;
    }    
    return estadoDoEspirito;
  }
}
