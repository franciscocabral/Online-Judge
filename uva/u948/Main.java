package u948;

public class Main {

	public static int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
	public static long fibase(int number){
		int x = number;
		char[] tmp = new char[14];
		for(int i=13; i>0; i--){
			if(x >= fib[i]){
				x =fib[i];
				tmp[i] = 1;
			}else{
				tmp[i] = 0;
			}
		}
		Long result = new Long(tmp.toString()); 
		return result;
		
	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 501; i++)
			System.out.println(fibase(i));
	}

}
