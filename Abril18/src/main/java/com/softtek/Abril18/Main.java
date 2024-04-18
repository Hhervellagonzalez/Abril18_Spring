package com.softtek.Abril18;
import com.softtek.Abril18.Ejercicios.Ejercicio1;
import com.softtek.Abril18.Ejercicios.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 validacion = new Ejercicio1();
        validacion.imprimirNombreUsuario("usuario");

        Ejercicio2 valor = new Ejercicio2();
        List<String> lista = Arrays.asList("pan", "manzana", "");

        valor.imprimirposicion(lista, 0);
    }
}
