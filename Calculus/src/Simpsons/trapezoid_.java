package Simpsons;

public class trapezoid_ {
	public static void main(String[] args){
		int n = 20;
		double a = 1;
		double b =2;		 
		double Ax = (b-a)/n;		
		double output = 0;
		
		for(int i =0; i<=n;i++){
		double Xi =  a + (i*Ax);	
		if(i == 0 || i == n)	
			output += Fx(Xi);	
		else
			output += 2*Fx(Xi);
		}
		
		output = output * (Ax/2);
		
		System.out.println(output);
		
	}
	
	private static double Fx(double x){
		double Fx = 1/x;
		return Fx;
	}
}
