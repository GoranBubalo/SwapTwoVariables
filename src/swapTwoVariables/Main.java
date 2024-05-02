package swapTwoVariables;

public class Main {

	public static void main(String[] args) {

		String x = "wather";
		String y = "Kool-Aid";
		// Temporary value - > helps to switch values  between two variables 
		// The simplest way to swap two variables is to use a third variable as temporary storage
		String temp = null;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);

		// -------------------------------------------------------------
		System.out.print("\n");
		
		String g = "gora";
		String m = "pcela";
		String temporaryValue;
		
		temporaryValue = g;
		g = m;
		m = temporaryValue;
		System.out.println("g: " + g);
		System.out.println("m: " + m);
		
	}

}
