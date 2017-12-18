package tw.edu.cyut.MyJava;

public class Cyut2 {

	public static void main(String[] args) {
		double value = Math.random();	// 0.0 <= value < 1.0
		int score = (int)(value * 49) +1;
		System.out.println(score);
		System.out.println(Math.PI);
	}

}
