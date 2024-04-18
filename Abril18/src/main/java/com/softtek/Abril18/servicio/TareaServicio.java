package com.softtek.Abril18.servicio;

import com.softtek.Abril18.modelo.Tarea;
import com.softtek.Abril18.repo.TareaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaServicio implements ITareaServicio{
    @Autowired
    private TareaRepo repo;

    public Tarea obtenerTarea(){
        return repo.obtenerTarea();
    }

    @Override
    public Tarea crearTarea(Tarea t) {
        t.setIdTarea(20);
        return t;
    }

    @Override
    public void eliminarTarea(int id) {
        repo.eliminarTarea(id);
    }
}
