import java.util.ArrayList;

/**
 * Clase Auto
 * Esta clase define autos utilizando varibles marca y modelo.
 * @author Couce_Daniel / TuniverS
 * @version 0.1 2024/02/20
 */

public class Auto {
    /**
     * La marca del auto
     */
    private String marca;
    /**
     * El modelo del auto
     */
    private String modelo;
    /**
     *Constructor de un auto para definir la marca y el modelo
     * @param marca
     * @param modelo
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Devuelve la marca del coche
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Estableces la marca del coche
     * @param marca
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve el modelo del coche
     * @return modelo
     */

    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del coche
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Imprime la marca y el modelo del coche
     * @return
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


