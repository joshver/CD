/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencias;

public class IntendenteEmpleados implements Empleados{

    @Override
    public String getTarea(String nombre) {
        return "Mi nombre es: "+nombre+" y soy un intendente y tengo la tarea de adminsitrar las escuelas";
    }

}