//Ejercicio para encontrar números pares
let parImpar = 7;
if(parImpar % 2 == 0){
    console.log("Es un número PAR");
}
else(
    console.log("Es un número IMPAR")
)

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if(edad >= adulto){
    console.log("Usted es mayor de edad");
}
else{
    console.log("Usted es menor de edad");
}   

//Ejercicio: Dentro de un rango
let dentroRango = 5; // Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if( dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango");
}
else{
    console.log("El número está fuera del rango");
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso) {
    console.log("El padre puede asistir al juego de su hijo");
}
else {
    console.log("El padre No puede asistir al juego de su hijo");
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 5; // Cambia este valor para probar
resultado2 = numero % 2 == 0 ? "Es un número PAR" : "Es un número IMPAR";
console.log(resultado2)

//convertir String a Number
let miNumero = "21";
console.log(typeof miNumero); //Esta es una función
let edad2 = Number(miNumero);
console.log(typeof edad2);
if(isNaN(edad2)){
    console.log("esta variablo no contiene solo números")
}
else{
    if(edad2 >= 18) {
        console.log("Puede votar");
    }
    else {
        console.log("Muy joven para votar");
    }
}
//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);

//Ampliando el uso de var let y const
/*
Con var podes resingnar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba su scot
*/

var nombre = 'Cristian';
nombre = 'Jesús';
console.log(nombre);

function saludar() {
    var nombre = 'Natalia';
    console.log(nombre);
}
console.log(nombre);

if(true){
    var edad3 = 34;
    console.log(edad);
}
console.log(edad3); //En la función funciono correctamente, en la estrucura if falló

/*
let: ésta puede ser reasignada en cualqueir momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de lalves
o dentro de una función
*/

function saludar2(){
    let nombre2 = 'Cristian';
    console.log(nombre2);
}
// console.log(nombre2); No esta definido

if(true){
    let edad4 = 34;
    console.log(edad4);
}
console.log(edad2); //En la función funcionó correctamente, en la estructura if falló


/*
const se utiliza para valores constantes que no pueden ser registradas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //Solo se ejecuta el console anterior