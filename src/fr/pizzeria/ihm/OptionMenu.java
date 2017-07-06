package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;

public abstract class OptionMenu {
	public PizzaDao dao;

	public abstract String getLibelle();

	public abstract boolean excute();
	
	public PizzaDao getDao() {
		return dao;
	}

	public void setDao(PizzaDao dao) {
		this.dao = dao;
	}


}
