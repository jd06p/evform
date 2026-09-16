package org.example;


//Crear la interfaz Bonificable con los siguientes métodos:
//• double calcularBonificacion(); // retorna el monto extra
//• void asignarMeta(double meta); // asigna una meta de desempeño
//La interfaz debe ser implementada por la clase Gerente, y opcionalmente por otras clases si lo consideras pertinente.

public interface Bonificable {

    double calcularBonificacion();
    void asignarMeta(double meta);
}
