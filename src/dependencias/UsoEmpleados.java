/*
Nombre: UsoEmpleados.java
Objetivo: Instanciar los diferentes tipos de objetos
Autor: Alumnos de MSC
Fecha: 10/10/2019
 */
package dependencias;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoEmpleados {
    
    // método main
    public static void main(String[] args) {
        /*
        SecretariaEmpleados e1 = new SecretariaEmpleados();
        System.out.println(e1.getTarea());
        JefeEmpleados e2 = new JefeEmpleados();
        System.out.println(e2.getTarea());
        DirectorEmpleados e3 = new DirectorEmpleados();
        System.out.println(e3.getTarea());
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        
        DirectorEmpleados de = context.getBean(DirectorEmpleados.class);
        JefeEmpleados je = context.getBean(JefeEmpleados.class);
        SecretariaEmpleados se = context.getBean(SecretariaEmpleados.class);
        IntendenteEmpleados in = context.getBean(IntendenteEmpleados.class);
        ProfesorEmpleados pro = context.getBean(ProfesorEmpleados.class);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un nombre: ");
        String nombre = teclado.next();
        
        System.out.println(de.getTarea(nombre));
        System.out.println(je.getTarea(nombre));
        System.out.println(se.getTarea(nombre));
        System.out.println(in.getTarea(nombre));
        System.out.println(pro.getTarea(nombre));
    }
}
