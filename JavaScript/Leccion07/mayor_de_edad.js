//  Ejercicio: Determinar si es mayor de edad

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Por favor, ingresa tu edad: ', (input) => {
  const edad = parseInt(input);
  if (!isNaN(edad)) {
    if (edad >= 18) {
      console.log('Eres mayor de edad.');
    } else {
      console.log('Eres menor de edad.');
    }
  } else {
    console.log('Por favor, ingresa un número válido.');
  }

  rl.close();
});




