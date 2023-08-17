package ventas;

public class Productos {
    
    // atributos
    private Double precio;
    private final Double IGV= 1.18d;
    
    // constructores
    public Productos() {
    }

    public Productos(Double precio) {
        this.precio = precio;
    }
    
    // métodos
    public Double precioVenta() {
        
        Double ganancia = precio * 0.20;
        Double preVent = (precio + ganancia) * IGV;
        
        return preVent;
    }
}
