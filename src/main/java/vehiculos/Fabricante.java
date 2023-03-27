package vehiculos;

import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(){}

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        List<Fabricante> fabricantes = Vehiculo.fabricantes;
        int maximo = 0;
        Fabricante fabricanteMasVendedor = new Fabricante();
        for (int i = 0; i < fabricantes.size(); i++) {
            Fabricante fabricanteActual = fabricantes.get(i);
            int contador = 0;
            for (int j = 0; j < fabricantes.size(); j++) {
                if (fabricantes.get(j) ==fabricanteActual) {
                    contador++;
                }
            }
            if (contador > maximo) {
                maximo = contador;
                fabricanteMasVendedor = fabricanteActual;
            }
        }
        return fabricanteMasVendedor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
    public Pais getPais(){
        return this.pais;
    }
    
}
