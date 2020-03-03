package p472;

public class p472 {
	
	static java.util.Scanner in;

	public static void main(String[] args) {
		in=new java.util.Scanner(System.in);
		while(in.hasNext()) {
			
			casosDePrueba();
		}

	}
	
	
	public static boolean casosDePrueba() {
		String resp="APTA";
		int tramoSig,sobra=0;
		int max=in.nextInt();
		int tramos=in.nextInt();
		
		int tramoActual=in.nextInt();
		
		for(int i=1;i<tramos;i++) {
			tramoSig=in.nextInt();
			sobra+=tramoSig-tramoActual;
			if(sobra>max) {
				resp="NO APTA";
			}else {
				if(tramoActual>=tramoSig)sobra=0;
				tramoActual=tramoSig;
				
			}
		}
		System.out.println(resp);
	
		return true;
	}
}
























