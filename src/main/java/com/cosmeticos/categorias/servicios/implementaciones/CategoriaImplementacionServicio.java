package com.cosmeticos.categorias.servicios.implementaciones;

import com.cosmeticos.categorias.modelo.entidades.Categoria;
import com.cosmeticos.categorias.modelo.repositorios.CategoriaRepositorio;
import com.cosmeticos.categorias.servicios.CategoriaServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaImplementacionServicio implements CategoriaServicio {

    private final CategoriaRepositorio categoriaRepositorio;

    public CategoriaImplementacionServicio(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }

    @Override
    public List<Categoria> getTodosCategorias() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public List<Categoria> getTodosCategoriasManual() {
        return categoriaRepositorio.traerTodo();
    }

}
