
package proyectoprogramacion;


public class Fecha {
    int year;
    int dia;
    int mes;

    Fecha() {
        boolean segunda = false;
        do {
            if (segunda) {
                System.out.println("Fecha incorrecta!!");
            }
            dia = Pantalla.pideEntero("Introduce el dia: ");
            mes = Pantalla.pideEntero("Introduce el mes: ");
            year = Pantalla.pideEntero("Introduce el año: ");
            segunda = true;
        } while (!correcta2());
    }

    boolean esBisiesto() {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public void muestraMes() {
        switch (mes) {
            case 1:
                System.out.print("enero");
                break;
            case 2:
                System.out.print("febrero");
                break;
            case 3:
                System.out.print("marzo");
                break;
            case 4:
                System.out.print("abril");
                break;
            case 5:
                System.out.print("mayo");
                break;
            case 6:
                System.out.print("junio");
                break;
            case 7:
                System.out.print("julio");
                break;
            case 8:
                System.out.print("agosto");
                break;
            case 9:
                System.out.print("septiembre");
                break;
            case 10:
                System.out.print("octubre");
                break;
            case 11:
                System.out.print("noviembre");
                break;
            case 12:
                System.out.print("diciembre");
                break;
        }
    }

    void muestraFecha() {
        System.out.print("El " + dia + " de ");
        muestraMes();
        System.out.print(" de " + year);
    }

    //int getDiasMes() --> indica los dias que tiene cada mes, teniendo en cuenta si el año es bisiesto o no.

    int getDiasMes() {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            //no es necesario break
            case 2:
                if (esBisiesto()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
    /*
     void correcta()--> indica si una fecha es correcta o no,
     diciendo si falla el dia, el mes.
     si la fecha es correcta lo mostrara con el mes escrito con letras.
     */

    void Correcta() {
        if (dia < 1 || dia > getDiasMes()) {
            System.out.println("El nº dias no es correcta");
        } else {
            if (mes < 1 || mes > 12) {
                System.out.println("El nº de mes es incorrecto");
            } else {
                muestraFecha();
            }
        }
    }
    /*
     Devuelve true o false dependiendo si la fecha es correcta o no.
     Pero no muestra nada.
     */

    boolean esCorrecto() {
        if (dia < 1 || mes < 1 || mes > 12 || dia > getDiasMes()) {
            return false;
        } else {
            return true;
        }
    }

    boolean correcta2() {
        if (mes > 0 && mes <= 12 && dia > 0 && dia <= getDiasMes()) {
            return true;
        } else {
            return false;
        }
    }
}
}
