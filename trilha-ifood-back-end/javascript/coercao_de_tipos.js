//Coerção (conversão) de tipos 

// 1- Coerção Explícita (Manual)

const numero = 10 

console.log(numero, typeof numero)

const numeroEmString = String(numero)

console.log(numeroEmString, typeof numeroEmString)

console.log(Number('1256'))
console.log(parseFloat('12546.254'))
console.log(Boolean('12255 ')) // Qualquer outro número != de 0 vair ser true, == 0 vai ser false

console.clear()
// 2- Coerção Implícita (Automática)

console.log(10 + "1") // O js converte tudo para texto e concatena (somente quando +)
console.log(10 - "1") // O js converte para número e faz a operação 
console.log('10' * 3) // O js converte para número e faz a operação 
console.log(10 - 'xxxxx') // Ele tenta subtrair e retorna que não é um número  