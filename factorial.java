package assignment_1;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.println("The factorial of "+n+" is "+factorial);
	}

}
