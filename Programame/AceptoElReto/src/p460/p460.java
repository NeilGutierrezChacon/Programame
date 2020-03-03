package p460;


public class p460 {

	 static java.util.Scanner in;

	 public static void main(String[] args) {
		 	System.out.println(Math.sqrt(10));
	        in= new java.util.Scanner(System.in);
	        while(in.hasNext()) {
	        	casoDePrueba();
	        }
	   }
	 
	 public static boolean casoDePrueba() {
		 long num = in.nextInt();
		 double res =0,cont = 0,digito;
		 if (num < 10 ) res= num;
		 else{
			 while(num >0) {
				 digito = num %10;
				 System.out.println("el ultimo digito de "+num+" es "+ digito);
				 num /= 10;
				 cont+=2;
				 res= res+digito*Math.pow(10,cont);
			 
			 }
			 res/=100;
		 }
			 
		System.out.println((int)res);
		 return true; 	 
	 }
}
