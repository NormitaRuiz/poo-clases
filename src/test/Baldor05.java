package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor05 {

    // pedir 3 valores, e imprimir el promedio, máximo y mínimo
    public static void main(String[] args) {
        Consola consola = new Consola();
        Double[] v = new Double[3];

        for (int i = 0; i < v.length; i++) {
            do {
                v[i] = consola.getDouble("v" + (1 + i) + ": ");
            } while (v[i] == null);
        }
        ////////////////////////////////////////////

        consola.println("promedio: %1.2f", Baldor.promedio((Object[]) v));
        consola.println("máximo: %1.2f", Baldor.maximo((Object[]) v));
        consola.println("mínimo: %1.2f", Baldor.minimo((Object[]) v));
    }
}
