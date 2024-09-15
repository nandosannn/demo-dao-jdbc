package model.dao;

import model.dao.impl.SellerDaoJDBC;
import db.DB;
import model.dao.impl.DepartmentDaoJDBC;

public class FactoryDao {
    public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC();
	}
}
