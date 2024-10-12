package mx.unam.fi.poo.g1.p8_T1;
import mx.unam.fi.poo.g1.p8_T1.*;

/**
 * Clase Gerente que extiende(hereda) la clase Empleado.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Gerente extends Empleado {
    private String departamento;
    private int numTrabajadores;
    
    /**
     * Método constructor.
     * Para construir objetos Gerente.
     * @param nombre -> Atributo para el nombre del Gerente.
     * @param rol -> Atributo para el rol del Gerente.
     * @param departamento -> Atributo para el departamento en el que trabaja el Gerente.
     * @param numTrabajadores -> Atributo para el número de trabajadores que tiene a su cargo el Gerente.
     */
    public Gerente(String nombre, String rol, String departamento, int numTrabajadores){
        super(nombre, rol);
        setDepartamento(departamento);
        setNumTrabajadores(numTrabajadores);
    }

    /**
     * Método set
     * @param departamento -> Para asignar el departamento en el que trabaja el Gerente.
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método get
     * @return departamento -> Regresa el atributo departamento en el que trabaja el Gerente.
     */
    public String getDepartamento() {
        return this.departamento;
    }

    /**
     * Método set
     * @param numTrabajadores -> Para asignar el número de trabajadores al cargo del Gerente.
     */
    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    /**
     * Método get
     * @return numTrabajadores -> Regresa el atributo número de trabajadores al cargo del Gerente.
     */
    public int getNumTrabajadores() {
        return this.numTrabajadores;
    }

    /**
     * Método que calcula el salario para el Gerente según las horas trabajadas.
     */
    @Override
    public void calcularSalario(){
        System.out.println("--- Salario del " + this.getRol() + " ---");
        super.calcularSalario();
    }
    /**
     * Método que muestra los datos del Gerente.
     */
    @Override
    public void mostrarDatos(){
        System.out.println("--- Datos del Gerente ---");
        super.mostrarDatos();
        System.out.println("Departamento que supervisa: " + getDepartamento());
        System.out.println("Numero de trabajadores a su cargo: " + getNumTrabajadores());
        System.out.println();

    }
}
