package com.cosmeticos.categorias.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorias")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorias")
    Long id_categorias;
    @Column(name = "nombre_categoria")
    String nombre_categoria;
}
