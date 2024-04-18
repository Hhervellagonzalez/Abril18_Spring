package com.softtek.Abril18.Ejercicios;
import java.util.Optional;

public class Ejercicio1 {

    public void imprimirNombreUsuario(String nombreUsuario) {
        Optional<String> opt = Optional.ofNullable(nombreUsuario);
        String resultado = opt.filter(nu -> !nu.trim().isEmpty()).orElse("nombre de usuario inválido");

        System.out.println(resultado);
    }
}
