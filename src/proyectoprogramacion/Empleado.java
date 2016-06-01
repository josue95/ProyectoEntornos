
package proyectoprogramacion;


public class Empleado {
     private String nombre;
    private double plus;
    private int nHijos;
    private static double salarioBase;

    Empleado(String nombre, double plus, int hijos) {
        this.nombre = nombre;
        this.plus = plus;
        this.nHijos = hijos;
    }

    /**
     * @param asalarioBase
     */
   public static void setSalarioBase(double asalarioBase) {
        salarioBase = asalarioBase;
        
    }
    public static double getSalarioBase() {
        return salarioBase;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the plus
     */
    public double getPlus() {
        return plus;
    }

    /**
     * @param plus the plus to set
     */
    public void setPlus(double plus) {
        this.plus = plus;
    }

    /**
     * @return the nHijos
     */
    public int getnHijos() {
        return nHijos;
    }

    /**
     * @param nHijos the nHijos to set
     */
    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }
    

}

}
