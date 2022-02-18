package com.colegio.service;


import com.colegio.back.ColegioRepository;


import com.colegio.dto.Docente;
import com.colegio.dto.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Math.min;
import static java.lang.Math.max;
@RestController
public class ColegioController {
    @Autowired
    ColegioRepository colegioRepository;
    String matriz [][];

    @GetMapping(path="/consultaProfesor")
    public List<Profesor> getAllProfesores(@RequestParam(value = "profesor") int profesor){
        return colegioRepository.statistics(profesor);
    }

    @GetMapping(path="/consultaDocente")
    public List<Docente> getAllDocente(){
        return colegioRepository.docentes();
    }
}
