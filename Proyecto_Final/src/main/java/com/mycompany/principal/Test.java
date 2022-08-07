package com.mycompany.principal;

import Controllers.EmpleadoController;
import Controllers.DepartamentoController;
import Models.Empleado;
import Models.Departamento;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Empleado empleado = new Empleado("1334", new Date(), "hola", "hola", "hola", "saas", new Date(), 2, 12333, 1);
        //Boolean result = new EmpleadoController().create(empleado);
        List<Empleado> result = new DepartamentoController().getEmpleados(1);
        System.out.println(result);
    }

}
