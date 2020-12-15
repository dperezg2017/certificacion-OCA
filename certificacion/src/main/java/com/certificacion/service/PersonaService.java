package com.certificacion.service;

import com.certificacion.entity.Persona;

public interface PersonaService {

    public void imprimirNombre(Persona persona);
    public boolean existePersona(Persona persona);
}
