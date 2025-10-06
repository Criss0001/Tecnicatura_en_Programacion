class Persona {
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
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

    nombreCompleto(){
        return this._nombre+' '+this._apellido
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

    //Sobreescritura
    nombreCompleto(){
        return this._nombre+' '+this._apellido;
    }
    //Sobreescribir el método de la clase padre (Object)
    toString(){ //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        //El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('Saludos desde método static de la clase Empleado');
    }

    static saludar2(){
        console.log(empleado.nombre+' '+empleado.apellido);
    }
}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1);
console.log(persona1.nombreCompleto())
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2);
console.log(persona2.nombreCompleto())
//console.log(persona2);
let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto())

//Object.prototype.toString  Esta es la manera de acceder a atributos y métodos de manera dinámica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);