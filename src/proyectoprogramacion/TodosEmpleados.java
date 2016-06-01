/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

/**
 *
 * @author Usuario
 */
public class TodosEmpleados {
     static Empleado e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
    
    static void altaEmpleado() {
        e1= new Empleado("Em Uno", 100,1);
        e2= new Empleado("Em Dos", 200,2);
        e3= new Empleado("Em Tres", 300,3);
        e4= new Empleado("Em Cuatro", 400,4);
        e5= new Empleado("Em Cinco", 500,5);
        e6= new Empleado("Em Seis", 600,6);
        e7= new Empleado("Em Siete", 700,7);
        e8= new Empleado("Em Ocho", 800,8);
        e9= new Empleado("Em Nueve", 900,9);
        e10= new Empleado(Pantalla.pideCadena("Inttroduce el nombre del empleado: "),
            Pantalla.pideDouble("Introduce el plus de salario: "),
            Pantalla.pideEntero("Introduce en nº de hijos: "));                
    }
}


