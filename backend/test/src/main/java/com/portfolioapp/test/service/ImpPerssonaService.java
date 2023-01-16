
package com.portfolioapp.test.service;

import com.portfolioapp.test.Interface.IPersonaService;
import com.portfolioapp.test.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPerssonaService implements IPersonaService{
 @Autowired IpersonaRepository ipersonarepository;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
        return persona;
    }
    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
                }
    @Override
    public void deletPersona(Long id) {
        ipersonarepository.deleteById(id); 
    }

    @Override
    public Persona findPersona(Long id) {
    return ipersonarepository.findById(id).orElse(null);
    }
    
}
