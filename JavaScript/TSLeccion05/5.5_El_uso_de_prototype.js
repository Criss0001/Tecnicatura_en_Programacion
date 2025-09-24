function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
     this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis';
console.log(padre);

//Uso de prototype
padre.nombre = 'Luis'; // modificamos el nombre
padre.telefono = '5492618282821';
console.log(padre);
//Uso de prototype
Persona3.prototype.telefono = '2615859586';
console.log(madre);
console.log(madre.telefono);
