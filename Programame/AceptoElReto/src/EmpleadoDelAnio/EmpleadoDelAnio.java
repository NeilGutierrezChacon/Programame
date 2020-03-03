package EmpleadoDelAnio;

public class EmpleadoDelAnio {
	
	static java.util.Scanner in;

	 public static void main(String[] args) {

	        in= new java.util.Scanner(System.in);
	        
	        while(casoDePrueba());
	   }
	 
	 public static boolean casoDePrueba() {
		 int casos=in.nextInt();
		 int [] media = new int [casos];
		 int nPatentes=0;
		 
		 for(int i=0;i<casos;i++) {
			 media[i]=in.nextInt();
		 }
		 
		 for(int i=0;i<casos;i++) {
			 int resp=(media[i]*(i+1))-nPatentes;
			 nPatentes=(media[i]*(i+1));
			 System.out.println(resp);
		 }
		 
		 return true;
	 }
	

}



