package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor01 {

    public static void main(String[] args) {
        Consola consola = new Consola();
        Baldor baldor = new Baldor();

        Double sum = baldor.suma(12, 13f, 10d, "20");

        consola.println("sum: " + sum);
    }
}
