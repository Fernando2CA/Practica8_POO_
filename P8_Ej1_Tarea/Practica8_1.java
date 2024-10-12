package mx.unam.fi.poo.g1.p8_T1;
import mx.unam.fi.poo.g1.p8_T1.*;

/**
 * Clase principal de la Practica 8_1
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
 */

public class Practica8_1 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Daniel Hernadez", "Gerente de proyectos", "Gestion de proyectos", 15);
        Empleado programador = new Programador("Carlos Torres", "Desarrollador de software", "Java", "Aplicacion movil");
        
        gerente.calcularSalario();
        gerente.mostrarDatos();

        programador.calcularSalario();
        programador.mostrarDatos();
    }
}
