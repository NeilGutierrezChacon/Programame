package p457;

public class p457 {

	static java.util.Scanner in;

	 public static void main(String[] args) {
	        in= new java.util.Scanner(System.in);
	        while(casoDePrueba()) {
	        	
	        }
	   }
	 
	 public static boolean casoDePrueba() {
		 
		 int casos=in.nextInt();
		 if(casos==0) return false;
		 
		 
		 long num=1;
		 long numAux;
		 in.nextInt();
		 for(int i=1;i<casos;i++) {
			 numAux=in.nextInt();
			 System.out.println("entrada:"+numAux);
			 if(numAux>casos-i) {
				 num++;
			 }
		 }
		 
//		 boolean reset=true;
//		 long resp=num;
//		 while(reset) {
//			 
//			 if(num>=casos) {
//				 reset=false;
//			 }else {
//				 if(numeros[(int) num]>casos-(num+1)) {
//					
//					 num++;
//					 resp=num;
//					 
//				 }else {
//					 num=numeros[(int) num]+num+1;
//				 }
//			 }
//			 
//			 
//		 }
		 System.out.println(num);
		 
		 
		 return true; 	 
	 }

}
