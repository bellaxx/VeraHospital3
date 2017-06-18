package data.h2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import businesslogic.UserManager;
import data.UserArzt;
import data.UserDAO;

public class H2UserDAO implements UserDAO {
	Connection connection;

	public H2UserDAO() {
		connection = H2DAOFactory.getConnection();
	}

	
}
