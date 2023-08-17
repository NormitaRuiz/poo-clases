package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor06 {

    // ofertas: 
    // entre [5, 10] productos 10% de descuento
    // entre [11, 15] productos 20% de descuento
    // más de 15 productos 30% de descuento
    // pedir cantidad y precio para mostrar total a pagar con IGV
    public static void main(String[] args) {
        Consola consola = new Consola();
        Integer cantidad;
        Double precio;

        do {
            cantidad = consola.getInteger("cantidad: ");
        } while (cantidad == null);

        do {
            precio = consola.getDouble("precio unitario: ");
        } while (precio == null);
        ///////////////////////////////

        Double total = Baldor.multiplica(cantidad, precio);

        if (cantidad >= 5 && cantidad <= 10) {
            total -= Baldor.porcentaje(total, 10);

        } else if (cantidad >= 11 && cantidad <= 15) {
            total -= Baldor.porcentaje(total, 20);

        } else if (cantidad >= 16) {
            total -= Baldor.porcentaje(total, 30);
        }

        total += Baldor.igv(total);
        consola.println("total a pagar: S/%1.2f", total);
    }
}
