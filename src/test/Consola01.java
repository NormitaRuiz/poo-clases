package test;

import parainfo.io.Consola;

public class Consola01 {
    
    public static void main(String[] args) {
        Consola consola = new Consola();
        
        String n = consola.getString("nombre: ");
        Integer e = consola.getInteger("edad: ");
        
        consola.println("%s tiene %d años", n, e);
    }
}
