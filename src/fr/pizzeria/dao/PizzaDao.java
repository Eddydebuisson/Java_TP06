package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDao {

	private Pizza[] listepizza = new Pizza[100];
	
	
	public  PizzaDao() {
		
		listepizza[0] = new Pizza ( 0, "PEP", "Pépéroni", 12.50 );
		listepizza[1] = new Pizza ( 1, "MAR", "Margherita", 14.00 );
		listepizza[2] = new Pizza ( 2, "REI", "La Reine", 11.50 );
		listepizza[3] = new Pizza ( 3, "FRO", "La 4 fromages", 12.00 );
		listepizza[4] = new Pizza ( 4, "CAN", "La cannibale", 12.50 );
		listepizza[5] = new Pizza ( 5, "SAV", "La savoyarde", 13.00 );
		listepizza[6] = new Pizza ( 6, "ORI", "L'orientale", 13.50 );
		listepizza[7] = new Pizza ( 7, "IND", "L'indienne", 14.00 );
	}
	
	public Pizza[] FindAllPizza(){
		
		return listepizza;
	}
	
}
