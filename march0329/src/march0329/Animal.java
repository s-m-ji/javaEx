package march0329;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		setName(name);
		setKinds(kinds);
	}
	
	public String toString() {
		return "저의 이름은 " + name 
				+ "이고, 종류는 " + kinds 
				+ "입니다. ";
	}
	
	public abstract void speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	
	
	
}
