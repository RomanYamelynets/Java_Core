package ua.lviv.lgs;

import java.util.Objects;

public class Animal {
	private String typeAnimal;
	private String nameAnimal;

	public Animal(String typeAnimal, String nameAnimal) {
		super();
		this.typeAnimal = typeAnimal;
		this.nameAnimal = nameAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	@Override
	public String toString() {
		return "Animal [typeAnimal=" + typeAnimal + ", nameAnimal=" + nameAnimal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameAnimal, typeAnimal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nameAnimal, other.nameAnimal) && Objects.equals(typeAnimal, other.typeAnimal);
	}

}
