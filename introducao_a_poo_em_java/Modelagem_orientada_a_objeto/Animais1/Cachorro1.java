package Animais1;

public class Cachorro1 {
  
  //variavel estatica
  static int numeroDeCachorros;

  private String nome;
  private String cor;
  private int altura;
  private double peso;
  private int tamanhoDoRabo;
  private String estadoDoEspirito;

  public Cachorro1(){}

  public Cachorro1(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDoEspirito){
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDoEspirito = estadoDoEspirito;
    
    //contagem de numeros de cachorros adicionados
    numeroDeCachorros ++;
  }

  public static int getNumeroDeCachorros(){ return numeroDeCachorros;}

  public static void setNumeroDeCachorros(int numeroDeCachorros){
      Cachorro1.numeroDeCachorros = numeroDeCachorros;
  }
  
  public String getNome(){ return this.nome; }

  
  public void setNome(String nome){ this.nome = nome; }

  public String getCor(){ return this.cor;  }

  public void setCor(String cor){ this.cor = cor;  }

  public int getAltura(){ return this.altura; }

  public void setAltura(int altura){ this.altura = altura;  }

  public double getPeso(){ return this.peso;  }

  public void setPeso(double peso){ this.peso = peso;   }

  public int getTamanhoDoRabo(){ return this.tamanhoDoRabo;   }

  public void setTamanhoDoRabo(int tamanhoDoRabo){ this.tamanhoDoRabo = tamanhoDoRabo;   }

  public String getEstadoDoEspirito(){ return this.estadoDoEspirito;  }

  public void comer(){} 

  public void latir(){
    System.out.println("AU AU!");
  }

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
  @Override
  public String toString(){
    return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
  }
}
