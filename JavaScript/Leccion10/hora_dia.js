const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Ingrese la hora: (0 a 23): ", (input) => {
  let horaDia = Number(input);
  let mensaje;

  if (horaDia >= 6 && horaDia <= 11) {
    mensaje = "Good morning";
  } else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "Good afternoon";
  } else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "Good evening";
  } else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "Good night";
  } else {
    mensaje = "Valor incorrecto";
  }

  console.log(mensaje);
  rl.close();
});
