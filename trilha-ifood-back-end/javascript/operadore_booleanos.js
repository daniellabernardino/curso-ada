//OPERADORES BOLEANOS 

const numero = 10


console.log(numero == 10)
console.log(numero > 20)

console.log(numero == '10') // (==) só compara o conteúdo 
console.log(numero === '10') // (===) Compara o conteúdo e o tipo

console.clear()

console.log(10 != 10)
console.log(10 != '10') // só compara o conteúdo 
console.log(10 !== '10') // Compara o conteúdo e tipo

// CONJUNÇÕES LÓGICAS 

// AND  =>  &&

let idade = 26
let tenhoCNH = true

const possoDirigir = idade >= 18 && tenhoCNH === true

console.log("Posso dirigir?", possoDirigir)

//OR   =>  ||

idade = 40

const votoFacul = idade < 18 || idade >= 70 

//NOT  =>  !

const estouGostandoDoCurso  = false

console.log(!estouGostandoDoCurso)




