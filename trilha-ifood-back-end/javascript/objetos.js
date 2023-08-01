//Objetos

//Como criar um objeto? 

let pessoa = {
  nome: 'Daniella',
  idade: 19,

}

console.log(pessoa)

console.log(pessoa.nome)
console.log(pessoa.idade)
console.log(pessoa['nome']) //Forma alternativa de acessar

//Como adicionar um par de chave-valor?

pessoa.altura = 1.65

console.log(pessoa)

//Como remover um par de chave-valor?

delete pessoa.altura
console.log(pessoa)

//Como percorrer
console.clear()

for( let chave in pessoa){
  console.log(chave)
}