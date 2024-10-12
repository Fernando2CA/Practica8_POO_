package mx.unam.fi.poo.g1.p8_T1;
import mx.unam.fi.poo.g1.p8_T1.*;

/**
 * Clase Programador que extiende(hereda) la clase Empleado.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Programador extends Empleado {
    private String lenguaje;
    private String proyecto;

    /**
     * Método constructor.
     * Para construir objetos Programador. 
     * @param nombre -> Atributo para el nombre del Programador.
     * @param rol -> Atributo para el rol del Programador.
     * @param lenguaje -> Atributo para el lenguaje de programación que trabaja el Programador.
     * @param proyecto -> Atributo para el nombre del proyecto en el que trabaja el Programador.
     */
    public Programador(String nombre, String rol, String lenguaje, String proyecto){
        super(nombre, rol);
        setLenguaje(lenguaje);
        setProyecto(proyecto);
    }

    /**
     * Método set
     * @param lenguaje -> Para asignar el lenguaje que trabaja el Programador.
     */
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    /**
     * Método get
     * @return lenguaje -> Regresa el atributo lenguaje que trabaja el Programador.
     */
    public String getLenguaje() {
        return this.lenguaje;
    }

    /**
     * Método set
     * @param proyecto -> Para asignar el proyecto en el que trabaja el Programador.
     */
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * Método get
     * @return proyecto -> Regresa el atributo proyecto en el que trabaja el Programador.
     */
    public String getProyecto() {
        return this.proyecto;
    }

    /**
     * Método que calcula el salario para el Programador según las horas trabajadas.
     */
    @Override
    public void calcularSalario(){
        System.out.println("--- Salario del " + this.getRol() + " ---");
        super.calcularSalario();
    }

    /**
     * Método que muestra los datos del Programador.
     */
    @Override
    public void mostrarDatos(){
        System.out.println("--- Datos del Programador ---");
        super.mostrarDatos();
        System.out.println("Lenguaje de programacion que emplea: " + getLenguaje());
        System.out.println("Proyecto en el que trabaja: " + getProyecto());
        System.out.println();

    }
}
