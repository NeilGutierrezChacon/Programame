package p456;

public class p456 {

	 static java.util.Scanner in;

	 public static void main(String[] args) {

	        in= new java.util.Scanner(System.in);
	        long  casos=in.nextInt();
	        while(casos !=0) {
	        	casoDePrueba(casos);
		        casos=in.nextInt();

	        }
	   }
	 
	 public static boolean casoDePrueba(long  casos) {
		long  maxpos1 =-1,maxpos2=-1,maxneg1=1,maxneg2=1,cero=0,caso;
		long 	 total1=-1,total2=-1,total3= 1;
		boolean lleno = false;
		 for(int i = 0; i < casos;i++) {
			 caso=in.nextInt();
			 if(caso >= 0) {
				 if(caso > maxpos1) {
					maxpos2 = maxpos1;
					maxpos1 = caso;
				 }
				 else if(caso > maxpos2) maxpos2 = caso;
			 }else if ( caso < 0) {
				 if(caso < maxneg1) {
					 maxneg2 = maxneg1;
					 maxneg1 = caso;
					}
					 else if(caso < maxneg2) maxneg2 = caso;
				 
			 }else cero++;
		 }

		 if(maxpos1 >-1 && maxpos2 >-1) {
			 total1 = maxpos1 * maxpos2;
			 lleno = true;
		 }
		 if (maxneg1 < 1 && maxneg2 < 1) {
			 total2 = maxneg1 * maxneg2;
			 lleno = true;
		 }
		 if(!lleno)total3 = maxpos1*maxneg1;
		 if(lleno)System.out.println((total1>total2)?total1:total2);
		 else System.out.println(total3);
		 return true; 	 
	 }
}
