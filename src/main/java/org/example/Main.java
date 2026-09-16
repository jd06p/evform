package org.example;

//4. Polimorfismo y uso de colecciones
//• En la clase Main, declarar un arreglo o ArrayList<Empleado> para almacenar al menos 3 empleados, uno de cada tipo.
//• Recorrer la colección con un ciclo for o foreach para mostrar la información de cada objeto usando polimorfismo mediante mostrarInfo() y calcularSalario().
//• Demostrar que al llamar a los métodos abstractos se ejecuta la versión correspondiente de cada subclase

public class Main {
    public static void main(String[] args) {

        Empleado[]empleado={
                new EmpleadoPorHoras("Pepe", "3123", "56956936660", true, 23091, 300, 10),
                new EmpleadoAsalariado("Pedrito", "36513", "+569321393", true, 300.000, 600.000),
                new Gerente("Pablo", "43143", "+13021930", true, 500.000, 900.000, "DuocUC", 30.000)
        };
        for(Empleado empleados:empleado){
            empleados.mostrarInfo();
            empleados.obtenerRol();
            empleados.calcularSalario();
        }






    }
}
