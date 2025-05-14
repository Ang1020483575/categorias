package com.cosmeticos.categorias.modelo.repositorios;

import com.cosmeticos.categorias.modelo.entidades.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepositorio extends Repository<Categoria, Long> {
    List<Categoria> findAll();

    @Query(value = "select * from cosmeticos.categorias", nativeQuery = true)
    List<Categoria> traerTodo();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO categorias(nombre_categoria) VALUES (:nombre)", nativeQuery = true)
    void insertarCategoria(@Param("nombre") String nombre);
}

