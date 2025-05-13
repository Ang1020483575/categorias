package com.cosmeticos.categorias.modelo.repositorios;

import com.cosmeticos.categorias.modelo.entidades.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CategoriaRepositorio extends Repository<Categoria, Long> {
    List<Categoria> findAll();

    @Query(value = "select * from cosmeticos.categorias", nativeQuery = true)
    List<Categoria> traerTodo();
}
