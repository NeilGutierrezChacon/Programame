package p468;

public class p468 {
	
	static java.util.Scanner in;

	public static void main(String[] args) {
		
		in=new java.util.Scanner(System.in);
		while(in.hasNext()) {
			casosDePrueba();
		}
		

	}
	static public boolean casosDePrueba() {
		int dias=in.nextInt();
		Long [] nums=new Long[dias];
		int mayor=0,menor=0;
		for(int i=0;i<dias;i++) {
			nums[i]=in.nextLong();
			if(nums[mayor]<nums[i]) {
				mayor=i;
			}
		}
		for(int i=1;i<mayor;i++) {
			if(nums[menor]>nums[i]) {
				menor=i;
			}
			
		}
		System.out.println(nums[mayor]-nums[menor]);
		
		return true;
	}
}
