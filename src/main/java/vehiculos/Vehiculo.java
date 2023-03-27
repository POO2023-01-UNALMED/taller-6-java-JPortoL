package vehiculos;

import java.util.List;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    static protected int cantidadVehiculos;
    static protected List<Pais> paises;
    static protected List<Fabricante> fabricantes;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio,
    int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
        if (fabricante != null) {
            paises.add(fabricante.getPais());
            fabricantes.add(fabricante);
        }
    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getCantidadAutomoviles() +
        "\nCamionetas: " + Camioneta.getCantidadCamionetas() +
        "\nCamiones: " + Camion.getCantidadCamiones();
    }
  
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa;
    }   

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public int getPuertas(){
        return this.puertas;
    }  

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    } 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    } 

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    } 

    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return this.peso;
    }

    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public String getTraccion(){
        return this.traccion;
    } 

    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    public Fabricante getFabricante(){
        return this.fabricante;
    } 

    static public void setCantidadVehiculos(int fabricante){
        Vehiculo.cantidadVehiculos = fabricante;
    }
    static public int getCantidadVehiculos(){
        return Vehiculo.cantidadVehiculos;
    } 
}
