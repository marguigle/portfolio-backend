
package com.portfolioapp.test.repository;

import com.portfolioapp.test.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
