//Funções

//Definição da função
function sudacao() {
  console.log("Olá, seja bem-vinda(o) ao nosso curso de js!")
}

sudacao()

console.clear()

//Como enviar parâmetros para as funções 

function sudacao(nome, curso = 'JavaScript') { // se não for passado nenhum parametro pra a var curso o valor padrao de curso de JavaScript
  console.log(`Olá ${nome}, seja bem-vinda(o) ao nosso curso de ${curso}!`)
}

//Senão passar nenhum parâmetro o js não da erro, a var só será undefined

sudacao('Daniella', 'js')

//Retorno da função

console.clear()

function soma(numero1, numero2) {
  return numero1 + numero2
  //Quando a função encontra um return ela retorna e encerra a função
}

const resultado = soma(10, 20)

console.log(resultado / 2)

console.clear()

function maiorDoQue50(numero){
    if (numero > 50) {
      return true
    }
    return false
}
