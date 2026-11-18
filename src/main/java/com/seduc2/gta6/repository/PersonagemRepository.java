package com.seduc2.gta6.repository;

import com.seduc2.gta6.entity.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository <Personagem, Integer> {

}
