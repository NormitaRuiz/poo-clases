package test;

import parainfo.io.Consola;

public class Consola02 {

    public static void main(String[] args) {
        Consola consola = new Consola();

        String n;
        do {
            n = consola.getString("nombre [5, 30]: ").trim();
        } while (n.length() < 5 || n.length() > 30);

        Integer e;
        do {
            e = consola.getInteger("edad [18, 65]: ");
        } while (e == null || e < 18 || e > 65);

        consola.println("%s tiene %d años", n, e);
    }
}
