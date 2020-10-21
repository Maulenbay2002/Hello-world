import java.util.Scanner;

class MyClass2 {
	public static void main (String[]args) {
	System.out.println(" This the continuation of Coffee1");
	Scanner t = new Scanner(System.in);
	int v = t.nextInt();
	if (v<1000) {							//nested if-else
	if (v > 15) {
		System.out.println("Chitty Chitty Bang Bang !!!!!!!");
		    }
	else {
		System.out.print("How's Swift for windows ?");
	     }

}
	else {
		System.out.print("Get the hell out of here!!!!!!!");
	}	
	}
}