package org.example;

//protected String nombre
//• protected String idEmpleado (cédula o código único)
//• protected String telefono
//• protected boolean activo (indica si el empleado está en la empresa)
//• protected double salarioBase

public abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase) {
        this.nombre=nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;
        this.salarioBase = salarioBase;
    }

    //abstract double calcularSalario(); // calcula el salario según las reglas de cada tipo
    //• abstract String obtenerRol(); // devuelve "Por Horas", "Asalariado", "Gerente

    public abstract double calcularSalario();
    public abstract String obtenerRol();

    //void activar() y void desactivar() para cambiar el estado activo.
    //• String mostrarInfo() que retorne una cadena con nombre, ID, teléfono, rol, activo y salario calculado.
    //• void asignarTelefono(String telefono) como setter con validación simple

    public void activar(){
        this.activo = true;
    }

    public void desactivar(){
        this.activo = false;
    }

    public String mostrarInfo(){
        return
                "Nombre "+nombre+
                        "ID "+idEmpleado+
                        "Telefono "+telefono+
                        "Activo "+activo+
                        "Salario base "+calcularSalario();
    }

    public void asignarTelefono(String telefono){
        if(telefono != null && !telefono.isBlank()){
            this.telefono = telefono;
        }
    }

}
