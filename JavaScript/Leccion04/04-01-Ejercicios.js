//Ejercicio 1: Calcular estación del año
let mes =  5;
let estacion;
if (mes === 12 || mes === 1 || mes === 2) {
    estacion = "Verano";
}
else if (mes === 3 || mes === 4 || mes === 5) {
    estacion = "Otoño";
}
else if (mes === 6 || mes === 7 || mes === 8) {
    estacion = "Invierno";
}
else if (mes === 9 ||
     mes === 10 || mes === 11) {
    estacion = "Primavera";
}
else{
    estacion = "Ingrese un mes válido";
}
console.log("El valor corresponde a la estación de: " + estacion);

//Ejercicio 2: Hora del día
let hora = 15;
let mensaje;
if (hora >= 6 && hora < 12) {
    mensaje = "Buenos días";
}
else if (hora >= 12 && hora < 20) {
    mensaje = "Buenas tardes";
}
else if (hora >= 20 && hora < 24) {
    mensaje = "Buenas noches";
}
else{
    mensaje = "El valor ingresado no es una hora válida";
}
console.log(mensaje);
