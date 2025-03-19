import java.io.Serializable;

public class Compra implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3126264257959598887L;
	private String name;
	private String des;
	
	
	public Compra() {
		
	}
	public Compra(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Compra [name=" + name + ", des=" + des + "]";
	}
	
	
}
