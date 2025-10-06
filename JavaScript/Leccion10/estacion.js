const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Ingrese el número del mes (1 a 12): ", (input) => {
  let mes = Number(input);
  let estacion;

  if (mes === 1 || mes === 2 || mes === 12) {
    estacion = "Verano";
  } else if (mes === 3 || mes === 4 || mes === 5) {
    estacion = "Otoño";
  } else if (mes === 6 || mes === 7 || mes === 8) {
    estacion = "Invierno";
  } else if (mes === 9 || mes === 10 || mes === 11) {
    estacion = "Primavera";
  } else {
    estacion = "Valor incorrecto";
  }

  console.log("El valor corresponde a la estación de: " + estacion);
  rl.close();
});
