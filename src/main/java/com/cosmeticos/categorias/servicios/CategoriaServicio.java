package com.cosmeticos.categorias.servicios;

import com.cosmeticos.categorias.modelo.entidades.Categoria;
import java.util.List;

public interface CategoriaServicio {
    List<Categoria> getTodosCategorias();
    List<Categoria> getTodosCategoriasManual();
    void insertarCategoria(Categoria cat);
}
