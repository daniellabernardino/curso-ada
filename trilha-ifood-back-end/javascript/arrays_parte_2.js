//Arrays parte 2 - Métodos de array 

let arr1 = [30, 12, 45, 34, 29]
let arr2 = []

//Fatiamento : slice 

console.log(arr1.slice(0, 2)) // O ultimo parâmetro é exclusivo(só até < 2)
console.log(arr1.slice(2)) // A partir do indice até o final

console.clear()

//Adicionando elementos: push | unshift

console.log('Antes de add: ', arr2)

arr2.push(10, 20)
arr2.push(40)//Com o push o elemento é adicionado no final do array

console.log('Depois de add: ', arr2)

console.log('Antes de add com unshift: ', arr2)

arr2.unshift(0) //Unshift adiciona o elemento no inicio do array 

console.clear()

//Removendo elemento pop | shift

console.log("Antes de remover com o pop: ", arr2)

const elementoRemovido = arr2.pop() //Remove o ultimo elemento 

console.log("Depois de remover com o pop: ", arr2)
console.log("O elemnto removido foi: ", elementoRemovido)

console.log("Antes de remover com o shift: ", arr2)

arr2.shift() //Remove o primeiro elemento 

console.log("Depois de remover com o shift: ", arr2)

//Concatenando arrays: concat

console.clear()

console.log('Array 1 : ', arr1)
console.log('Array 2 : ', arr2)

console.log(arr1.concat(arr2))
console.log(arr2.concat(arr1))

//Buscando elementos: indexOf | lastIndexOf

console.clear()

console.log(arr1)

let indiceDoElement34 = arr1.indexOf(34) 
console.log(indiceDoElement34)
// Se a função retornar -1 é pq o elemento não existe no array

let arr3 = [1, 2, 3, 3, 5, 3]
console.log(arr3.indexOf(3))
//Se tiver mais que um elemento ele sempre retorna o indice do primeiro

console.log(arr3.lastIndexOf(3)) 
//Procura o onde está o ultimos elemento 3 


//Descobrindo a existência de um elemento: includes
console.clear()

console.log(arr1)

console.log(arr1.includes(10))//Retorna true or false 



//Invertendo arrays: reverse 

console.clear()

console.log('Array 1 normal: ', arr1)

const arr1Invertido = arr1.reverse()
console.log('Array 1 invertido: ', arr1Invertido)
