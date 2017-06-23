package data.h2;

import java.sql.Connection;
import java.util.List;

import data.Arzt;
import data.ArztDAO;

public class H2ArztDAO implements ArztDAO {
	Connection connection;

	public H2ArztDAO() {
		connection = H2DAOFactory.getConnection();
	}

	@Override
	public boolean getArzt(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addArzt(Arzt arzt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ArztExists(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteArzt(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Arzt findArzt(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arzt findArzt(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arzt findArzt(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arzt findArztByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arzt> searchArzt(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arzt> findArzts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateArzt(Arzt arzt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getArzt(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addArzt(String name, String fachgebiet, String buero, String email, String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean arztExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
