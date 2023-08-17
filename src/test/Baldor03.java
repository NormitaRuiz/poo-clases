package test;

import parainfo.io.Consola;
import parainfo.math.Baldor;

public class Baldor03 {

    public static void main(String[] args) {
        Consola consola = new Consola();
        Double vent, cfab, ubru, gope, uimp, impu, unet;

        do {
            vent = consola.getDouble("Ventas: ");
        } while (vent == null);

        do {
            cfab = consola.getDouble("Costos de fabricación: ");
        } while (cfab == null);

        do {
            gope = consola.getDouble("Gastos de operación: ");
        } while (gope == null);
        /////////////////////////////////////////
        
        ubru = Baldor.resta(vent, cfab);
        uimp = Baldor.resta(ubru, gope);
        impu = Baldor.multiplica(0.18, uimp);
        unet = Baldor.resta(uimp, impu);
        //////////////////////////////////////////
        
        consola.println();
        consola.println("%-25s %,8.2f", "Ventas", vent);
        consola.println("%-25s %,8.2f", "Costos de fabricación", cfab);
        consola.repiteln("-", 34);
        consola.println("%-25s %,8.2f", "Utilidad Bruta", ubru);
        consola.println("%-25s %,8.2f", "Gastos de operación", gope);
        consola.repiteln("-", 34);
        consola.println("%-25s %,8.2f", "Utilidad Imponible", uimp);
        consola.println("%-25s %,8.2f", "Impuestos (18%)", impu);        
        consola.repiteln("-", 34);
        consola.println("%-25s %,8.2f", "Utilidad Neta", unet);
        consola.println();
    }
}







































