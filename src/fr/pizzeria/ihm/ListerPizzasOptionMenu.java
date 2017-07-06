package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu{
	
	public ListerPizzasOptionMenu(PizzaDao dao) {
		this.dao = dao;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "1. lister les pizza";
	}

	@Override
	public boolean excute() {
		int i = 0;
		for (Pizza s : dao.FindAllPizza() ) {
			if (s != null ) {
				System.out.println(dao.FindAllPizza()[i].getCode() + " -> " + dao.FindAllPizza()[i].getNom() + " (" + dao.FindAllPizza()[i].getPrix() + ")");
				i++;
			}
		}
		
		return true;
	}

	
	
	
}
