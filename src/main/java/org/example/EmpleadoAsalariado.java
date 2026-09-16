package org.example;
//EmpleadoAsalariado (hereda de Empleado)
//• Atributo adicional: double sueldoMensual (puede reemplazar a salarioBase o utilizarlo).
//• Sobrescribir calcularSalario() → sueldoMensual.
//• Sobrescribir obtenerRol() → "Asalariado"

public class EmpleadoAsalariado extends Empleado {
    private double sueldoMensual;

    public EmpleadoAsalariado(String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual){
        super(idEmpleado, telefono, activo, salarioBase);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual(){
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual){
        this.sueldoMensual=sueldoMensual;
    }

    @Override
    public double calcularSalario(){
        return sueldoMensual;
    }

    @Override
    public String obtenerRol(){
        return "Asalariado";
    }

}
