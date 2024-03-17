package ies.puerto.modelo.impl;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="personajes")
public class PersonaList {
    @ElementList(inline=true)
    List<Persona> personas;

    public PersonaList(){}
    
    public PersonaList(List<Persona> personas) {
        this.personas = personas;
    } 

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
