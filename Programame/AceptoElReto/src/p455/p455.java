package p455;

public class p455 {

	static java.util.Scanner in;

	 public static void main(String[] args) {

	        in= new java.util.Scanner(System.in);
	        int casos=in.nextInt();
	        for(int i=0;i<casos;i++) {
	        	casoDePrueba();
	        }
	   }
	 
	 public static boolean casoDePrueba() {
		 
		 int num2=in.nextInt();
		 int num1=10000;
		 
		 
		 while(num1 != num2)
	            if(num1>num2)
	                num1= num1-num2;
	            else
	                num2= num2 -num1;
	        
	        System.out.println(10000/num1);
		 
		 return true;
		 
		 
		 
	 }

}
