package com.ricardo.cursomc.service;

import com.ricardo.cursomc.domain.Categoria;
import com.ricardo.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;


}
