class Persona {

    static contadorPersonas = 0; //Atributo estático
    //email = 'Valor default email'; //Atributo NO estático

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
        //console.log('Se incrementa contador: '+Persona.contadorObjetosPersonas);
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }
    //Sobreescritura
    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }
    //Sobreescribir el método de la clase padre (Object)
    toString(){ //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        //El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('Saludos desde método static');
    }

    static saludar2(){
        console.log(persona.nombre+' '+persona.apellido);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido,departamento){
        super(nombre, apellido)
        this._departamento = departamento;
    }

    get departamento() {
        return this._departamento;
    }

    set departamento(departamento) {
        this._departamento = departamento;
    }

}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);
let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto())

//Object.prototype.toString  Esta es la manera de acceder a atributos y métodos de manera dinámica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
//Persona.saludar2(persona1);
Empleado.saludar();
//Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona)
console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No puede acceder desde la clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());

let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);