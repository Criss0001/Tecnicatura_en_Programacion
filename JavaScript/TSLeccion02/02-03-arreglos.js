
//Creación de Array o arreglos
//let autos = new Array('Ferrari', 'Renault', 'BMW'); Esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW']; // Esta es la sintaxis moderna
console.log(autos);

//Recorremos los elemtnos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++) {
    console.log(i+' : '+autos[i]);
}

// Modificamos los elemtnos del arreglo
autos [1] = 'Volvo';
console.log(autos[1]);

// Agregamos nuevos valores al arreglo
autos.push('Audi');
console.log(autos);

// Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porsche';
console.log(autos);

// Tercera forma de agreagar un elementos teniendo CUIDADO
//autos[6] = 'Ranault';
//console.log(autos);

// Como preguntar si es una Array o Arreglo
console.log(Array.isArray(autos)); // true Devuelve un booleano(true or false)

console.log(autos instanceof Array); // true Devuelve un booleano(true or false)

// Eliminar un elemento del arreglo
autos.pop(); // Elimina el último elemento del arreglo
console.log(autos);
