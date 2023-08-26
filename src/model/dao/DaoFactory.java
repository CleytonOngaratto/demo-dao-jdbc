package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

// Fábrica de DAO. Aqui tem operações estáticas
// para instanciar os DAOs

public class DaoFactory {

	// Esse é um macete pra não excpor a implementação
	// Apenas a interface.
	// É também uma forma de fazer uma injeção de dependência,
	// sem explicitar a implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
