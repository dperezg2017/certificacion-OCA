package com.certificacion.service;

import com.certificacion.entity.Persona;

public class PersonaServiceImpl implements PersonaService {

    @Override
    public void imprimirNombre(Persona persona) {
        System.out.print(persona);
    }

    @Override
    public boolean existePersona(Persona persona) {
        if(persona==null) {
            return false;
        }
        return true;
    }
}
