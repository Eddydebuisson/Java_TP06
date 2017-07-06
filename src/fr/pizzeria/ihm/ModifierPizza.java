package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.model.Pizza;



public class ModifierPizza extends OptionMenu{

	public ModifierPizza(PizzaDao dao) {
		this.dao =dao;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "3. Mettre a jour une pizza";
	}

	@Override
	public boolean excute() {

		System.out.println("Tapez 99 pour annuler");
		System.out.println("Veuillez saisir le code de la Pizza à modifier");
		String b = Menu.sc.next();
		System.out.println("Veuillez saisir le code");
		String code = Menu.sc.next();
		if (!code.equals("99")) {
			System.out.println("Veuillez saisir le nom (sans espace)");
			String nom = Menu.sc.next();
			System.out.println("Veuillez saisir le prix");
			String prix = Menu.sc.next();
			int i = 0;
			while (!dao.FindAllPizza()[i].getCode().equals(b)) {

				i++;

			}
			if (i != 100) {
				dao.FindAllPizza()[i] = new Pizza( i, code, nom, Double.parseDouble(prix));
			} else {
				System.out.println("404 PIZZA NOT FOUND");
			}

		}
		
		
		return true;
	}

}
