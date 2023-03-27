package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    static private int cantidadAutomoviles;

    public Automovil(String placa, String nombre, int precio,
    int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, 
        precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutomoviles++;
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }
    public int getPuestos(){
        return this.puestos;
    } 

    static public int getCantidadAutomoviles(){
        return Automovil.cantidadAutomoviles;
    }
}
