import java.util.Random;

public class TestDemo {
	public int addPositive(int a,int b) {
		
		if(a>0 && b>0) {
			return a+b;
		}else {
			throw new IllegalArgumentException("Both the parameters must be positive!");
		}
	}
	
	public int randomNumberSquared() {
		
		int a =getRandomInt();
		
		return a*a;
	}
	
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}

}
