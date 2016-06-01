
package proyectoprogramacion;


public class Nomina {
    static final double salario_minimo=600, ayuda=100;
    
    static final float irpf_max=24f, irpf_min=9f;
    
     public static void muestraNomina(String nombre, int nHijos, double plus) {
        double extra=0;
        double Hijos=0;
        float irpf;
        double irpfFinal;
        
         System.out.printf("%40s", "NOMINA\n");
         System.out.print("Fecha: ");
         Pantalla.miFecha.muestraFecha();
         System.out.println("");
         
         System.out.println("Empleado: " + nombre + " Numero de hijos: " + nHijos);
         System.out.println("\t" + Empleado.getSalarioBase());
         
         System.out.printf("%40s", "Salario Base: ");
         System.out.println("\t" + Empleado.getSalarioBase());
         
         System.out.printf("%40s", "Plus");
         System.out.println("\t" + plus);
         
         if (Pantalla.miFecha.mes==6 || Pantalla.miFecha.mes==12){
             System.out.printf("%40s", "Extraordinaria: ");
             extra=Empleado.getSalarioBase();
             System.out.println("\t" + extra);
         }
         
         if (Pantalla.miFecha.mes==9) {
             System.out.printf("%40s", "Ayuda por hijos: ");
             Hijos=ayuda*nHijos;
             System.out.println("\t" + Hijos);
         }
         
         if ((Empleado.getSalarioBase()+plus+extra+Hijos)<salario_minimo) {
             irpf=irpf_min;
            }else{irpf=irpf_max;}
            irpf=(irpf-nHijos);
            if (irpf<1){
                irpf=1;
         }
         
         System.out.printf("%40s", irpf + "% de IRPF: ");
         irpfFinal=((Empleado.getSalarioBase()+plus+extra+Hijos)/100)*irpf;
         System.out.println("\t" + irpfFinal);
         System.out.println("\t\t\t----------------------------------");
         System.out.printf("%40s", "Total a recibir: ");
         System.out.println("\t" + (Empleado.getSalarioBase()+plus+extra+Hijos-irpf));
         System.out.println("");
    }    
}




