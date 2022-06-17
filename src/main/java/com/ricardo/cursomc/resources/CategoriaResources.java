package com.ricardo.cursomc.resources;

import com.ricardo.cursomc.domain.Categoria;
import com.ricardo.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

    @Autowired
    private CategoriaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Categoria find(Integer id) {
//        Categoria obj = repository;
        Categoria obj = new Categoria();
        return obj;
    }


}
