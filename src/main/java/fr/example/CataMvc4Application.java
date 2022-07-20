package fr.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.example.dao.ProduitRepository;
import fr.example.entities.Produit;



@SpringBootApplication
public class CataMvc4Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CataMvc4Application.class, args);
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("LX 4352", 670, 90));
		produitRepository.save(new Produit("Ord HO 432", 670, 90));
		produitRepository.save(new Produit("Imprimante Epson", 450, 12));
		produitRepository.save(new Produit("Imp HP 5400", 45, 10));
		
		produitRepository.save(new Produit("PC Gamer", 2515, 28));
		produitRepository.save(new Produit("PC de Bureau", 549, 125));
		produitRepository.save(new Produit("Casque VR", 450, 12));
		produitRepository.save(new Produit("Souris Gaming", 120, 150));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}

}
