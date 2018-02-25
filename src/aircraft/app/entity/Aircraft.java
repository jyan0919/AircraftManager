package aircraft.app.entity;

public class Aircraft {
	
	private int id;
	private Type type;
	private Size size;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String toString() {
		return "AC: " + id + ", " + type + ", " + size + " ";
	}

}
