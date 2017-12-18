package tw.edu.cyut.MyJava;

public class Cyut2 {

	public static void main(String[] args) {
		double value = Math.random();	// 0.0 <= value < 1.0
		int score = (int)(value * 49) +1;
		System.out.println(score);
		System.out.println(Math.PI);
		
		System.out.println(Bike.count);
		Bike b1 = new Bike(2);
		Bike b2 = new Bike(3);
		Bike b3 = new Bike(4);
		System.out.println(b1.speed);
		System.out.println(b2.speed);
		System.out.println(b3.speed);
		System.out.println(Bike.count);
		System.out.println(b2.count);
		
	}

}
class Bike {
	double speed;
	static int count;
	Bike(double d){
		speed = d;
		count++;
	}
}
