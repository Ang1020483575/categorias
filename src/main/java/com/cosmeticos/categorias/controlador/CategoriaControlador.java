package com.cosmeticos.categorias.controlador;

import com.cosmeticos.categorias.modelo.entidades.Categoria;
import com.cosmeticos.categorias.servicios.CategoriaServicio;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    @GetMapping("/categorias")
    public List<Categoria> getCategorias(){
        return categoriaServicio.getTodosCategorias();
    }

    @GetMapping("/categoriasManual")
    public List<Categoria> getCategoriasManual(){
        return categoriaServicio.getTodosCategoriasManual();
    }

    @PostMapping("/insertarCategoria")
    public  String insertarCategoria(@RequestBody Categoria categoria) {
        categoriaServicio.insertarCategoria(categoria);
        return "Categoria insertada correctamente";
    }

    @PutMapping("/actualizarCategoria")
    public String actualizarCategoria(@RequestBody Categoria categoria){
        categoriaServicio.actualizarCategoria(categoria);
        return "Categoria actualizada correctamente";
    }

}

