const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Ingrese su edad: ", (input) => {
  const edad = Number(input);

  if (isNaN(edad)) {
    console.log("Esta variable no contiene solo números");
  } else {
    if (edad >= 18) {
      console.log("Puede votar");
    } else {
      console.log("Muy joven para votar");
    }

    const resultado = edad >= 18 ? "Puede votar" : "Muy joven para votar";
    console.log("Resultado con operador ternario:", resultado);
  }

  rl.close();
});
