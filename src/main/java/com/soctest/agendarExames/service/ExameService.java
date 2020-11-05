package com.soctest.agendarExames.service;

import java.util.List;


import com.soctest.agendarExames.model.Exame;

public interface ExameService {
	
	//gera lista de exames
	List< Exame > getAllExames();
	void salvarExame(Exame exame) ;
	
	Exame getExameById(long id);
	
	void deleteExameById(long id);
	//List<Exame> findAll();
	
	
	

	
	
}
