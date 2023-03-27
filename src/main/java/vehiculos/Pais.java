package vehiculos;

import java.util.List;

public class Pais {
    private String nombre;

    public Pais(){}

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        List<Pais> paises = Vehiculo.paises;
        int maximo = 0;
        Pais paisMasVendedor = new Pais();
        for (int i = 0; i < paises.size(); i++) {
            Pais paisActual = paises.get(i);
            int contador = 0;
            for (int j = 0; j < paises.size(); j++) {
                if (paises.get(j) ==paisActual) {
                    contador++;
                }
            }
            if (contador > maximo) {
                maximo = contador;
                paisMasVendedor = paisActual;
            }
        }
        return paisMasVendedor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    } 
}
