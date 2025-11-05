// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(lim*Math.random());
		int b = (int)(lim*Math.random());
		int c = (int)(lim*Math.random());
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a,b),c);
		int mid = a + b + c - max - min;
		System.out.println(a + " " + b + " " + c);
		System.out.println(max + " " + mid + " " + min);
	}
}
