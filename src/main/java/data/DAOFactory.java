package data;

import data.h2.H2DAOFactory;

public abstract class DAOFactory {
	// List of DAO types supported by the factory
	public enum Backend
	{
		H2
	}
		
	// There will be a method for each DAO that can be
	// created. The concrete factories will have to
	// implement these methods.
	public abstract UserDAO getUserDAO();
	public abstract ExampleDAO getExampleDAO1();
	public static DAOFactory getDAOFactory(Backend whichFactory) {
		switch (whichFactory) {
		case H2:
			return new H2DAOFactory();
		default:
			return null;
		}
	}

	public ExampleDAO getExampleDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}