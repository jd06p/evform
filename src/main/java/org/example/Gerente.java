package org.example;

//Gerente (hereda de EmpleadoAsalariado e implementa Bonificable)
//• Atributos adicionales: String departamento y double bonificacionAnual.
//• Implementar calcularBonificacion(): si meta alcanzada, bonificación = sueldoMensual * 0.2; en caso contrario, 0.
//• Implementar asignarMeta(double meta) almacenando el valor en un atributo double metaDesempeno.
//• Sobrescribir calcularSalario() → sueldoMensual + calcularBonificacion().
//• Sobrescribir obtenerRol() → "Gerente".
//• Método adicional: void asignarDepartamento(String depto)

public class Gerente extends EmpleadoAsalariado implements Bonificable{
    private String departamento;
    private double bonificacionAnual;
    private double metaDesempeno;

    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual, String departamento, double bonificacionAnual, double metaDesempeno){
        super(nombre, idEmpleado, telefono,activo,salarioBase, sueldoMensual);
        this.departamento=departamento;
        this.bonificacionAnual=bonificacionAnual;
        this.metaDesempeno=metaDesempeno;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }

    public double calcularBonificacion(){
        bonificacionAnual=getSueldoMensual()*0.2;
        return bonificacionAnual;
    }

    public double getMetaDesempeno(){
        return metaDesempeno;
    }

    public void setMetaDesempeno(double metaDesempeno){
        if(metaDesempeno>=100){
            return sueldoMensual*0.2;
        }else{
            return 0;
        }
    }


    public void asignarMeta(double meta){
        this.metaDesempeno=meta;
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
