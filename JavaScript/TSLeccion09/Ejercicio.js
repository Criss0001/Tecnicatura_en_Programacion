class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    // Getters y Setters
    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }

    toString() {
        // return Producto [ID: ${this._idProducto}, Nombre: ${this._nombre}, Precio: $${this._precio}];
        return `
        ${this._idProducto}
        ${this._nombre}
        ${this._precio} `;
    }
}

class Orden {
    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarProducto(producto) {
        if (this._productos.length < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto);
        } else {
            console.log('No se pueden agregar más productos a esta orden (máximo alcanzado).');
        }
    }

    calcularTotal() {
        let total = 0;
        for (let producto of this._productos) {
            total += producto.precio;
        }
        return total;
    }

   mostrarOrden() {
    let productosOrden = ''; // Variable para acumular los productos

    for (let producto of this._productos) {
        productosOrden += '  ' + producto.toString(); // Concatenamos cada producto
    }

    console.log(`Orden [ID: ${this._idOrden}] - Total: $${this.calcularTotal()}`);
    console.log('Productos en la orden: '+productosOrden);
}

}

// Creación productos
let producto1 = new Producto('Monitor Samsung', 80000);
let producto2 = new Producto('Teclado Logitech', 15000);
let producto3 = new Producto('Mouse Redragon', 10000);

// Crear una orden y agregar productos
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

// Mostrar la orden
orden1.mostrarOrden();

// Crear otra orden
let producto4 = new Producto('Auriculares HyperX', 20000);
let producto5 = new Producto('Silla Gamer', 120000);

let orden2 = new Orden();
orden2.agregarProducto(producto4);
orden2.agregarProducto(producto5);

orden2.mostrarOrden();
