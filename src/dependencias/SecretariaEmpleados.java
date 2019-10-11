/*
Nombre: SecretariaEmpleados.java
Objetivo: Generar objetos tipo SecretariaEmpleados
Autor: Alumnos de MSC
Fecha: 10/10/2019
 */
package dependencias;

public class SecretariaEmpleados implements Empleados {

    public SecretariaEmpleados() {
    }
    
    @Override
    public String getTarea(String nombre){
        return "Mi nombre es: "+nombre+"y soy una secretaria y tengo la tarea de administrar la agenda de los jefes";
    }
}
