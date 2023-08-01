package Animais1;

public class Cachorro1 extends Animal{
  
  //variavel estatica
  static int numeroDeCachorros;

  private int tamanhoDoRabo;

  public Cachorro1(String nome, String cor, double peso, int tamanhoDoRabo){
    super(nome, cor, peso);
    this.tamanhoDoRabo = tamanhoDoRabo;
    
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
  @Override //Pega um método do pai daquela classe e altera o resultado dele
  public String toString(){
    return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
  }

  @Override
  public void soar(){
    System.out.println("AU! AU!");
  }
}
