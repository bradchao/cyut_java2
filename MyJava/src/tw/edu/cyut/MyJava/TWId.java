package tw.edu.cyut.MyJava;

public class TWId {
	private String id;
	
	public TWId() {
		
	}
	public TWId(boolean isMale) {
		
	}
	public TWId(int area) {
		
	}
	public TWId(boolean isMale, int area) {
		
	}
	
	private TWId(String id) {
		this.id = id;
	}
	
	static TWId createTWIdByString(String id) {
		if (id.length()<10) {
			return null;
		}else {
			return new TWId(id);
		}
	}
	
	public String getId() {return id;}
	
	
}
