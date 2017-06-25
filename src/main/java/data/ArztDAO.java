package data;

import java.util.List;

public interface ArztDAO {

	public boolean getArzt(String email);

	public void addArzt(Arzt arzt);

	public boolean ArztExists(int id);

	public void deleteArzt(int id);

	public Arzt findArzt(String email);

	public Arzt findArzt(int id);

	public Arzt findArzt(String name, String password);

	public Arzt findArztByName(String name);

	public List<Arzt> searchArzt(String name);

	public List<Arzt> findArzts();

	public void updateArzt(Arzt arzt);

	public boolean getArzt(String name, String password);

	public void addArzt(String name, String fachgebiet, String buero, String email, String passwort);

	public boolean arztExists(String email);

}
