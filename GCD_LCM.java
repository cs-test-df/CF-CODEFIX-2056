import java.util.Scanner;

public class GCD_LCM {
	
	static long gcd(long x,long y){
		
		if(y==0)
	        return x;
	    return gcd(y,x%y);
	}
	static long lcm(long x, long y){
		
		        return (x/gcd(x,y))*y;
		    
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int array_size = scan.nextInt();
		System.out.println("Enter Elements of the Array of Size " + array_size);
		long[] ar = new long[array_size];
		for(int i =0 ; i<array_size;i++){
			ar[i] = scan.nextInt();
		}
		
		long gcd = ar[0];
		long lcm = ar[0];
		if(array_size<2){
			gcd =ar[0];
			lcm =ar[0];
		}
		else{
			for(int i =1;i<array_size;i++){
				// gcd
				if(gcd>ar[i]){
					gcd= gcd(gcd,ar[i]);
					lcm = lcm(lcm,ar[i]);
				}
				
				else{
					gcd=gcd(ar[i],gcd);
					lcm = lcm(ar[i],lcm);
				}
				
				
			}
		}
		
		System.out.println("GCD is: "+ gcd);
		System.out.println("LCM is: "+ lcm);
	}

}
