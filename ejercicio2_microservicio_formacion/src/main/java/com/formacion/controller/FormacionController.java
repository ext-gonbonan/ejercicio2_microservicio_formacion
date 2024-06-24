package com.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.model.Formacion;
import com.formacion.service.FormacionService;

@RestController
@RequestMapping("/formacion")
public class FormacionController {

    @Autowired
    FormacionService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> obtenerFormaciones() {
        return service.obtenerFormaciones();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> altaFormacion(@RequestBody Formacion formacion) {
        return service.altaFormacion(formacion);
    }
    
}
