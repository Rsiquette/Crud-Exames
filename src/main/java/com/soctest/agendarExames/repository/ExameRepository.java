package com.soctest.agendarExames.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soctest.agendarExames.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

	//Exame findFirstByOrderByNomeAsc();

	
}
