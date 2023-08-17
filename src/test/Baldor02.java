package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor02 {

    public static void main(String[] args) {
        Consola consola = new Consola();
        Baldor baldor = new Baldor();
        
        Integer[] v = new Integer[100];
        for (int i = 0; i < v.length; i++) {
            v[i] = 1 + i;
        }

        Double sum = baldor.suma((Object[])v);

        consola.println("sum: " + sum);
    }
}
