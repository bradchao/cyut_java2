package tw.edu.cyut.MyJava;

public class TWId {
	private String id;
	
	public TWId() {
		this((int)(Math.random()*2)==1?true:false,(int)(Math.random()*26));
	}
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
	public TWId(int area) {
		this((int)(Math.random()*2)==1?true:false , area);
	}
	public TWId(boolean isMale, int area) {
		
	}
	
	private TWId(String id) {
		this.id = id;
	}
	
	static boolean isRightTWId(String id) {
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		String s12 = id.substring(0, 1);
		int n12 = letters.indexOf(s12) + 10;
		System.out.println(n12);
		
		return true;
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
