package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;

public class SupprimerPizza extends OptionMenu {

	public SupprimerPizza(PizzaDao dao) {
		this.dao = dao;
	}

	@Override
	public String getLibelle() {
		return "4. Supprimer une pizza";
	}

	@Override
	public boolean excute() {

		System.out.println("Tapez 99 pour annuler");
		System.out.println("Veuillez choisir la pizzza à modifier");
		String pizza = Menu.sc.next();
		if (!pizza.equals("99")) {
			int i = 0;
			while (!dao.FindAllPizza()[i].getCode().equals(pizza)) {
				i++;
			}

			while (dao.FindAllPizza()[i] != null) {
				if (dao.FindAllPizza()[i + 1] != null) {
					dao.FindAllPizza()[i].setId(dao.FindAllPizza()[i + 1].getId());
					;
					dao.FindAllPizza()[i].setCode(dao.FindAllPizza()[i + 1].getCode());
					;
					dao.FindAllPizza()[i].setNom(dao.FindAllPizza()[i + 1].getNom());
					;
					dao.FindAllPizza()[i].setPrix(dao.FindAllPizza()[i + 1].getPrix());
					;
				} else {
					dao.FindAllPizza()[i] = null;
				}
				i++;
			}
		}

		return true;
	}

}
