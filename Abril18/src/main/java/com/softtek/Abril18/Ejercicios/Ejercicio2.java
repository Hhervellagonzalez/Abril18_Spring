package com.softtek.Abril18.Ejercicios;

import java.util.List;
import java.util.Optional;

public class Ejercicio2 {
    public void imprimirposicion(List<String> lista, int posicion) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("Valor predeterminado");
            return;
        }

        Optional<String> valor = (posicion >= 0 && posicion < lista.size())
                ? Optional.of(lista.get(posicion))
                : Optional.empty();

        System.out.println(valor.orElse("Productos"));
    }
}
