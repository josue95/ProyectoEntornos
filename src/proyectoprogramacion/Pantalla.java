
package proyectoprogramacion;

import java.util.Scanner;



public class Pantalla {
    static Fecha miFecha;
    
     static Fecha pideFecha() {
        miFecha = new Fecha();
        return miFecha;
    }
     
     public static int pideEntero(String mensaje) {
        Scanner teclado=new Scanner(System.in);
        System.out.print(mensaje);
        return teclado.nextInt();
    }
    
     public static String pideCadena(String cadena) {
        Scanner teclado=new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextLine();
     }     
    public static double pideDouble (String cadena) {
        Scanner teclado=new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextDouble();
    }
    public static float pideNota() {
        float nota=pideFloat("Introduce la nota: ");
        while (nota<0 || nota>10) {
            nota=pideFloat("Tiene que estar entre 0 y 10: ");
        }
        return nota;
    }
    public static float pideFloat(String cadena) {
        Scanner teclado=new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextFloat();
    }
    public static int menu() {
        int op;
        System.out.println("***********************************");
        System.out.println("*************** ACME***************");
        System.out.println("1.- Calcular la nomina");
        System.out.println("2.- Datos del empleado");
        System.out.println("3.- Salario Base");
        System.out.println("Otro.TERMINAR");
        op=Pantalla.pideEntero("Introduce una opcion: ");
        while (op<1 || op>4) {
            op=Pantalla.pideEntero("Opcion no valida: ");
        }
        return op;
    }
    
     public static int menuEmpleados() { 
       
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************");
        System.out.println("1.- "+TodosEmpleados.e1.getNombre());
        System.out.println("2.- "+TodosEmpleados.e2.getNombre());
        System.out.println("3.- "+TodosEmpleados.e3.getNombre());
        System.out.println("4.- "+TodosEmpleados.e4.getNombre());
        System.out.println("5.- "+TodosEmpleados.e5.getNombre());
        System.out.println("6.- "+TodosEmpleados.e6.getNombre());
        System.out.println("7.- "+TodosEmpleados.e7.getNombre());
        System.out.println("8.- "+TodosEmpleados.e8.getNombre());  
        System.out.println("9.- "+TodosEmpleados.e9.getNombre());               
        System.out.println("10.-"+TodosEmpleados.e10.getNombre());
        System.out.println("Otro.- Volver a la pantalla anterior");
        return Pantalla.pideEntero("Introduce el nº de empleado: ");      
    }
     
      public static int ListaEmpleados() { 
       
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************");
        System.out.println("1.- "+TodosEmpleados.e1.getNombre());
        System.out.println("2.- "+TodosEmpleados.e2.getNombre());
        System.out.println("3.- "+TodosEmpleados.e3.getNombre());
        System.out.println("4.- "+TodosEmpleados.e4.getNombre());
        System.out.println("5.- "+TodosEmpleados.e5.getNombre());
        System.out.println("6.- "+TodosEmpleados.e6.getNombre());
        System.out.println("7.- "+TodosEmpleados.e7.getNombre());
        System.out.println("8.- "+TodosEmpleados.e8.getNombre());  
        System.out.println("9.- "+TodosEmpleados.e9.getNombre());               
        System.out.println("10.-"+TodosEmpleados.e10.getNombre());
        System.out.println("Otro.- Volver a la pantalla anterior");
        return Pantalla.pideEntero("Introduce el nº de empleado: ");      
    }
      
    public static void menuDatosEmpleado(Empleado e) {
        System.out.println("********************************");
        System.out.println("*******Datos del empleado*******");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("NOMBRE: " + e.getNombre());
        System.out.println("HIJOS: " + e.getnHijos());
        System.out.println("PLUS: " + e.getPlus());
        System.out.println("");
        System.out.println("");  
        }
    
    public static int menuCambiarDatos() {
        System.out.println("1.- CAMBIAR NOMBRE.");
        System.out.println("");
        System.out.println("2.- CAMBIAR NUMERO DE HIJOS.");
        System.out.println("");
        System.out.println("3.- CAMBIAR PLUS.");
        System.out.println("");
        System.out.println("OTRO.- VOLVER.");
        System.out.println("");
        return Pantalla.pideEntero("ELIGE OPCION: ");
    }
}
   



