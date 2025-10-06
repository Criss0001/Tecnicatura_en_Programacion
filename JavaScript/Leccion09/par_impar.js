// Ejercicio: Número par o impar

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Ingresa un número para saber si es par: ', (input) => {
  const numero = parseInt(input);

  if (!isNaN(numero)) {
    if (numero % 2 === 0) {
      console.log(`El número ${numero} es par.`);
    } else {
      console.log(`El número ${numero} es impar.`);
    }
  } else {
    console.log('Por favor, ingresa un número válido.');
  }

  rl.close();
});


