package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    static private int cantidadCamiones;

    public Camion(String placa, String nombre, int precio,
    int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, 
        precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.cantidadCamiones++;
    }
    
    public void setEjes(int ejes){
        this.ejes = ejes;
    }
    public int getEjes(){
        return this.ejes;
    } 

    static public int getCantidadCamiones(){
        return Camion.cantidadCamiones;
    }
}
