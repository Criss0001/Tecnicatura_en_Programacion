// while
let contador = 0;
while(contador < 5){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo While");


// do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo Do While");

// for
for( let contador = 0; contador < 3; contador++ ){
    console.log(contador);
}
console.log("Fin del ciclo For");

// Palabra reservada break
for(let contador = 0; contador < 10; contador++ ){
    if(contador % 2 == 0){
        console.log(contador); // Muestra todos los pares
        break;
    }
}
console.log("Termina el ciclo al encontrar los pares");

// Palabra reservada continue y Etiquetas Labels
inicio:
for(let contador = 0; contador < 10; contador++ ){
    if(contador % 2 != 0){
        break inicio; // Salta los impares
    }
    console.log(contador); // Muestra todos los pares
}   
console.log("Termina el ciclo al encontrar los pares");


