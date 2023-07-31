//LAÇOS CONDICIONAIS

const input = require("readline-sync") // importando biblioteca 

const numeroSorteado = 5 

let numero = Number( input.question("Qual numero voce escolhe? ") )  //Converte o que o usuário digitou pra número

while (numero !== numeroSorteado) {
  console.log("Você errou!Tente novamente...")
  numero = Number( input.question("Qual numero voce escolhe? ") )  
}
console.log("Você acertou!")

