/*
Nombre: JefeEmpleados.java
Objetivo: Generar objetos tipo JefeEmpleados
Autor: Alumnos de MSC
Fecha: 10/10/2019
 */
package dependencias;

public class JefeEmpleados implements Empleados {

    public JefeEmpleados() {
    }
    
    @Override
    public String getTarea(String nombre){
        return "Mi nombre es: "+nombre+" y soy jefe y tengo la tarea de administrar recursos de mi departamento";
    }
}
