package tw.edu.cyut.MyJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cyut2 {

	public static void main(String[] args) {
		double value = Math.random();	// 0.0 <= value < 1.0
		int score = (int)(value * 49) +1;
		System.out.println(score);
		System.out.println(Math.PI);
		
		c1.sayYa();
		c1.sayYa("Cyut");
		c1.sayYa("ICE");
		
		int z = c2.fxy(3, 4);
		System.out.println(z);
		
	}

}

class c1 {
	static void sayYa() {
		System.out.println("Ya");
	}
	static void sayYa(String name) {
		System.out.println("Ya, " +name);
	}
}
class c2 {
	static int fxy(int x, int y) {
		int result = 2*x + y;
		return result;
	}
}

