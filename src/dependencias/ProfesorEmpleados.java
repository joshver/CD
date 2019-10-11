/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencias;

/**
 *
 * @author Juande
 */
public class ProfesorEmpleados implements Empleados {

    @Override
    public String getTarea(String nombre) {
        return "Mi nombre es: "+nombre+" y soy un profeosr y tengo la tarea de dar clases";
    }
    
}
