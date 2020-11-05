package com.soctest.agendarExames.service;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soctest.agendarExames.model.Exame;
import com.soctest.agendarExames.repository.ExameRepository;

@Service
public class ExameServiceImpl implements ExameService{

	//injeção de dependencia
	@Autowired
	private ExameRepository exameRepository ;
	@Override
	public List< Exame > getAllExames() {
		return exameRepository.findAll();
	}
	
	//Metodo para salvar exame
	@Override
	public void salvarExame(Exame exame) {
		this.exameRepository.save(exame);
		
	}

	//valida se id do exame existe para poder fazer o update
	@Override
	public Exame getExameById(long id) {
		Optional<Exame> optional = exameRepository.findById(id);
		Exame exame = null;
		
		if(optional.isPresent()) {
			exame = optional.get();
		}else {
			throw new RuntimeException("Exame não Encontrado pelo Id::" + id);
		}
		return exame;
	}

	@Override
	public void deleteExameById(long id) {
		this.exameRepository.deleteById(id);
	}

	
	

    

}
