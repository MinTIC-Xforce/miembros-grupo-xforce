package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ejecucionClases {

    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Pedro", "Perez","notiene@notiene.com", "Chelsea", "Usuario");
        System.out.println("El nombre del empleado es: " + empleado1.getNombresEmpleado() + " " + empleado1.getApellidosEmpleado() + "\n" +
                           "El correo del empleado es: " + empleado1.getCorreoEmpleado() + "\n" +
                           "La empresa del registrada es: " + empleado1.getEmpresaEmpleado() + "\n" +
                           "El rol del empleado es: " + empleado1.getRolEmpleado() + "\n");

        Empresa empresa1 = new Empresa("Chelsea", "Calle falsa 123", "3450000", 900009700);
        System.out.println("El nombre de la empresa es : " + empresa1.getNombreEmpresa() + "\n" +
                           "La dirección de la empresa es: " + empresa1.getDireccionEmpresa() + "\n" +
                           "El telefono de la empresa es: " + empresa1.getTelefonoEmpresa() + "\n" +
                           "El nit de la empresa es: " + empresa1.getNitEmpresa() + "\n");

        MovimientoDinero movDinero1 = new MovimientoDinero(2000000, "compra de insumos empresa 1");
        System.out.println("El monto del movimiento es : $" + movDinero1.getMontoMovimiento() + "\n" +
                "El concepto del monto es: " + empresa1.getDireccionEmpresa());
    }
}