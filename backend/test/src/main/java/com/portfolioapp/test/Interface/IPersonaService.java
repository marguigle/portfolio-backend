
package com.portfolioapp.test.Interface;

import com.portfolioapp.test.entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de persona
    
    public List<Persona> getPersona();
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por id
    public void deletPersona( Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
   
    
    
}
