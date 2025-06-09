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
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estrucura if falló

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
console.log(nombre2);

if(true){
    let edad2 = 34;
    console.log(edad);
}
console.log(edad2); //En la función funcionó correctamente, en la estructura if falló


/*
const se utiliza para valores constantes que no pueden ser registradas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //Solo se ejecuta el console anterior