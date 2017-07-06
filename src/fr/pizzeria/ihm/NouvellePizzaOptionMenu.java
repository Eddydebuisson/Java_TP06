package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu {

	public NouvellePizzaOptionMenu(PizzaDao dao) {
		this.dao = dao;
		
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "2. Ajouter une nouvelle pizza";
	}

	@Override
	public boolean excute() {

		System.out.println("Tapez 99 pour annuler");
		System.out.println("Veuillez saisir le code");
		String code = Menu.sc.next();
		if (!code.equals("99")) {
			System.out.println("Veuillez saisir le nom (sans espace)");
			String nom = Menu.sc.next();
			System.out.println("Veuillez saisir le prix");
			String prix = Menu.sc.next();
			int i = 0;
			for (Pizza s : dao.FindAllPizza()) {
				if (s != null) {
					i++;
				}
			}
			dao.FindAllPizza()[i] = new Pizza(i, code, nom, Double.parseDouble(prix));
		}

		return true;
	}

}
