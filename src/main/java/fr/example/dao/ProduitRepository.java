package fr.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.example.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
	
	

}
