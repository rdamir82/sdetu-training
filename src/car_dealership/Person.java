package car_dealership;

public class Person {

	private String name;
	private String addres;

	public Person(String name, String addres) {
		this.setName(name);
		this.setAddres(addres);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

}
