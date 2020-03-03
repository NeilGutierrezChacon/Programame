package p467;

public class p467 {
	
	 static java.util.Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new java.util.Scanner(System.in);
		int casos=Integer.parseInt(in.nextLine());
		for(int i=0;i<casos;i++) {
			casosDePrueba();
		}
	}

	public static void casosDePrueba() {
		// TODO Auto-generated method stub
		
		String linea=in.nextLine();
		String [] palabras;
		
		palabras=linea.split(" ");
		if(palabras[0].equalsIgnoreCase(palabras[2])){
			System.out.println("TAUTOLOGIA");
		}else {
			System.out.println("NO TAUTOLOGIA");
		}
		
	}

}
