package Simpsons;

public class simpsons_ {
	
	public static void main(String[] args){
		int n = 4;
		double a = 0;
		double b =2;		 
		double Ax = (b-a)/n;		
		//double[] set = new double[n+1];
		double output = 0;
		
		for(int i =0; i<=n;i++){
		double Xi =  a + (i*Ax);	
		if(i == 0 || i == n)	
			output += Fx(Xi);
			//set[i] = Fx(Xi);
		else if(i == 1 || i == n-1)
			output += 4*Fx(Xi);
			//set[i] = 4*(Fx(Xi));	
		else
			output += 2*Fx(Xi);
			//set[i] = 2*(Fx(Xi));
		
		//output += set[i];
		System.out.println(i + " " + output);
		}
		
		output = output * (Ax/3);
		
		System.out.println(output);
		
	}
	
	private static double Fx(double x){
		double Fx = Math.sqrt((1+4*(Math.pow(x,2)*Math.pow(Math.E, (-2*Math.pow(x,2))))));
		return Fx;
	}
	


}
