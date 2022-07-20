package fr.exemple.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.exemple.dao.ProduitRepository;

@Controller
public class ProduitController {

	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value="/index")
	public String index() {
		return "produits";
	}
}
