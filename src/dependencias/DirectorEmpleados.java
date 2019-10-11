/*
Nombre: DirectorEmpleados.java
Objetivo: Generar objetos tipo DirectorEmpleados
Autor: Alumnos de MSC
Fecha: 10/10/2019
 */
package dependencias;

public class DirectorEmpleados implements Empleados{

    public DirectorEmpleados() {
    }
    
    @Override
    public String getTarea(String nombre){
        return "Mi nombre es: "+nombre+" y soy un director y tengo la tarea de administrar los recursos de la empresa";
    }
}
