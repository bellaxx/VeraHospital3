package data.h2;

import java.sql.Connection;

import data.ExampleDAO;

public class H2ExampleDAO implements ExampleDAO {

	Connection connection;
	
	public H2ExampleDAO()
	{
		connection = H2DAOFactory.getConnection();
	}
}
