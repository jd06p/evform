package org.example;
//3. Clases hijas (herencia)
//EmpleadoPorHoras (hereda de Empleado)
//• Atributos adicionales: private int horasTrabajadas y private double valorHora, ambos con getters y setters.
//• Sobrescribir calcularSalario() → salario = horasTrabajadas * valorHora.
//• Sobrescribir obtenerRol() → "Por Horas".
//• Sobrescribir mostrarInfo() usando super.mostrarInfo() y agregando horas y valor por hor

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);

        this.horasTrabajadas = horasTrabajadas;
        this.valorHora=valorHora;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora=valorHora;
    }

    @Override
    public double calcularSalario(){
        return horasTrabajadas*valorHora;
    }

    @Override
    public String obtenerRol(){
        return "Por Horas";
    }

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+
                "Horas trabajadas: "+horasTrabajadas+
                "Valor por hora: "+valorHora;
    }

}
