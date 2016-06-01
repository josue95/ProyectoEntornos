
package proyectoprogramacion;


public class ProyectoProgramacion {

    
    public static void main(String[] args) {
        TodosEmpleados.altaEmpleado();
        Empleado.setSalarioBase(Pantalla.pideEntero("Introduce el salario base: "));
        
        Principal();
    }
     
    public static void Principal(){
        int op;
        op=Pantalla.menu();
        switch(op) {
            case 1:
                Pantalla.pideFecha();
                menuNomina();
                break;
            case 2:
                 menuSelecEmpleados();
                 Principal();
                break;
            case 3:
                Empleado.setSalarioBase(Pantalla.pideDouble("Introduce el nuevo salario base: "));
                Principal();
                break;             
            default:
                break;
        }
    }
    
    public static void menuNomina() {
        int op1;
        op1=Pantalla.menuEmpleados();
        switch(op1){
            case 1:
                Nomina.muestraNomina(TodosEmpleados.e1.getNombre(), TodosEmpleados.e1.getnHijos(), TodosEmpleados.e1.getPlus());
                menuNomina();
                break;
            case 2:
                Nomina.muestraNomina(TodosEmpleados.e2.getNombre(), TodosEmpleados.e2.getnHijos(), TodosEmpleados.e2.getPlus());
                menuNomina();
                break;
            case 3:
                Nomina.muestraNomina(TodosEmpleados.e3.getNombre(), TodosEmpleados.e3.getnHijos(), TodosEmpleados.e3.getPlus());
                menuNomina();
                break;
            case 4:
                Nomina.muestraNomina(TodosEmpleados.e4.getNombre(), TodosEmpleados.e4.getnHijos(), TodosEmpleados.e4.getPlus());
                menuNomina();
                break;
            case 5:
                Nomina.muestraNomina(TodosEmpleados.e5.getNombre(), TodosEmpleados.e5.getnHijos(), TodosEmpleados.e5.getPlus());
                menuNomina();
                break;
            case 6:
                Nomina.muestraNomina(TodosEmpleados.e6.getNombre(), TodosEmpleados.e6.getnHijos(), TodosEmpleados.e6.getPlus());
                menuNomina();
                break;
            case 7:
                Nomina.muestraNomina(TodosEmpleados.e7.getNombre(), TodosEmpleados.e7.getnHijos(), TodosEmpleados.e7.getPlus());
                menuNomina();
                break;
            case 8:
                Nomina.muestraNomina(TodosEmpleados.e8.getNombre(), TodosEmpleados.e8.getnHijos(), TodosEmpleados.e8.getPlus());
                menuNomina();
                break;
            case 9:
                Nomina.muestraNomina(TodosEmpleados.e9.getNombre(), TodosEmpleados.e9.getnHijos(), TodosEmpleados.e9.getPlus());
                menuNomina();
                break;
            case 10:
                Nomina.muestraNomina(TodosEmpleados.e10.getNombre(), TodosEmpleados.e10.getnHijos(), TodosEmpleados.e10.getPlus());
                menuNomina();
                break;
            default:
                Principal();
                break;
        }
    }
        
    public static void menuSelecEmpleados (){
        int op2;
         
        op2=Pantalla.ListaEmpleados();
       
        switch(op2){
            case 1:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e1);
                break;
            case 2:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e2);
                break;
            case 3:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e3);
                break;
            case 4:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e4);
                break;
            case 5:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e5);
                break;
            case 6:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e6);
                break;
            case 7:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e7);
                break;
            case 8:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e8);
                break;
            case 9:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e9);
                break;
            case 10:
                Pantalla.menuDatosEmpleado(TodosEmpleados.e10);
                break;
            default:
            Principal();
          break;
        }
    }
    
    public static void DatosEmpleado(Empleado e){
    int op3;
        op3=Pantalla.menuCambiarDatos();
        switch(op3){
            case 1:
                e.setNombre(Pantalla.pideCadena("INTRODUCE UN NOMBRE NUEVO: "));
                Pantalla.menuDatosEmpleado(e);
                break;
            case 2:
                e.setnHijos(Pantalla.pideEntero("INTRODUCE UN NUEVO NUMERO DE HIJOS: "));
                Pantalla.menuDatosEmpleado(e);
                break;
            case 3:
                e.setPlus(Pantalla.pideDouble("INTRODUCE UN PLUS NUEVO: "));
                Pantalla.menuDatosEmpleado(e);
                break;
            default:
                menuSelecEmpleados();
                break;
        }
    }
}
    
    

