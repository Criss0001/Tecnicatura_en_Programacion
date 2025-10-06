const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Está de vacaciones? (si/no): ", (respuesta1) => {
  rl.question("Es día de descanso? (si/no): ", (respuesta2) => {
    const vacaciones = respuesta1.toLowerCase() === "si";
    const diaDescanso = respuesta2.toLowerCase() === "si";

    if (vacaciones || diaDescanso) {
      console.log("El padre puede asistir al juego de su hijo");
    } else {
      console.log("El padre no puede asistir al juego de su hijo");
    }

    rl.close();
  });
});
