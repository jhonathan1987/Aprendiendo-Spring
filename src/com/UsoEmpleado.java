package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

    public static void main(String[] args) {
        /* Empleados empleado1=new DirectorEmpleado();
        System.out.println(empleado1.getTarea());*/

        //cargamos el archivo xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("/com/applicationContext.xml");

        Empleados jhonathan = contexto.getBean("miEmpleado", Empleados.class);
        
        System.out.println(jhonathan.getTarea());
        
        contexto.close();
    }
}
