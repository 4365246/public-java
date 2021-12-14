package week02;

public class Flower {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++)
		{
			int n1=i%10;
			int n2=(i/10)%10;
			int n3=i/100;
			if(i==Math.pow(n1, 3)+Math.pow(n2, 3)+Math.pow(n3, 3)) {
				System.out.println(i+"\t");
			}
		}
	}

}
