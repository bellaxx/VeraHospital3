package businesslogic;

import java.util.Collection;

import data.DAOFactory;
import data.ExampleDAO;
import data.DAOFactory.Backend;


public class ExampleManager {
	ExampleDAO exampleDAO;
	
	public ExampleManager() {
		super();
		//exampleDAO = DAOFactory.getDAOFactory(Backend.H2).getExampleDAO();
	}
	
	// add methods for managing data 
}
