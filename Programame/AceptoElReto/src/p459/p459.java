package p459;
public class p459 {

	 static java.util.Scanner in;

	 public static void main(String[] args) {
			in= new java.util.Scanner(System.in);
	        while( in.hasNext()) {
	        	casoDePrueba();
	        }
	   }
	 
	 public static boolean casoDePrueba(){
		int m = in.nextInt();
		int n = in.nextInt();
		in.nextLine();
		String linea;

		int [][] mat = new int[n][m];
		for (int i = 0; i < n; i++) {
	      linea = in.nextLine();
          for (int j = 0; j < m; j++) {
	          if (linea.charAt(j) == '#') {
	        	  mat[i][j] = 1;
	            }
	          }
        	}

		int total = 0;
		int local = 0;
		for(int i= 0; i < n; ++i) {
			for(int j = 0; j <m; ++j) {
				if (mat[i][j] == 1) {
					if(i > 0 && mat[i-1][j] == 1) local++;
					if(i < n-1  && mat[i+1][j]==1)local++;
					if(j > 0 && mat[i][j-1] == 1) local++;
					if(j < m-1  && mat[i][j+1]==1)local++;
					if(local > 2)total += local;
					local = 0;
				}
				
			}	
		}
	System.out.println(total);
	return true; 	 
	}
}
