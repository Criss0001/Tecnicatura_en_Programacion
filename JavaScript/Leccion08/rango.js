//  Ejercicio: Determinar si es mayor de edad

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question(
  "Ingrese un número para ver si esta dentro del rango: ",
  (input) => {
    let min = 45;
    let max = 55;

    if (input >= min && input <= max) {
      console.log("Dentro del rango");
    } else {
      console.log("Fuera del rango");
    }

    rl.close();
  }
);
