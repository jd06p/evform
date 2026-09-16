package org.example;

//Gerente (hereda de EmpleadoAsalariado e implementa Bonificable)
//• Atributos adicionales: String departamento y double bonificacionAnual.
//• Implementar calcularBonificacion(): si meta alcanzada, bonificación = sueldoMensual * 0.2; en caso contrario, 0.
//• Implementar asignarMeta(double meta) almacenando el valor en un atributo double metaDesempeno.
//• Sobrescribir calcularSalario() → sueldoMensual + calcularBonificacion().
//• Sobrescribir obtenerRol() → "Gerente".
//• Método adicional: void asignarDepartamento(String depto)

public class Gerente extends Empleado implements Bonificable{
    private String departamento;
    private double bonificacionAnual;

    public Gerente(String idEmpleado, String telefono, boolean activo, double salarioBase, String departamento, double bonificacionAnual){
        super(idEmpleado, telefono,activo,salarioBase);
        this.departamento=departamento;
        this.bonificacionAnual=bonificacionAnual;
    }

    public double calcularBonificacion(){
        bonificacionAnual=salarioBase*0.2;
        return bonificacionAnual;
    }

    public void asignarMeta(double meta){
    }

    @Override
    public double calcularSalario(){
        return salarioBase+calcularBonificacion();
    }

    @Override
    public String obtenerRol(){
        return "Gerente";
    }

    public void asignarDepartamento(String depto){
        this.departamento=depto;
    }
}
