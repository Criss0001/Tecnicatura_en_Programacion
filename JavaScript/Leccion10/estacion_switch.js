const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Ingrese el número del mes (1 a 12): ", (input) => {
  let mes = Number(input);
  let estacion;

  switch (mes) {
    case 1:
    case 2:
    case 12:
      estacion = "Verano";
      break;
    case 3:
    case 4:
    case 5:
      estacion = "Otoño";
      break;
    case 6:
    case 7:
    case 8:
      estacion = "Invierno";
      break;
    case 9:
    case 10:
    case 11:
      estacion = "Primavera";
      break;
    default:
      estacion = "Valor incorrecto";
  }

  console.log("La estación es: " + estacion);
  rl.close();
});
