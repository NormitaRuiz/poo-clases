package ventas.procesos;

import ventas.Productos;

public class Ventas {
    
    public static void main(String[] args) {
        
        Productos p1 = new Productos(100d);
        
        System.out.println("precio de venta de p1: " + p1.precioVenta());
    }
}
