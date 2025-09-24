let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: '28',
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase(); //Convierte las minúsculas a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //método o funcion en JavaScript
        return this.nombre+' edad: '+thi.edad;
    },
    get nombreEdad(){ //Este es el método get
        return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    }
}
console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);