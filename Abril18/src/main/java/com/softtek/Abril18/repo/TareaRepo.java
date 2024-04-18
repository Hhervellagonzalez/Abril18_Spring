package com.softtek.Abril18.repo;

import com.softtek.Abril18.modelo.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public class TareaRepo implements ITareaRepo{
    public Tarea obtenerTarea(){
        return new Tarea(100, "Tarea numero 100");
    }

    @Override
    public Tarea crearTarea(Tarea t) {
        t.setIdTarea(1);
        return t;
    }

    @Override
    public void eliminarTarea(int id) {

    }
}
