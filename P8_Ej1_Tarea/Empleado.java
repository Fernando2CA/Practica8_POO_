package mx.unam.fi.poo.g1.p8_T1;
import java.util.Scanner;

/**
 * Clase Empleado
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Empleado {
    private String nombre;
    private String rol;

    /**
     * Método Cosntructor.
     * Para construir objetos Empleado.
     * @param nombre -> Atributo para el nombre del Empleado.
     * @param rol -> Atributo para el rol del Empleado.
     */
    public Empleado(String nombre, String rol){
        setNombre(nombre);
        setRol(rol);
    }

    /**
     * Método set
     * @param nombre -> Para asignar el nombre del Empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get
     * @return nombre -> Regresa el atributo nombre del Empleado.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método set
     * @param rol -> Para asignar el rol del Empleado.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Método get
     * @return rol -> Regresa el atributo rol del Empleado.
     */
    public String getRol() {
        return this.rol;
    }

    /**
     * Método que calcula el salario del Empleado de acuerdo a las horas que trabaja.
     */
    public void calcularSalario(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuantas horas a la semana trabaja? (6, 8, 10)\n>");
        int respuesta = entrada.nextInt();
        double salario = 0;

        if(respuesta == 6){
            salario = 20000;
        } else if(respuesta == 8){
            salario = 25000;
        } else if(respuesta == 10){
            salario = 30000;
        } else {
            System.out.println("Cantidad de horas fuera de rango...");
        }
        System.out.print("Su salario es de: " + salario + "\n");
        System.out.println();

    }

    /**
     * Método que imprime los datos de cada Empleado.
     */
    public void mostrarDatos(){
        System.out.print("Nombre: " + this.getNombre() + "\n");
        System.out.print("Rol: " + this.getRol() + "\n");
    }
}
