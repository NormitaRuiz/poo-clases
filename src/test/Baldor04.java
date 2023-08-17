package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor04 {

    // pedir 3 valores, e imprimir el promedio, máximo y mínimo
    public static void main(String[] args) {
        Consola consola = new Consola();
        Double v1, v2, v3;
        
        do {
            v1 = consola.getDouble("v1: ");
        } while (v1 == null);
        
        do {
            v2 = consola.getDouble("v2: ");
        } while (v2 == null);
        
        do {
            v3 = consola.getDouble("v3: ");
        } while (v3 == null);
        ////////////////////////////////////////////
        
        consola.println("promedio: %1.2f", Baldor.promedio(v1, v2, v3));
        consola.println("máximo: %1.2f", Baldor.maximo(v1, v2, v3));
        consola.println("mínimo: %1.2f", Baldor.minimo(v1, v2, v3));
    }
}
