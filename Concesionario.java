import java.util.ArrayList;
/**
 * Clase Concesionario
 * Esta clase gestiona el inventario de un concesionario
 * utilizando lista de clase auto
 * @author Couce_Daniel / TuniverS
 * @version 0.1 2024/02/20
 */
public class Concesionario {

    /**
     * Lista de variables de clase Auto
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de la clase Concesionario
     * Constructor que inicializa la lista de autos con una coleccion ArrayList vacia
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Agrega un auto a la lista
     * @param auto
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Devuelve los autos de la lista
     * @return autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime los autos de la lista
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

