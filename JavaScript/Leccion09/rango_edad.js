// Ejercicio: Determinar si el usuario esta dentro del rango de edad

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Por favor, ingresa tu edad: ", (input) => {
  let edad = input;
  let valMin = 0,
    valMax = 10;

  if (edad >= valMin && edad <= valMax) {
    console.log("Está dentro del rango establecido");
  } else {
    console.log("Está fuera del rango establecido");
  }

  rl.close();
});
