package com.mateus.cursomc;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mateus.cursomc.domain.Categoria;
import com.mateus.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		
		categorias.add(new Categoria(null, "Informática"));
		categorias.add(new Categoria(null, "Escritório"));
		
		categoriaRepository.saveAll(categorias);
	}

	
	
}
